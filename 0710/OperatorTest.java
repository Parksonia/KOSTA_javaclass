
public class OperatorTest {

	public static void main(String[] args) {
		
		int a = 1000000;
		int b = 2000000;
		
		//long c = a*b ; 오버플로우
		long c = (long)a*b; 
		System.out.println(c);

		
		int i = 'B'-'A'; // char <int라 int로 형변환 됨
		System.out.println(i);
		
		//논리 연산자
		String str = null;
//		if(str.length()== 0 || str != null) {// NullPointException null값이기 때문에 .length메서드를 실행 할 대상이 없는 것 .
//			System.out.println("데이터 없음");

		
		if(str == null ||str.length() == 0) { //앞이 참이면 뒤는 연산하지 않음 
			System.out.println("데이터 없음");  
				
		int n = 10;
		if(n<5 && ++n>10) { // 앞이 거짓이므로 
			System.out.println(""); // 실행하지 않음
			
		}
		System.out.println(n);
			
		}
		
		int m=10;
		m*=3+5; //m=m*(3+5);
		System.out.println(m);
		
	}

}
