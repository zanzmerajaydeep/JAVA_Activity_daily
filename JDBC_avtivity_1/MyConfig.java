import java.sql.Connection;
import java.sql.DriverManager;

public class MyConfig {

	public static Connection getConnection() throws Exception{
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		return c;
	}
}
