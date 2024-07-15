class MyClass{
	int n;
	
	// 기본생성자 : 파라미터가 없는 생성자
	public MyClass() { // =생성자 : 클래스명과 동일한 함수 && 리턴타입이 없음  && 대부분 public이다.
		System.out.println("My Class()"); 
	}
	
	// 생성자 오버로딩
	public MyClass(int num) {
		System.out.println("My Class(int num)");
		n = num;
	}
	
}


public class ConstructorTest1 {

	public static void main(String[] args) {
		
		MyClass mc = new MyClass(); // 객체 생성시(new) 생성자는 자동 호출된다. 생성자는 오버로딩 될 수 있다. 파라미터가 없는 기본생성자 호출됨
		System.out.println(mc.n);
		
		MyClass mc2 = new MyClass(10); // 인자가 있는 생성자 호출됨
		System.out.println(mc2.n);		
		}

}
