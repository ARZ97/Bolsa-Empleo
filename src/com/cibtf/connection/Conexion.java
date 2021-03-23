package com.cibtf.connection;

 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	

		public static Connection getConnection() {
			
			
		    Connection conn = null;

		    try{
		        Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
		        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bolsadee_maindb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
		        if (conn!=null){
		            System.out.println("  OK\n");
		        }		            

		        }catch(SQLException ex){
		            System.out.println(ex.getMessage());
		            System.out.println("  error\n");
		        }catch(Exception ex){
		            System.out.println(ex.getMessage());
	 System.out.println("  error\n");
 
		        }		           

		    return conn;
		    }
		
		
}
			
		