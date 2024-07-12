package chapter5;

// [5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
//을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
public class Exe5_8 {

	public static void main(String[]args) {
		

			int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
			 int[] counter = new int[4];
			 for(int i=0; i < answer.length;i++) {
			 
				 counter[answer[i]-1]++; // **answer의 값이 인덱스로 사용됨 
				 
			 }
			 for(int i=0; i < counter.length;i++) {
				 System.out.print(counter[i]); //  카운트된 갯수 출력
			
				 for(int j=0; j<counter[i]; j++) { // 갯수만큼 *찍기
					 System.out.print("*");
					 
				 }
				 System.out.println();
			 }
		
	}
}
//counter[0]=3
//counter[1]=2
//counter[2]=2
//counter[3]=4

//3 ***
//2 **
//2 **
//4 ****