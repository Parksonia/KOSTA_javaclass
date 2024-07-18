class Member {
	static final String CLUB ="Running"; // static final 변수는 명시적 초기화 또는 static블럭에서 초기화 한다. 	
	final int NUMBER ; 
	public Member(int no) { // final은 초기화가 되지 않으면 에러난다. 초기화는 생성자에서!
		this.NUMBER = no;
	}
    
	String infoString() {
		return "no:" +NUMBER+", club:"+CLUB;
	}

//	static {
//		CLUB ="Running";
//	}

}


public class FinalTest {

	public static void main(String[] args) {
	
		Member member = new Member(10);
		Member member2 = new Member(20);
		
		System.out.println(member.infoString());
		System.out.println(member2.infoString());
		
		
		
		
	}

}
