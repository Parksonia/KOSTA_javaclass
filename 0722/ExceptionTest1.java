
public class ExceptionTest1 {

	public static void main(String[] args) {
	
		String str = null;
		try {
			System.out.println(str.toString());  //NullPointerException :str이 Null이다. 
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("종료");

	}

}
