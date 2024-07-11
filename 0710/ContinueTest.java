
public class ContinueTest {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i%3==0)continue; // 3의 배수는 skip된다.
			sum+= i;
		}
		System.out.println(sum);

	}

}
