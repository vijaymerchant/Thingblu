package thingblu.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DBConnect {

	private Connection con = null;
	private Statement stmt = null;
	String baseUrl;
	ResultSet resultSet = null;
	String resultValue = "";


	@Test
	public void test() throws SQLException, ClassNotFoundException {
		// Load Microsoft SQL Server JDBC driver.
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		// Prepare connection url.
		String url = "jdbc:sqlserver://192.168.5.148//sqlexpress:1024;DatabaseName=ThingBluGrowDB";
		// Get connection to DB.
		con = DriverManager.getConnection(url, "M3ch50ft", "sa");
		// Create statement object which would be used in writing DDL and DML
		// SQL statement.
		stmt = con.createStatement();

		resultSet = stmt.executeQuery("select * from TBG_StrainMaster");
		
		
		try {
			while (resultSet.next()) {
				resultValue = resultSet.getString(1).toString();
				System.out.println(resultValue);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
