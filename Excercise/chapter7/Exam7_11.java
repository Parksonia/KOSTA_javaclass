package chapter7;

public class Exam7_11 {

	public static void main(String[] args) {

		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());

	}

}
//[실행결과]
//		 CH:10
//		 CH:20
//		 CH:10
//		 CH:20