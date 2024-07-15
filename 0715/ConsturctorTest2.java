class Member {
	int num;
	String name;
	String phone;
	String email;
	String address;

	// 기본생성자
	Member() {
	} // 생성자를 하나라도 만들면 기본생성자는 수동으로 만들어야 함.컴파일러 자동 추가가 안됨, 에러난다.

	Member(int numarg){
		num = numarg; 
	}
	
	Member(int numarg, String namearg) {
		this(numarg, namearg, null, null, null);// 생성자에서 또 다른 생성자를 호출할 수도 있다.
	}

	Member(int numarg, String namearg, String phonearg) {
		this(numarg, namearg, phonearg, null, null);
	}

	Member(int numarg, String namearg, String phonearg, String emailarg) {
		this(numarg, namearg, phonearg, emailarg, null);
	}

	// 생성자가 오버로딩이 있다면 반드시 기본생성자가 추가되어 있어야함
	Member(int numarg, String namearg, String phonearg, String emailarg, String addressarg) {
		num = numarg;
		name = namearg;
		phone = phonearg;
		email = emailarg;
		address = addressarg;
	}

	String info() {
		return String.format("[%d,%s,%s,%s,%s]", num, name, phone, email, address);
	}

}

public class ConsturctorTest2 {

	public static void main(String[] args) {

		Member member1 = new Member(); // 기본생성자 자동 호출 (생성자가 하나도 없다면 컴파일러가 기본 생성자 추가함)
		member1.num = 101;
		member1.name = "고길동";
		member1.phone = "01011112222";
		member1.email = "kgd@kosta.com";
		member1.address = "서울시 강서구";
		Member member2 = new Member(100, "홍길동", "01012345678", "hgd@kosta.com", " 서울시 금천구 독산동");

		Member member3 = new Member(102, "김길동");
		Member member4 = new Member(103, "하길동", "01022223333");
		Member member5 = new Member(104);
		Member member6 = new Member(105, "차길동", "010456789", "cha@kosta.com");

		System.out.println(member1.info());
		System.out.println(member2.info());
	}

}
