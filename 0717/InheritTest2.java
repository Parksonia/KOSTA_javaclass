class Base {
	int n; 
	void method1 () {
		System.out.println("Base method1");
	}

}
class Derived extends Base{
	int m;
	void method2 () {
		System.out.println("Derived method2");
	}
	void method1() { // 오버라이딩 : 부모의 method1재정의 -리턴타입,메서드이름,파라미터 갯수와 타입 모두 같아야한다.
		System.out.println("Derived method1");
	}
}

public class InheritTest2 {

	public static void main(String[] args) {
	
		Base base = new Base();
		base.n = 10;
		base.method1();
		System.out.println("==============");
		Derived derived = new Derived();
		derived.n = 100;
		derived.m = 200;
		derived.method1(); // 부모의 메서드가 오버라이딩 됨
		derived.method2();
	}

}
