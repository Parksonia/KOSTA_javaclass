package chapter6;
//메서드명 : abs
//기    능 : 주어진 값의 절대값을 반환한다.
//반환타입 : int   
//매개변수 : int value
public class Exam6_24 {

	static int abs(int v) {
		return v<0? -v:v;  // 절대값을 반환하기 위함 음수일 경우 -를 붙이면 절대값만 출력됨 
		
	}
	
	public static void main(String[] args) {
	

		 int value = 5;
		 System.out.println(value+"의 절대값:"+abs(value));
		 value = -10;
		 System.out.println(value+"의 절대값:"+abs(value));
		

	}

}
//출력
//5의 절대값:5
//-10의 절대값:10
