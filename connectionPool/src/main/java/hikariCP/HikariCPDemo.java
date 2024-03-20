package hikariCP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCPDemo {
	
	private static HikariConfig config = new HikariConfig();
	private static HikariDataSource dataSource= null;
	
	static {
		config.setJdbcUrl("jdbc:mysql://localhost:3306/studentdb");
		config.setUsername("Zuma");
		config.setPassword("Zuma1234");
		
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        
        dataSource = new HikariDataSource(config);
	}

	public static void main(String[] args) {
		
		try(Connection conn = dataSource.getConnection();
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
