package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
	Connection conexion;
	String JDBC_URL = "jdbc:mysql";
	String usuario;
	String clave =  "";
	
	public void Db() {
		try {
			conexion = DriverManager.getConnection(JDBC_URL,usuario,clave);
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
	}

}