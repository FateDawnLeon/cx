package tutorial;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	private static Connection con;
	private static String driver = "com.mysql.jdbc.Driver";
	private static String username = System.getenv("ACCESSKEY");
	private static String password = System.getenv("SECRETKEY");
	private static String dbUrl = String.format("jdbc:mysql://%s:%s/%s", System.getenv("MYSQL_HOST"), System.getenv("MYSQL_PORT"), System.getenv("MYSQL_DB"));
	
	public static Connection getConnection(){
		try {
		    Class.forName(driver).newInstance();
		    con = DriverManager.getConnection(dbUrl, username, password);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return con;
	}
}
