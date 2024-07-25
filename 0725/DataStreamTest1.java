import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.print.attribute.standard.MediaSize.Engineering;

public class DataStreamTest1 {

	public static void main(String[] args) {

		int age = 20;
		String name = "홍길동";
		double heigth = 176.5;
		boolean isMarried = false;

		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("info.bin");
			dos = new DataOutputStream(fos);
			dos.writeInt(age);
			dos.writeUTF(name);
			dos.writeDouble(heigth);
			dos.writeBoolean(isMarried);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos !=null) dos.close();
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
