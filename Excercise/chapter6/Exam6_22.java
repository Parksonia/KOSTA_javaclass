package chapter6;

public class Exam6_22 {

	public static boolean isNumber(String str){
		
		boolean isNum = true;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(!(ch >='0'&& ch <='9')) {
				isNum = false;
				break;
			}
		}
		
		return isNum;
	}
	
	
	public static void main(String[] args) {
		 String str = "123";
		 System.out.println(str+"는 숫자입니까? "+isNumber(str));
		 str = "1234o";
		 System.out.println(str+"는 숫자입니까? "+isNumber(str));

	}

}

//출력
//123는 숫자입니까? true
//1234o는 숫자입니까? false

