import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

public class app {

	public static void main(String[] args)  {
		
//			throws IOException, JAXBException, ParseException, DatatypeConfigurationException, InterruptedException {

		ResultSet rsIn=null;
		try {
			String csvRow =  rs2csvr.convertToCsv(rsIn);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		// Do something with the Connection

		// String filename = "C:\\Users\\u61906\\single_accountvuteq.csv";
		// ProcessIPG processIt = new ProcessIPG();
		// processIt.LoadAccount(filename);

		// String f2 = "C:\\Users\\u61906\\export.csv";
		// ProcessProdCat prodCat = new ProcessProdCat();
		// prodCat.LoadProdCat(f2);

		// String f3 = "C:\\Users\\u61906\\flintstones_vuteq.csv";
		// ProcessSubscription ps = new ProcessSubscription();
		// ps.LoadSubscription(f3);

		// String f4 = "C:\\Users\\u61906\\supplier_LOADME.txt";
		// ProcessSupplier pss = new ProcessSupplier();
		// pss.LoadSupplier(f4);

		// Thread.sleep(5000);

		// String f5 = "C:\\Users\\u61906\\supplierLocation_LOADME.txt";
		// ProcessSupplierLocation psl = new ProcessSupplierLocation();
		// psl.LoadSupplierLocation(f5);
		// System.exit(0);

		// String f6 = "C:\\Users\\u61906\\practitioner_LOADME.txt";
		// ProcessPractioner pp = new ProcessPractioner();
		// pp.loadPractitioner(f6);
		// System.exit(0);

	}

}
