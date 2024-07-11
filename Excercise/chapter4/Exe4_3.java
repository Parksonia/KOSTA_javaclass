package chapter4;

public class Exe4_3 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i = 1; i <=10; i++) { //10행
			for(int j=1; j<=i; j++) {
				sum += j;
			}
			
		}
		System.out.println(sum);
	}
}
//10행
//1      i=1, j=1        
//1+2    i=2 ,j=2
//1+2+3  i=3, j=3
//1+2+3+4
//1+2+3+4+5
//1+2+3+4+5+6.....