package org.mvpigs.ConnectionBD;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

		public class Insertar {
			public static void Insertar() {
				 try {
				 // create our mysql database connection
			      String myDriver = "com.mysql.jdbc.Driver";
			      String myUrl = "jdbc:mysql://localhost:3306/mydb?user=root";
			      Class.forName(myDriver);
			      Connection conn = DriverManager.getConnection(myUrl, "root", "RaulXecso1");

			      
			     
			 
			      // create the java statement
			      java.sql.Statement st = conn.createStatement();
			      
			      System.out.println("Elige la tabla en la que quieres introducir los datos");
			      System.out.println("1) trabajadores, 2) clientes 3) proveedores, 4) pedidos 5) detalles_pedido");
			  	  Scanner sc = new Scanner(System.in);
			  	  int eleccion = sc.nextInt();  
			      
			      if(eleccion == 1) {
			    	  System.out.println("Introduce la query que quieras insertar");
				      BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
				      String query = lector.readLine(); 
				      
				      System.out.println("Porfavor introduce todas las palabras separadas entre comillas, separalas con comas y rellena cada campo");
				      st.executeUpdate("INSERT INTO trabajadores (idTrabajadores, Nombre, Apellidos, Numero_telefono, Fecha_nacimiento)"
				          + query);

				      conn.close();
				      st.close();
				    }
			      if(eleccion == 2) {
			    	  System.out.println("Introduce la query que quieras insertar");
				      BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
				      String query = lector.readLine(); 
				      
				      System.out.println("Porfavor introduce todas las palabras separadas entre comillas, separalas con comas y rellena cada campo");
				      st.executeUpdate("INSERT INTO clientes (idClientes, Nombre, Apellidos, direccion, ciudad,Detalles Pedido_idDetallesPedido)"
				          + query);

				      conn.close();
				      st.close();  
			      }
			      if(eleccion == 3) {
			    	  System.out.println("Introduce la query que quieras insertar");
				      BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
				      String query = lector.readLine(); 
				      
				      System.out.println("Porfavor introduce todas las palabras separadas entre comillas, separalas con comas y rellena cada campo");
				      st.executeUpdate("INSERT INTO proveedores (idProveedores, Nombre_contacto, Dirección, Codigo_Postal, Número_telefono)"
				          + query);

				      conn.close();
				      st.close();  
			      }
			      if(eleccion == 4) {
			    	  System.out.println("Introduce la query que quieras insertar");
				      BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
				      String query = lector.readLine(); 
				      
				      System.out.println("Porfavor introduce todas las palabras separadas entre comillas, separalas con comas y rellena cada campo");
				      st.executeUpdate("INSERT INTO pedidos (idPedidos, idClientes, idTrabajadores, Fecha_Entrega, Fecha_Pedido)"
				          + query);

				      conn.close();
				      st.close();  
			      }
			      if(eleccion == 5) {
			    	  System.out.println("Introduce la query que quieras insertar");
				      BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"
				      String query = lector.readLine(); 
				      
				      System.out.println("Porfavor introduce todas las palabras separadas entre comillas, separalas con comas y rellena cada campo");
				      st.executeUpdate("INSERT INTO detalles pedido (idDetallesPedido, idProducto)"
				          + query);

				      conn.close();
				      st.close();  
			      }
				 }
				    catch (Exception e)
				    {
				      System.err.println("Got an exception!");
				      System.err.println(e.getMessage());
				    }

				  }
				}


