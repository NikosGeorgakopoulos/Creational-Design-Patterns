import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SingletonDemo {

	public static void main(String[] args) {
		
		DbSingleton instance = DbSingleton.getInstace();
		
		long timeBefore = 0;
		long timeAfter = 0;
		
		System.out.println(instance);
		
		timeBefore = System.currentTimeMillis();		
		Connection conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		
		System.out.println(timeAfter-timeBefore);
		
		Statement sta;
		
		try {
			sta = conn.createStatement();
			int count = sta
						.executeUpdate("Create TABLE Address (ID INT, StreetName VARCHAR(20),"
								+ " City VARCHAR(20))");
			System.out.println("Table Created.");
			
			sta.close();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		timeBefore = System.currentTimeMillis();		
		conn = instance.getConnection();
		timeAfter = System.currentTimeMillis();
		System.out.println(timeAfter-timeBefore);
	}
}
