package apacheCommonsDbcp;

import java.sql.*;

import org.apache.commons.dbcp2.BasicDataSource;

public class DBCPDemo {
	
	// creating instance of basicdatasource
	
	private static BasicDataSource datasource = null;
	
	// static block
	
	static {
		datasource = new BasicDataSource();
		datasource.setUrl("jdbc:mysql://localhost:3306/studentdb");
		datasource.setUsername("Zuma");
		datasource.setPassword("Zuma1234");
		
		// specify min number of idle connections
		datasource.setMinIdle(4);
		// specify max number of idle connections
		datasource.setMaxIdle(10);
		// specify total number of max connections
		datasource.setMaxTotal(10);
	};
	
	public static void main(String[] args) {
		
		try(Connection conn = datasource.getConnection();
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
