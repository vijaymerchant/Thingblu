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
		 
		  resultSet = stm.executeQuery("select growers.rawsuppliername as Growername, TBG_StrainMaster.StrainName,lotdtls.lotid,lotdtls.LotType,lotdtls.growerlotno as LotNumber, lotdtls.biotrackweight,lotdtls.startweight,lotdtls.shortageoverage,lotdtls.istrimmed from TBG_PrcsrLotDetails lotdtls inner join TBG_RawSuppliers growers on lotdtls.RawSupId=growers.RawSupId and lotdtls.IsDeleted=0inner join TBG_StrainMaster on lotdtls.StrainId=TBG_StrainMaster.StrainId where lotdtls.LotId=152");
		 

		
		
		try {
			while (resultSet.next()) {
				//resultValue = resultSet.getString(1).toString();
				System.out.print(resultSet.getString(1).toString() + " - ");
				System.out.print(resultSet.getString(2).toString() + " - ");
				System.out.print(resultSet.getString(3).toString() + " - ");
				System.out.print(resultSet.getString(4).toString() + " - ");
				System.out.print(resultSet.getString(5).toString() + " - ");
				System.out.print(resultSet.getString(6).toString() + " - ");
				System.out.print(resultSet.getString(7).toString() + " - ");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
