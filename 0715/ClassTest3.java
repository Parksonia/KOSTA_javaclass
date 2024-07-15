class MyMath {
	int val1; // 멤버 변수
	int val2;

	int add() {
		return val1 + val2; // 같은 클래스내 공유되는 멤버변수를 활용하여 메서드에 사용
	}

	int sub() {
		return val1 - val2;
	}

	int mul() {
		return val1 * val2;
	}

	int div() {
		return val2 !=0? val1/ val2 : 0; // 0으로 나누면 exception 발생! 꼭 넣기 
	}
}

public class ClassTest3 {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		mm.val1 = 20;
		mm.val2 = 5;

		System.out.println(mm.add());
		System.out.println(mm.sub());
		System.out.println(mm.mul());
		System.out.println(mm.div());

	}

}
