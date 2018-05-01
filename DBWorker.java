package com.ustgloacl.caremanager.ustcareadmin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.imageio.spi.ServiceRegistry;
import javax.xml.bind.JAXBElement;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.click4care.thinkhealth._6_5.dto.AnyItemsType;
import com.ustglobal.caremanager.ustcareadmin.model.BatchLoaderModel;
import com.ustglobal.caremanager.ustcareadmin.model.ErrorToMysqlModel;
import com.ustglobal.caremanager.ustcareadmin.model.SuccessFail;

public class DBWorker {
	private static SessionFactory factory;
	private static ServiceRegistry serviceRegistry;

	static {
		
		   try {
				StandardServiceRegistry standardRegistry = 
			       new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
				Metadata metaData = 
			        new MetadataSources(standardRegistry).getMetadataBuilder().build();
				factory = metaData.getSessionFactoryBuilder().build();
			   } catch (Throwable th) {
				System.err.println("Enitial SessionFactory creation failed" + th);
				throw new ExceptionInInitializerError(th);
			  }
			}

	DBWorker() {
		
	}


	public SuccessFail DeBatchAndProcessSingle(BatchLoaderModel batch, String fileName, AnyItemsType ai, SuccessFail results) {

		//DBWorker db = new DBWorker();
		
		
		System.out.println(ai.getAny().size());
		int z = 0;
		int i = 1;
		for (i = 1; i < ai.getAny().size(); i++) {
			JAXBElement o = (JAXBElement) ai.getAny().get(i);
			try {
			 InitIS.port.addOrUpdate(o.getValue());
				i++;
			}
			catch(Exception e) {
			addError(batch, fileName, new Date(), o.getValue().toString(), e.getMessage());
			z++;
			}
		}
		int initSuccess = results.getSuccessfulRecords();
		results.setSuccessfulRecords(i + initSuccess);
		results.setFailedRecords(z);
		return results;

	}

	public BatchLoaderModel AddBatchLogging(Date startDate, Date endDate, String file, int success, int failed, int total) {
		Session session = factory.openSession();
		BatchLoaderModel batch = new BatchLoaderModel();
		Transaction tx = null;
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String start = sdf.format(startDate);
		String end = sdf.format(endDate);

		try {
			tx = session.beginTransaction();
			batch = new BatchLoaderModel();
			batch.setStartDate(start);
			batch.setEndDate(end);
			batch.setFileName(file);
			batch.setSuccessfulRecords(success);
			batch.setFailedRecords(failed);
			batch.setTotalRecords(total);
			session.save(batch);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return batch;
	}
	
	
	public Integer addError(BatchLoaderModel batch, String source, Date loadTime, String sourceRecord, String errorText) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer errorId = null;
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentTime = sdf.format(loadTime);

		try {
			tx = session.beginTransaction();
			ErrorToMysqlModel error = new ErrorToMysqlModel();
			error.setSource(source);
			error.setLoadTime(currentTime);
			error.setSourceRecord(sourceRecord);
			error.setErrorText(errorText);
			error.setModel(batch);
			errorId = (Integer) session.save(error);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return errorId;
	}
	
	public void Close() {
		factory.close();
		
	}

}
