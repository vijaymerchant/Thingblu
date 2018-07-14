package thingblu.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {


	public static  Connection con = null;
	public static Statement stmt = null;
	static String baseUrl;
	static ResultSet resultSet = null;
	static String resultValue = "";

	
	public static String getDataFromDataBase() throws SQLException, Exception {
		String resultValue = null;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://192.168.5.148;DatabaseName=ThingBluGrowDB";
		con = DriverManager.getConnection(url, "sa","M3ch50ft");
		stmt = con.createStatement();
		resultSet = stmt.executeQuery("select StartWeight from dbo.TBG_PrcsrLotDetails where growerlotno='LOT-45452'");

		while (resultSet.next()) {
			resultValue = resultSet.getString(1).toString();
			System.out.println(resultValue);

		}
		return resultValue;

	}

}