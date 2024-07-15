class Data {
	int num;  //instance변수 (멤버변수)
	
}
public class ParamTest1 {
	public static void increment(int d) {
		d = 1000; // 메서드 increment의 지역변수 = 기본형 매개변수
		System.out.println(d);
	}
	
	public static void increment(Data d) { // 객체의 주소값을 인자로 받음 =참조형 매개변수
		d.num = 1000;  //주소값을 넘겨받았기 때문에 해당주소의 num을 변경 
		System.out.println(d.num);
	}
	
	public static void main(String[] args) {
		Data data  = new Data();
		data.num = 10 ;
		increment(data.num); // 메서드 increment 호출
		System.out.println(data.num); // 멤버변수 
		System.out.println("==============");
		increment(data);
		System.out.println(data.num);
	}

}
