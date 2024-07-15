class Variable {
	int iv;
	static int sv; // static변수는 new없이 사용 가능, 프로그램 실행과 동시에 메모리에 올라감

	void method() {
		int lv;  // 지역변수, 메소드 안에서만 사용 가능, 초기화 없이 사용할 수 없다.
		lv = 0; // 초기화
		System.out.println(lv);
	}

}

public class VariableTest {

	public static void main(String[] args) {
		// System.out.println(Variable.iv); //인스턴스 변수는 클래스명으로 접근할 수 있다. 사용을 위해서는 new로객체
		// 생성하여야함
		Variable variable = new Variable();
		System.out.println(variable.iv); // 인스턴스 변수는 객체 생성 후 레퍼런스를 통해 접근해야만 한다.

		// 프로그램 실행과 동시에 메모리에 올라가 있어 사용 가능 , 공유 변수다.
		// 클래스 변수는 클래스명으로 접근, 객체 생성하지 않아도 이미 생성되어 있다.
		System.out.println(Variable.sv);
		System.out.println(variable.sv); // 레퍼런스 통해 접근도 할 수 있다.
		
		
		
		Variable.sv = 10;
		System.out.println(variable.sv);
		
		variable.method();

		Variable variable2 = new Variable();
		System.out.println(variable2.sv);
		Variable.sv = 20;
		System.out.println(variable.sv);
		System.out.println(variable2.sv); // static변수는 공유변수다.
	
		variable.sv++;
		System.out.println(variable2.sv);
	}

}
