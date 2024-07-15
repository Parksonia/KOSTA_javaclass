class Person { // 클래스(사용자 정의 데이터 타입) 생성 
	int age;   // 클래스 안에 변수 생성 할 수 있다 = 멤버변수
	double height;
	String name;
	
	String info() { // 클래스의 멤버변수를 출력하기 위해 메서드를 만듦
		return String.format("나이 :%d, 이름 : %s, 키: %.1f", age,name,height); // 같은 클래스로 묶여 있기때문에 멤버 변수 사용 할 수 있다.
	}
}

public class ClassTest1 {

	public static void main(String[] args) {
		// 클래스 자체가 데이터 타입이기 때문에 선언을 할 수 이다.
		// 배열과 같이 참조 타입 현재 Person 클래스가 가진 12byte를 가지고 heap영역에 자리를 확보하고 데이터 시작주소를 p1 stack영역에 담음  
		
		Person p1 = new Person(); // p1의 시작 주소를 따라가면 클래스가 가진 변수의 데이터를 알 수 있음  
		p1.age = 30;
		p1.height = 175.3; 
		p1.name = "홍길동";
		
		Person p2 = new Person();
		p2.age = 35;
		p2.height = 165.3;
		p2.name = "홍길순";
		
		
		
//		Person p3 = p2; // p2변수에는 주소가 담김, 따라서 같은 주소지를 참조하게 됨
//		p3.age = 40;
//

		Person p3 = new Person();
		p3.age = p2.age;   
		p3.height = p2.height;
		p3.name = p2.name;
		p3.age = 40;  // p2의 데이터를 저장 하는 것 따라서 같은 주소를 공유한게 아니므로 p2의 값은 변하지 않음

		
		System.out.println(p1.info()); // 메서드를 호출하여 출력을 간단하게 함
		System.out.println(p2.info());
		System.out.println(p3.info());	
	}

}
