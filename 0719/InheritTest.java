class A extends Object{} // 부모는 제일 최상위 클래스인 Object의 상속을 받은것과 같다.
class B {} // Object의 상속 생략된 거임

//class C extends A, B {} -자바는 클래스의 다중 상속을 허용하지 않는다.
class C extends A{}
class D extends B{}

interface I1{}
interface I2{}
class E implements I1,I2 {} // 하지만, 인터페이스는 다중상속을 허용한다.
class F extends D implements I1,I2 {} // 단일 클래스 상속 다중 인터페이스 상속




public class InheritTest {

	public static void main(String[] args) {
	
		
		A a1 = new A();
		Object o1 = new A();
	
		Object o2 = new B();
		B b1 = new B();
		
		Object o3 = new C();
		A a2 = new C();
		C c1 = new C();
		
		Object o4 = new D();
		B b2 = new D();
		D d = new D();

		Object o5 = new E();
		E e = new E();
		I1 i1 = new E(); // 인터페이스도 부모다
		I2 i2 = new E();
	
		Object o6 = new F();
		B b3 = new F();
		D d2 = new F();
		I1 i12 = new F();
		I2 i22 = new F();
		
	}

}
