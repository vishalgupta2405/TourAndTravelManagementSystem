package travel.management.system;
import java.sql.*;

public class Conn {
     
	Connection c;
	Statement s;
	
	public Conn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
	
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms?useSSL=false", "root", "newpass");
	
			s=c.createStatement();
		}
		catch(Exception e) {
		
		}
	}
	
}
