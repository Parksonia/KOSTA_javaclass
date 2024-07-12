import java.util.Scanner;

public class ArrayTest4 {
//	영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
//	영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.//

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] cnt = new int[26];
		while(true) {
			char input = sc.next().charAt(0); // 입력받은 글자를 저장
						
			if(!(input>='A' && input<='Z')) break;
		
		
			cnt[input-'A']++; //0으로 초기화된 값을 ++해주면 개수가 올라 갈 수 있음
		}
		for(int i=0; i<cnt.length; i++) {
			if(cnt[i]==0)continue; // 0으로 최기화된거라면 다음꺼 확인
			
			System.out.println(String.format("%c : %d",(char)(i+'A') ,cnt[i]));
		}
		
	}

}
