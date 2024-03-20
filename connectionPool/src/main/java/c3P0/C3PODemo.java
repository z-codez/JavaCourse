package c3P0;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3PODemo {
	
	private static ComboPooledDataSource cpds = new ComboPooledDataSource();
	
	static {
		cpds.setJdbcUrl("jdbc:mysql://localhost:3306/studentdb");
		cpds.setUser("user");
		cpds.setPassword("password");
		
        cpds.setMinPoolSize(3);
        cpds.setAcquireIncrement(3);
        cpds.setMaxPoolSize(6);
	}
	
	public static void main(String[] args) {
		
		try(Connection conn = cpds.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from studentTable")) {
			while(rs.next()) {
				System.out.println("Student ID: "+ rs.getInt("ID"));
				System.out.println("Student Name: "+ rs.getString("studentName"));
				System.out.println("Date of Birth: "+ rs.getDate("DOB"));
				System.out.println("Student Address: "+ rs.getString("address"));
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};

	}

}
