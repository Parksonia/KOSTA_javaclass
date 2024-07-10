package exe;

//다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 
//변수b의 값이true가 되도록 하는 코드이다.


public class Exe7 {

	public static void main(String[] args) {
	
		char ch ='Z';

		System.out.println((char)(ch+('a'-'A')));
		
		boolean b= ch>='A'&& ch<'Z'||ch>='a'&& ch <='z'||ch>='0'&&ch<='9';
		System.out.println(b);
		
	}
}
