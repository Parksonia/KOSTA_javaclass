import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest1 {

	public static void main(String[] args) {

		FileInputStream fileInputStream = null;
		BufferedInputStream biStream = null;  // 입력 보조 스트림
		FileOutputStream fileOutputStream = null;
		BufferedOutputStream boStream = null;// 출력 보조 스트림
		try {
			fileInputStream = new FileInputStream("news.txt");
			biStream = new BufferedInputStream(fileInputStream);
			fileOutputStream = new FileOutputStream("weather.txt");
			boStream = new BufferedOutputStream(fileOutputStream);
			int data;

			byte[] buff = new byte[100];
			int len;
			//buff길이 만큼 데이터를 계속 읽어오고(재활용해서) 버퍼의 길이를 반환
			//BufferedInputStream과 BufferedOutputStream 을 사용하면 기능은 같으나 효율은 훨씬 좋다!
			while((len=biStream.read(buff))> 0) {  
				boStream.write(buff,0,len); // 데이터가 버퍼길이보다 적더라도 0이 출력되지않고 길이만큼 출력됨
			}
			
//			//.read() ->한글자씩 읽어옴, 읽어올 값이 없으면 -1 반환
//			while((data= fileInputStream.read())!= -1) { 
//				fileOutputStream.write(data);
//			}
//			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
				try{
					if(fileInputStream !=null)fileInputStream.close();
					if(fileOutputStream !=null) fileOutputStream.close();
				}catch (Exception e2) {
				e2.printStackTrace();
				}
		
		}
	}

}
