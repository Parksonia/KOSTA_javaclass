
public class RecursiveCallTest {

	public static int  factorial(int n) { // static 메서드, parameter는 지역변수로 해당 함수만의 변수다.
		
		if(n == 1) return 1;
		
		return n * factorial(n-1);  // 여기서 호출되는 factorial은 인자가 다른 별개의 다른 메서드 
		
	}
	
	public static void main(String[] args) {
		
		int result = factorial(5); // static메서드 메서드명으로 호출 가능 
		System.out.println(result);
		
		result = 1;
		for(int i=5; i>=1; i--) {
			result *= i; 
		}
		
		System.out.println(result);
	}

}
