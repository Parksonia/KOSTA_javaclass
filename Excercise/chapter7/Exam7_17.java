package chapter7;

class Unit {
	int x, y; // 현재위치

	void move(int x, int y) { /* 지정된 위치로 이동 */ }

	void stop() {
		System.out.println("현재 위치에 정지");
	}
}

//보병
class Marine extends Unit {
	
	@Override
	void move(int x, int y) {
	System.out.println(String.format("(%d,%d)로 걸어서 이동", x,y));
	}
	
	void stimPack() {
		System.out.println("스팀팩을 사용한다.");
	}
}

//탱크
class Tank extends Unit {

	@Override
	void move(int x, int y) {
	System.out.println(String.format("(%d,%d)로 굴러서 이동", x,y));
	}

	void changeMode() {
		System.out.println("공격모드를 변환한다.");
	}
}

//수송선
class Dropship extends Unit {

	int x,y;// 현재 위치 
	@Override
	void move(int x, int y) {
	System.out.println(String.format("(%d,%d)로 떠서 이동", x,y));
	}

	void load() {
		System.out.println("선택된 대상을 태운다.");
	}

	void unload() {
		System.out.println("선택된 대상을 내린다.");
	}
}



public class Exam7_17 {
	public static void changeMode(Unit[] units) { 
		for(int i=0; i<units.length; i++) {
			if(units[i] instanceof Tank == true) { //Instanceof 연산자란? 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자 이다
				//Tank tank = (Tank)units[i];
				//tank.changeMode(); 아래와 같이 표현 할 수 있음
				((Tank)units[i]).changeMode(); // 자식만 가지고 있는 메서드는 다운 캐스팅해줘야 사용 할수 있음 
			}
		}
	}
	public static void stimPack (Unit[]units) {
		for(int i=0; i<units.length; i++) {
			if(units[i] instanceof Marine == true) {
				((Marine)units[i]).stimPack();  // Marine만 가지고 있는 메서드기때문에  다운 캐스킹 해주고 메서드 호출 
			}
		}
	}
	
	
	public static void main(String args[]) {
		Unit[] units = new Unit[3];
		units[0] = new Marine();
		units[1] = new Tank();
		units[2] = new Dropship();
		
		for(int i=0; i<units.length; i++) {
			units[i].move(10, 10);
			
		}
		// 부모는 자식 메서드에 접근 불가 하기 때문에 자식메서드를 사용하기 위해 다운 캐스팅을 활용함
		changeMode(units);
		stimPack(units);  
	}
}
