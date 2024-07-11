package chapter4;
//
//] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
//드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
//어야  한다. (1)에 알맞은 코드를 넣으시오.
// [Hint] String클래스의 charAt(int i)을 사용

public class Exe4_9 {

	//다시 이해하기  필요함
		public static void main(String[] args) {
			
			String str ="12345";
			int sum = 0;
			for(int i=0; i<str.length(); i++) {
				//sum += (int)str.charAt(i); 실패
				//sum += Character.getNumericValue(str.charAt(i)); //성공
				
				sum += str.charAt(i)-'0'; //char(Ascii코드의-연산은 int 연산이 됨			
				}
			System.out.println(sum);
		}
}
//i=0 ,'1' -'0' (슷지로 바꾸기 위해 0을 뺌)
//i=1,'2'
//i=2,'3'
//i=3,'4'
//i=4,'5'

