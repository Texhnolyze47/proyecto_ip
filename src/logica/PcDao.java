package logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static logica.Db.getConnection;

public class PcDao {

	public int agregarIp(Pc pc) {

		Connection conexion = null;
		PreparedStatement s = null;
		int registros = 0;
		try {
			conexion = getConnection();
			s = conexion.prepareStatement("INSERT INTO config_ip (numero_computador,ip) VALUES(?,?)");

			s.setString(1, pc.getPc());
			s.setString(2, pc.getIp());

			registros = s.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
		return registros;
	}
}
