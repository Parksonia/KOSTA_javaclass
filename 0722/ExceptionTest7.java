
public class ExceptionTest7 {
	public static void func() {
		try {
			String str = null;
			//String str  ="String";
			System.out.println("스타트");
			System.out.println(str.toCharArray());
			//System.out.println("try에서 마무리");
			return;
		} catch (Exception e) {
			System.out.println("예외처리");
			//System.out.println("catch에서 마무리");
			return;
		
		}finally {
			System.out.println("마무리"); // 리턴해도 파이널리는 무조건 실행됨
		}
	}
	
	public static void main(String[] args) {
		func();

	}

}
