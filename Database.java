import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	private static String userName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost";
		String userName="root";
		String password="1234";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, userName, password);
			System.out.println("Successfully Connected");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("create database btic");
			stmt.executeUpdate("uses btic");
			stmt.executeUpdate("create table std (id varchar(20))");
			stmt.executeUpdate("insert into std values ('1')");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
