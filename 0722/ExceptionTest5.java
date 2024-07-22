
public class ExceptionTest5 {

	public static void func() {
		String string = null;
	try {
		
		System.out.println(string.toString());  // 실제 exception 발생
	} catch (NullPointerException e) {
		e.printStackTrace();
		System.out.println("func 예외처리");
		throw e; // 예외를 던짐-> 호출한 곳으로 예외를 던져서 거기서 처리 하게 함 
	}
	System.out.println("func종료");
	}
	public static void func2() {  // 호출한 애 위치에서도 예외 처리를 할 수 있다.
		try {
			func();	
		} catch (NullPointerException e) {
			System.out.println("func2 예외처리");
		}
		System.out.println("func2 종료");
	}
	public static void main(String[] args) {
		func2(); 
		System.out.println("main 종료");
	}

}
