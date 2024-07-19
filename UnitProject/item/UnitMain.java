package item;

public class UnitMain {

	public static void main(String[] args) {
	
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(tank); //인자를 고쳐주는기능
		//scv.repair(marine); // error <- 인터페이스 연결 안됨
		scv.repair(scv); // 본인도 수리 가능
	}

}
