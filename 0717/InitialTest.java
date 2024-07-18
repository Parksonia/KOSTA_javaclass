class Engine {
	
}
class Car {
	
//	int door = 4;
//	Engine engine = new Engine();  // 명시적 초기화 -> static 변수를 초기화 할때도 사용됨
	
	int door;
	Engine engine;

//	public Car(int door,Engine engine) {   // 생성자를 통한 초기화 -> 가장 많이 사용됨
//		
//		this.door = door;
//		this.engine = engine;
//	}
	
	{    // 인스턴스 초기화 블럭
		door = 4;
		engine = new Engine();
		
	}
//	System.out.println(door);  -> 클래스안에는 변수 와 함수만 들어갈 수 있다. 명령문은 반드시 블럭 안에 있어야함! 
	
}
public class InitialTest {

	public static void main(String[] args) {

//		Car car = new Car(4,new Engine());

		Car car = new Car();
		
	}

}
