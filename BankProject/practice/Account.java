package practice;

//1인계좌 클래스  -> 기능 조회,입금, 출금
public class Account {

	String num; // 계좌번호
	String name; // 이름
	int balance; // 잔액
	
	
	public Account() { // 기본 생성자
	
	}
	
	Account(String num,String name,int money){ //초기화를 위한 인자가 있는 생성자
		this.num = num;
		this.name= name;
		this.balance = money;
	}
	
	String info()  { //출력 메서드
	
		return String.format("계좌번호 :%s, 이름: %s ,잔액 : %d ",num,name,balance);
	}
	void deposit(int money) {
		balance +=money;
	}
	
	void withdraw (int money) {
		balance -=money;
	}
	
	public static void main(String[] args) {
		
	Account account = new Account("10001","홍길동",100000);
		System.out.println(account.info());

		account.deposit(10000);
		System.out.println(account.info());
		account.withdraw(5000);
		System.out.println(account.info());
		
	}

}
//출력
//계좌번호  :10001 ,이름 : 홍길동 , 잔액 : 100000
//계좌번호  :10001 ,이름 : 홍길동 , 잔액 : 110000 ->입급
//계좌번호  :10001 ,이름 : 홍길동 , 잔액 : 105000 ->출금