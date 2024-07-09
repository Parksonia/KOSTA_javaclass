
public class Operator {

	public static void main(String[] args) {

		int n = 10, m = 20;
		int a = 10, b = 20;
		int r = 10+20; // +연산 -> = 값 대입
		
		
		int rn = n++; // n을 rn에 값을 저장하고 n++ 함
		System.out.println(rn);
		System.out.println(n);
		
		int rm = ++m;
		System.out.println(rm); //m++ 한 값을 rm에 값을 저장 
		System.out.println(m);
	
		int t = 101,z = 102;
		System.out.println(++t);
		System.out.println(z++);
		
		byte b2 = 10;
		//byte br2 = b2+1; 에러 발생 -> b2+(byte)1;도 에러
		byte br2 = (byte)(b2+1);
		
		short s = 20;
		//short sr = b2+s; 에러 발생
		int sr = b2+s;
		
		//double dd = 10/4는 정수 나누기 정수기 때문에 2.0 출력
		double dd = (double)10/4; //형변환해야 2.5로 출력 
		System.out.println(dd);
	}

}
