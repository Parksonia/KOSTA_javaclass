package chapter4;

public class Exx4_1 {

	public static void main(String[] args) {
		
		//1.
		int x = 15;
		if(x>10 && x<20) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		//2.
		char ch2 ='\t';
		if(ch2 !=' ' && ch2!='\t') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		//3.
		char ch3 ='x';
		if(ch3=='x'|| ch3=='X') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		//4.
		char ch4 ='0';	
		if(ch4>='0'&& ch4<='9') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		//5.
		char ch5 ='A';
		if(ch5>='A'&&ch5<='Z'|| ch5>='a'&&ch5<='z') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		//6.윤년 계산
		int year = 2024;
		if(year % 400 == 0 || year%4 == 0 && year%100 !=0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		//7.
		boolean powerOn = false;
//		if(powerOn == false) {
//			powerOn = true;
//		}
		System.out.println(!powerOn);
		
		//8.str이 "yes"일 때 true인 조건식 ** 중요
		String str ="yes";
		System.out.println(str.equals("yes"));
	}

}
