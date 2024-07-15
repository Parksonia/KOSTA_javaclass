class Account {
	String id;
	String name;
	int balance; 

	String print () {	
		return  String.format("계좌번호 : %s, 이름 : %s, 잔액 : %d", id,name,balance);
	}

	//	int deposit(int money) {
	//		System.out.println(money+"원 입금되었습니다.");
	//		
	//		return balance += money;
	//	}
	//	int withdraw (int money) {
	//		System.out.println(money+"원 출금되었습니다.");
	//		return balance -= money;
	//	}

	void deposit(int money) {
		balance += money; 
	}
	void withdraw (int money) {
		balance -= money;
	}


}


public class ClassTest2 {

	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account();
		Account account3 = new Account();

		account1.name = "홍길동"; 
		account1.id = "10001";
		account1.balance = 100000;
		account1.deposit(10000);
	
		
		account2.name = "김길동"; 
		account2.id = "10002";
		account2.balance = 200000;
		account2.withdraw(10000);

		account3.name = "고길동"; 
		account3.id = "10003";
		account3.balance = 300000;

		System.out.println(account1.print());
		System.out.println(account2.print());
		System.out.println(account3.print());

//		System.out.println("현재 잔액은 :" +account1.deposit(10000)+"원 입니다.");
//		System.out.println("현재 잔액은 :"+account1.withdraw(10000)+"원 입니다.");

		
		

	}

}
//계좌번호 :10001, 이름 : 홍길동 , 잔액 :100000
//계좌번호 :10002, 이름 : 김길동 , 잔액 :200000
//계좌번호 :10003, 이름 : 고길동 , 잔액 :300000