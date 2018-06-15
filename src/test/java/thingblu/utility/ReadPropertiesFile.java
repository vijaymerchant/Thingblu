package thingblu.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static String getDataFromProperties(String key) {
		File file = new File("");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (Exception e) {
			System.out.println("Exception occures while reading properties file. Exception is :" +e.getMessage());
		}
		Properties prop = new Properties();
		try {
			prop.load(fileInput);
		} catch (Exception e) {
			System.out.println("Exception occures while loading properties file. Exception is :" +e.getMessage());
		}
		String data=prop.getProperty(key);
		return data;
	}
}
