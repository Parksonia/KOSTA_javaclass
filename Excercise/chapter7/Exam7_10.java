package chapter7;


public class Exam7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		//t.isPowerOn = true; 같은 패키지내에서 사용 불가하도록 만들어줘야함
		t.setChannel(10); //(t,10) t가 this가 되는거임 
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());  // getter setter
	}

}
