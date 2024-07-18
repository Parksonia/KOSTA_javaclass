class Base {
	int baseNum;
	void baseMethod() {}
	void method() {
		System.out.println("Base method");
	}

}
class Derived extends Base {
	int derivedNum;
	void derivedMethod() {}
	
	@Override
	void method() {
		System.out.println("Derived method");
	}
	
}

public class PolinopTest {

	public static void main(String[] args) {
		Base base  =  new Base();  // 레퍼런스(주소를 담은)
		base.baseNum = 10;
		base.baseMethod();
		
		Derived derived = new Derived();
		derived.baseNum =20;
		derived.derivedNum = 100;
		derived.baseMethod();
		derived.derivedMethod();
		
		Base base2 = new Derived(); //Up-casting: 자식 객체를 부모의 레퍼런스변수에 담음 
		base2.baseNum = 30;
		base2.baseMethod(); // 메모리에 자식의 변수를 가지고 있지만 접근은 부모만 불가능 하다. 
		base2.method(); // **다형성** : 상속관계,up-casting-> 오버라이딩은 그래도 자식꺼를 따른다!! 
		
		
		//base2.derivedNum =200; //error
		//base2.derivedMethod(); //error
	
		Derived derived2 = (Derived)base2;  //Down-casting 
		derived2.derivedNum =20;
		derived2.derivedMethod();
		
		//Derived derived3 = (Derived)base; // 잘못된 casting, down-casting 
		//derived3.derivedMethod(); //에러
	}

}
