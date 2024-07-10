package exe;

public class Exe_1 {

	public static void main(String[] args) {

		int x=2;
		int y = 5;
		int c ='A';
		System.out.println(1 + x << 33); //32가 넘어가면 다시 돌아가 1을 시프트 하는 것과 같다.   //64 32 16 8 4 2 1
		System.out.println(y >=5 ||x <0 && x > 2); // 좌항이 이미 참이므로 true
		System.out.println(y +=10-x++); //13  
		System.out.println(x+=2); // 4
		System.out.println(!('A' <=c && c<='Z')); // false
		System.out.println('C'-c); //67-65 2 
		System.out.println('5'-'0'); //ASCII비교 
		System.out.println(c+1); //66
		System.out.println(++c); //66 값이 바뀌어 대입됨 주의 하기
		System.out.println(c++); //66
		System.out.println(c); //67
	}

}
