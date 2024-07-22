import java.io.IOException;

public class ExceptionTest8 {

	public static void func() throws IOException,ClassNotFoundException { // throws :메소드안에서 예외를 던져줄 때 사용
		int n = 2;
		 if (n == 2) {
			throw new IOException("입출력 예외");

		} else if (n == 3) {
			throw new ClassNotFoundException("ClassNotFoundException");
		}
	}

	public static void main(String[] args) throws Exception {
		
		func();
	}

}
