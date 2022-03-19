package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Db {
	Connection conexion;
	private static String JDBC_URL = "jdbc:mysql://localhost:3306/ipdb?useSSL=false&useTimezone=UTC&allowPublicKeyRetrieval=true";
	private static String usuario = "root";
	private static String clave = "admin";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL, usuario, clave);
	}

	public void agregarIp(Pc pc) {
		try {
			PreparedStatement s = conexion.prepareStatement("INSERT INTO config_ip (numero_computador,ip),(?,?) ");

			s.setString(1, pc.getPc());
			s.setString(2, pc.getIp());

			s.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
	}

}