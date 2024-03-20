package apacheCommonsDbcp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDataSource;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class DBCPDemo2 {
	
	private static DataSource dataSource = null;
	
	static {
		Properties properties = new Properties();
		properties.setProperty("user", "Zuma");
		properties.setProperty("password", "Zuma1234");
		
		ConnectionFactory connFactory = new DriverManagerConnectionFactory("jdbc:mysql://localhost:3306/studentdb", properties);
		
		var poolableConnFactory = new PoolableConnectionFactory(connFactory, null);
		var config = new GenericObjectPoolConfig<PoolableConnection>();
		
		config.setMinIdle(5);
		config.setMaxIdle(20);
		config.setMaxIdle(20);
		
		
		ObjectPool<PoolableConnection> connPool = new GenericObjectPool<>(poolableConnFactory, config);
		poolableConnFactory.setPool(connPool);
		
		dataSource = new PoolingDataSource<>(connPool);
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
