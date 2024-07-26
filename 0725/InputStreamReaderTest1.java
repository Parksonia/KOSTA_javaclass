import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest1 {
	public static void main(String[] args) {

		//FileInputStream을 InputStreamReader로 변환하여 출력
		
		FileInputStream fis = null;  //1차:byte단위
		InputStreamReader isr = null;  // 2차: 라인단위로 바꿔주는 역할 (중간 역할,어답터)
		BufferedReader br = null; // 라인 단위로 읽기
		
		try {
			fis = new FileInputStream("news.txt");
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			String line = null;
			while ((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br != null) br.close();
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

}
