package exe;

public class Exe3_8 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		int c = a+b;
		
		char ch = 'A';
		ch = (char)(ch+2);

		float f =(float)(3.0/2.0);
		 //오버플로우 모르겠습니다~
		
		float f2 = 0.1f;
		float d = 0.1f;
		
		boolean result= d == f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		//System.out.println("l"+l);
		System.out.println("result="+result);
	}

}
