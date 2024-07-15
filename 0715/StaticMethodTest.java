class Test{
	
	int iv;
	static int sv;
	
	void method1 () {
		System.out.println("method1");
		iv = 100; 
		sv = 200; //instance 메서드에서는 static 변수를 사용할 수 있다.
		method2(); // instance 메서드에서는 static 함수를 호출 가능
	}
	static void method2 () { //static 메서드도 변수와 같이 프로그램 실행과 동시에 생성,객체 생성 없이 클래스명으로호출 가능
		System.out.println("method2");
		
		//System.out.println(iv); // static변수가 아닌 int iv 변수는 멤버변수로 객체 생성해야 메모리에 올라가므로 사용 불가.
		//method1(); // static 메서드에서는 instance 메소드도 호출할 수 없다. 위와같은이유로  객체 생성해야 호출 할 수 있기 때문이다.
		System.out.println(sv);
	}
}

public class StaticMethodTest {

	public static void main(String[] args) {
		
		Test.method2();
		//Test.method1(); // 클래스명으로 접근 안됨, new 객체 생성후 참조 변수로 호출 가능
		
		Test t = new Test();
		t.method1();

	}

}
