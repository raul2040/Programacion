package org.mvpigs.ConnectionBD;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import org.mvpigs.ConnectionBD.consultas.Consultas;

public class ConnectionBD {
		
			public static void main(String[] args) throws IOException{
				
			System.out.println("---------- MENU DE BASE DE DATOS ----------"); // Creamos un menu de acceso a las diversas funcionalidades del programa.
		    System.out.println("1) Hacer una query a la BD.");
			System.out.println("2) Insertar datos a la BD.");
			System.out.println("3) Salir de la tabla");
			System.out.println("Elige opción ");
			System.out.println("------------------------");
			Scanner sc = new Scanner(System.in);
			int eleccion = sc.nextInt(); 
			while(eleccion != 3) {
				if(eleccion == 1) {
					eleccion = 3;
					System.out.println("Has elegido la opción 1");
					Consultas.consultas();
			}
				if(eleccion == 2) {
					eleccion = 3;
					System.out.println("Has elegido la opción 2");
					Insertar.Insertar();

				}

			sc.close();
			System.out.println("Has salido del menú");
   }
}
}

