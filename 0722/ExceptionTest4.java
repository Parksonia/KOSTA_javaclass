
public class ExceptionTest4 {

	public static void main(String[]args) {
		try {
			String string = null;
			System.out.println(string.toString());
		} catch (NullPointerException e) {
			try {
				throw e; 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
