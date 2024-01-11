package readers;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {

	
	public static Properties getTestData(String filename){
		Properties prop=new Properties();
		try
		{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\testdata\\"+filename+".properties");
		prop.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception occur while reading property file "+e);
		}
		
		return prop;
	}
	
}
