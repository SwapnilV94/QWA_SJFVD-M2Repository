package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
	
	//create object of file input stream
	FileInputStream fis = new FileInputStream("./src/test/resources/CommonData.properties");
	
	//create object of properties class
	Properties prop = new Properties();
	
	//load all the keys in your test script
	prop.load(fis);
	
	//provide the key and fetch value
	String browser = prop.getProperty("Browser");
	
	System.out.println(browser);
	}
	

}
