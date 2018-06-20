package thingblu.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DBConnect {

	 private Connection con = null;
	 private Statement stm = null;
	 ResultSet resultSet;
	 private String username = "sa";
	 private String password = "M3ch50ft";


	@Test
	public void test() throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		  String url = "jdbc:sqlserver://192.168.5.148;DatabaseName=ThingBluGrowDB";
		  
		 
		  con = DriverManager.getConnection(url,username,password);
		  stm = con.createStatement();
		 
		  resultSet = stm.executeQuery("select * from TBG_StrainMaster");
		 

		
		
		try {
			while (resultSet.next()) {
				//resultValue = resultSet.getString(1).toString();
				System.out.println(resultSet.getString(1).toString());
				System.out.println(resultSet.getString(2).toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
