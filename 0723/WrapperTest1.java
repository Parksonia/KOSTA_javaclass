
public class WrapperTest1 {

	public static void main(String[] args) {
		Integer n = 10; //boxing
		//int와 Integer는 부모 자식관계가 아님
		
		Double double1 = 3.14; // boxing
		int m = n; // unboxing(Integer->int), *downcasting이 아니다.  
		
		//	m = null; //error-> reference type이 아니다.
		n = null;
	}

}
