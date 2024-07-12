import java.util.Scanner;

public class ArrayTest8 {
//학생들의 점수를 입력 받다가 0이 입력되면 그때까지 입력받은 점수를 10점 단위로 구분하여 점수대별 학생수를 출력하는 프로그램을 작성해라
// 학생수는 최대 100명 이하
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in); 
		int[] score = new int[100];
		
			for(int i=0; i<100; i++) {
				int input =sc.nextInt();
				if(input == 0)break;
				score[input/10]++;
				
			}
			
			for(int i=score.length-1; i>=0; i--) { //100점 부터 출력하려면, socre.length-1를 i로 둔다.
			if(score[i]==0)continue;
				System.out.println(String.format("%d 점 : %d",i*10,score[i]));
			}
		
		

	}

}


//입력
//63 80 95 100 46 64 88 0