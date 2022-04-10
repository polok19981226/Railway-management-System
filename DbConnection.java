package railway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	static Connection con;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost","root","1234");
			
		}
		catch (ClassNotFoundException | SQLException e) {
			
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
}