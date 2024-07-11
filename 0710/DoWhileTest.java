import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int input = 0 ,sum =0;
		
		do {
			input = sc.nextInt();
			sum+= input;
		}while(input !=0); //0을 입력하면 거짓이되어 do-while을 빠져나감
		System.out.println(sum);
	}

}
