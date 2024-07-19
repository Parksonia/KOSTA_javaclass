interface ITest {
	void ifunc(); // 생략 됐지만, public abstract다
}

class CTest {
	void cfunc() {
	}

}

class DTest extends CTest implements ITest {
	void dfunc() {
	}

	@Override
	public void ifunc() {
	}
}

public class InterfaceTest1 {

	public static void main(String[] args) {

		DTest obj = new DTest();
		obj.dfunc();
		obj.cfunc();
		obj.ifunc();
		
		CTest obj2 = new DTest();
		obj2.cfunc(); // ifunc는 interface 오버라이딩 된거임 ,따라서 CTest메서드 호출만 가능하다.
		
		ITest obj3 = new DTest();
		obj3.ifunc(); // ITest메서드 호출만 가능(오버라이딩된 DTest의 메서드가 결과적으로 호출되는 것)
		
		
	}

}
