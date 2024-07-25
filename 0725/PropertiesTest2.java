import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("db.properties"));
	
		System.out.println(properties.getProperty("driver"));
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
	
		System.out.println("======================================");
		Properties properties2 = new Properties();
		properties2.loadFromXML(new FileInputStream("db.xml"));
		System.out.println(properties2.getProperty("driver"));
		System.out.println(properties2.getProperty("url"));
		System.out.println(properties2.getProperty("username"));
		System.out.println(properties2.getProperty("password"));
	
	
	}


}
