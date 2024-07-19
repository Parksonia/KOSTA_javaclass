abstract class Player{ // abstract 메서드가 하나라도 있으면 abstract 클래스다
	int currentPos;
	
	public Player() {}
	void play() { //오버 로딩  
		
		play(currentPos);  
		// abstract메서드를 호출, 해당 메서드가 호출되는 시점은 자식을 통해 이미 구현이 됐을테니 
		// 에러가 안남
	}
	
	abstract void play(int pos);
	abstract void stop();
}
class MyPlayer extends Player{
	@Override
	void play(int pos) {
	System.out.println("MyPlayer play(int pos) 호출");
	}
	
	@Override
	void stop() {
	System.out.println("Myplayer stop()호출");
		
	}
}

public class AbstractTest {

	public static void main(String[] args) {
		//Player player = new Player(); // abstract가 구현되지 않으면 객체 생성 불가

		MyPlayer mPlayer = new MyPlayer();
		mPlayer.play(); // 오버라이딩된 play가 호출되는것 
		
	}

}
