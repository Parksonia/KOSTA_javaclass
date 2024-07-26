import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderTest1 {

	public static void main(String[] args) {
		//line단위로 출력 가능BufferedReader
		
		//읽어오기
		FileReader fr = null;
		BufferedReader br = null;
		//출하기
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			fr = new FileReader("news.txt");
			br = new BufferedReader(fr);
			String lineString = null;
			
			fw = new FileWriter("cpy.txt");
			bw = new BufferedWriter(fw);
			
			
			while((lineString=br.readLine()) !=null) {
				System.out.println(lineString);
				bw.write(lineString); // 라인단위로 쓰고
				bw.newLine(); // 그다음 줄 내려가기 (다음줄을 새로운 줄로 만듦)
			}
								
		}catch(IOException exception){
			exception.printStackTrace();
		}finally {
			try { //close를 꼭!! 꼭!!
				if(br !=null)br.close();
				if(bw !=null)bw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
