package org.mvpigs.ConnectionBD.consultas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class Consultas {
	public static void consultas() {
		try {
	      // create our mysql database connection
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost:3306/mydb?user=root";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "RaulXecso1");

	      // our SQL SELECT query. 
	      System.out.println("Introduce tu query");
	      BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
	      String query = lector.readLine(); 
	 
	      // create the java statement
	      java.sql.Statement st = conn.createStatement();
	      
	      // execute the query, and get a java resultset
	      ResultSet rs = st.executeQuery(query);
	      
	     
	      // iterate through the java resultset
	      while (rs.next())
	      {
	    	int numColumns = rs.getMetaData().getColumnCount();
            for ( int i = 1 ; i <= numColumns ; i++ ) {
               // Column numbers start at 1.
               // Also there are many methods on the result set to return
               //  the column as a particular type. Refer to the Sun documentation
               //  for the list of valid conversions.
               System.out.println( "COLUMNA nº " + i + " = " + rs.getObject(i) );
            } 
            
          }
	      st.close();
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println(" Ha ocurrido una excepción! ");
	      System.err.println(e.getMessage());
	    }
	  }

}