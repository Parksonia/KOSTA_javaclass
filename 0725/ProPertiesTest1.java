import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProPertiesTest1 {

	public static void main(String[] args) throws IOException {
	
		//hashtable의 하위 클래슨
		//proerties는 키-값 모두 String으로 형태가 정해져있다. value가 제너릭이 아님
		//properties 는 환경설정 정보를 저장하기 위해 사용
		Properties properties = new Properties();
		properties.setProperty("driver","org.mariadb.jdbc.Driver");
		properties.setProperty("url", "jdbc:mariadb://localhost:3306/testdb");
		properties.setProperty("username", "root");
		properties.setProperty("password","7564");
		
		//save대신 store를 써야한다.
		properties.store(new FileOutputStream("db.properties"), "Database Connection");
		properties.storeToXML(new FileOutputStream("db.xml"), "Database Connection");
		
		
	}

}
