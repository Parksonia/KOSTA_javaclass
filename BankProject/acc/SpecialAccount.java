package acc;

public class SpecialAccount extends Account {

	Account account;
	String grade;
	
	public SpecialAccount() {
		
	}
	public SpecialAccount(String num, String name,int balance,String grade) {
		super(num,name,balance);
		setGrade(grade);
		//this.grade = grade;	
	}
		
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		//this.grade = grade;
		switch(grade.charAt(0)) {
		case 'V' :
		case 'v' : this.grade ="VIP"; break;
		case 'G' :
		case 'g' : this.grade ="Gold"; break;
		case 'S' :
		case 's' : this.grade ="Silver"; break;
		default : this.grade = "Normal"; break;
		
		}
	}

	
@Override
public void deposit(int money) {
//	if(getGrade().equals("VIP")) {
//		
//	}
	switch(grade) {
	case "VIP" : money *= 1.04; break;
	case "Gold" : money *= 1.03; break;
	case "Silver" : money *= 1.02; break;
	case "Normal" : money *= 1.01; break;
	}
	super.deposit(money);
}

@Override
public String info() {
	
	return  String.format("계좌번호 :%s ,이름 : %s , 잔액 : %d, 등급 : %s", num, name, balance,grade);
}


}
//기존 bank class Accunt  활용
//Special Account class추가
//
//속성:계좌번호,이름 잔액,등급(vip,gold,silver,normal)->등급을 클래스로 빼야할까?
//기능 : 입금,출금,조회
//
//입금 =>특수계좌는 일반계좌와 다르게 입금시마다 등급별로 이자를 지급하여 더해준다.
//(즉, 10000원 입금할 경우 , vip: 10400원,gold: 10300원,silver: 10200원, normal: 10100원 입금된다.)
//
//출금,조회 : 일반계좌와 같다.
//
//일반계좌의 기능과 비슷하니까.... 상속을 받아라.....
//조회 : 예) 계좌번호 :10001, 이름: 홍길동, 잔액 : 1000000,등급 :vip
//
