
public class ExceptionTest2 {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 10, 20, 30, 40 };
		int[] arr2 = new int[] { 5, 0, 6, 8, 2 };

		
		int divSum = 0;
		for (int i = 0; i < arr2.length; i++) {
//			try {
//				
//				divSum += arr1[i] / arr2[i];
//				
//			} catch (ArithmeticException e) {
//
//				
//			} catch (ArrayIndexOutOfBoundsException e) {
//				divSum += 1;
//			}

			try {
				
				divSum += arr1[i] / arr2[i];
			
			//상위클래스의 Exception으로 하위 exception들을 한번에 처리 가능  
			//그러나 지양해야함 
			//ArithmeticException,ArrayIndexOutOfBoundsException	
			} catch (Exception e) { 
				
			}

		}

		System.out.println(divSum);
	}

}
