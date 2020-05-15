package ifs.edu.br.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		String url = "jdbc:postgresql://127.0.0.1:5432/Gracy";
		String usuario = "postgres";
		String senha = "postgres";
		
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  null;
		}
		
		
	}
	
	public static void close(Connection con){
		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
}
