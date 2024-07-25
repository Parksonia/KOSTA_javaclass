import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {

		FileReader fis = null;
		//FileInputStream fis = null;
		try {
			fis = new FileReader("news.txt");
			//fis = new FileInputStream("news.txt");
			
			//출력하기
			//FileInputStream 쓰면 1바이트만 가져오게 됨 따라서 출력이 제대로 안됨 따라서 Reader로 문자 단위로 해야함
			int data;
			while((data = fis.read())!=-1) {
				System.out.print((char)data); 
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}
//fileinputStream 출력
//24ì¼ ì¨ë¼ì¸ ì»¤ë®¤ëí°ì ì¬íê´ê³ë§ìë¹ì¤(SNS)ìë 'ì¼ê²¹ì´ì ì£¼ë¬¸íëë° ì²­í¬ë ì¬íì´ ë°°ì¡
//ììµëë¤'ë¼ë ë´ì©ì ë´ì ê¸ì´ ìë¬ì ì¬ë¼ìë¤. 

//fileReader 출력
//24일 온라인 커뮤니티와 사회관계망서비스(SNS)에는 '삼겹살을 주문했는데 청포도 사탕이 배송 왔습니다'라는 내용을
//담은 글이 잇달아 올라왔다. 
