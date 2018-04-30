import java.io.FileNotFoundException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class rs2csvr {
	
	ResultSet rs;

public static String convertToCsv(ResultSet rs) throws SQLException, FileNotFoundException {
	    //PrintWriter csvWriter = new PrintWriter(new File("whatever.csv")) ;
	    ResultSetMetaData meta = rs.getMetaData() ; 
	    int numberOfColumns = meta.getColumnCount() ; 
	    String dataHeaders = "\"" + meta.getColumnName(1) + "\"" ; 
	    for (int i = 2 ; i < numberOfColumns + 1 ; i ++ ) { 
	            dataHeaders += ",\"" + meta.getColumnName(i).replaceAll("\"","\\\"") + "\"" ;
	    }
	    //csvWriter.println(dataHeaders) ;
	    String row = null;
	    while (rs.next()) {
	        row = "\"" + rs.getString(1).replaceAll("\"","\\\"") + "\""  ; 
	        for (int i = 2 ; i < numberOfColumns + 1 ; i ++ ) {
	            row += ",\"" + rs.getString(i).replaceAll("\"","\\\"") + "\"" ;
	        }
	       return row;
	    //csvWriter.println(row) ;
	    }
	    //csvWriter.close();
		return row;
	}
}

