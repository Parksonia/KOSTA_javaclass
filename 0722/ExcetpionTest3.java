
public class ExcetpionTest3 {

	public static void main(String []args) {
		try {
			System.out.println(1);
			throw new Exception("내가 만든 예외");  //예외도 객체이기 떄문에 생성해서 예외를 던져줌!
		} catch (Exception e) {
			e.printStackTrace(); //예외에대한 전체 정보를 알려줌
			
		}
		System.out.println("종료");
	}
}
