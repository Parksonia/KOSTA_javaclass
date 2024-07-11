
public class Variabletest {

	public static void main(String[] args) {
		int age = 30; // 변수가 =의 왼쪽에 올 경우는 변수에 값을 할당하는 것이다.
		System.out.println(age); // 그 이외는 변수에 저장된 값을 활용하는 것.
		age = 40; // 변수는 변하는 수
		System.out.println(age);
		
		int oct = 0100; //0 ->8진수(2진수 3자리씩 자름)로 표현
		int hex = 0x100; //0x ->16진수 (2진수 4자리씩 자름)로 표현
		System.out.println(oct);
		System.out.println(hex);
		
		final double PI = 3.14; //final은 바꾸지 않는 값,대문자 표기 
		System.out.println(PI);
		//PI = 3.141; final 변수는 변경 불가 하므로 에러 발생
		
		char ch ='박'; //char 변수는 한 글자를 작음따음표('')를 사용하여 값을 저장한다.
		System.out.println(ch);

		
		String name = "소연";
		/*String 문자열은 은 참조형,반드시 큰 따음표("")로 데이터를 선언하여 대입한다.
		 문자열은 마지막에 null이 들어감*/
		
		
		float height = 175.3f; //실수형의 기본형태는 double이므로 f를 붙여 데이터형을 정확하게 해야 한다. 
		System.out.println(height);
		double weight  = 86.4;
		System.out.println(weight);

		long lv = 10000000000L; 
		
		boolean married = false;
		
		int a;
//		System.out.println(a); 지역변수는 초기화 하지 않고 사용하면 에러난다.
		
//		char chr2 = ''; char 변수는 따옴포만으로 초기화 할 수 없다.
		String str = ""; //String변수는 따옴표만으로 초기화 할 수 있다.

		String str2 = "abc"+"def";//문자열은 어떤 타입과 +연산을 하면 문자열로 반환된다.
		System.out.println(str2); 
		String str3 ="123"+456;
		System.out.println(str3); //문자열로 인식됨
		String str4 ="7"+7+7;
		System.out.println(str4);
		String str5 = 7+7+"7";
		System.out.println(str5); //문자열을 만나면 그때부터 문자로 인식
	
		
		byte b = 127;
		b++;
		System.out.println(b); //오버플로우
		
		byte b2 = 10;
		int n2 = b2; //byte가 더 작기때문에 자동으로 형변환이 됨(형변환 생략가능)
		
		
	
	}

}
