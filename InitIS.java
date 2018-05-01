package com.ustgloacl.caremanager.ustcareadmin;

import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.HandlerResolver;

import com.click4care.wsdl._6_5.integrationservices.IntegrationServicesPortType;
import com.click4care.wsdl._6_5.integrationservices.IntegrationServicesService;
import com.click4care.wsdl._6_5.integrationservices.TaskManagementServicesPortType;
import com.ustglobal.base.Environment;
import com.ustglobal.base.TESTING;

public class InitIS {
	protected static TaskManagementServicesPortType taskPort = null;
	public static IntegrationServicesPortType port = null;
	protected static HandlerResolver handler = null;

	static {
		Environment e = new Environment();
		IntegrationServicesService service = null;
		Authenticator.setDefault(new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(Environment.getCmusr(), Environment.getCmpwd().toCharArray());
			}
		});
		try {
			service = new IntegrationServicesService(new URL(Environment.getIsurl()),
					new QName(Environment.getQname1(), Environment.getQname2()));
		} catch (MalformedURLException ex) {
			Logger.getLogger(TESTING.class.getName()).log(Level.SEVERE, null, ex);
		}
		handler = service.getHandlerResolver();
		port = service.getIntegrationServicesPort();

		((BindingProvider) port).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Environment.getCmusr());
		((BindingProvider) port).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Environment.getCmpwd());

		// Wait up to 5 minutes (300,000 ms) for a response
		// TODO: Determine if these timeout settings help
		((BindingProvider) port).getRequestContext().put("com.sun.xml.ws.connect.timeout", 5 * 60 * 1000);
		((BindingProvider) port).getRequestContext().put("com.sun.xml.internal.ws.connect.timeout", 5 * 60 * 1000);

		((BindingProvider) port).getRequestContext().put("com.sun.xml.ws.request.timeout", 5 * 60 * 1000);
		((BindingProvider) port).getRequestContext().put("com.sun.xml.internal.ws.request.timeout", 5 * 60 * 1000);

		System.setProperty("sun.net.client.defaultReadTimeout", String.valueOf(5 * 60 * 1000));
		System.setProperty("sun.net.client.defaultConnectTimeout", String.valueOf(5 * 60 * 1000));

		taskPort = service.getTaskManagementServicesPort();
		((BindingProvider) taskPort).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, Environment.getCmusr());
		((BindingProvider) taskPort).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, Environment.getCmpwd());

	}

}
