package acc;

import exc.BankErr;
import exc.BankException;

//하나의 계좌 클래스 ->기능: 조회, 입금, 출금
public class Account {

	String num;
	String name;
	int balance;

	Account() { // 기본 생성자

	}

	public Account(String num, String name, int balance) { // 인자값이 있는 생성자
		this.num = num;
		this.name = name;
		this.balance = balance; // 매개변수와 변수명이 동일하기 때문에 멤버변수 앞에 this. 붙여줌
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String toString() { // 출력 메서드
		return String.format("계좌번호 :%s ,이름 : %s , 잔액 : %d", num, name, balance); // 같은 클래스 변수를 공유 받음(자동으로 this.를 붙인것과
																					// 같다)
	}

	public void deposit(int money) throws BankException { // 입금 메서드
		if(money<=0) throw new BankException("입금 오류", BankErr.DEPOSIT);
		balance += money;
	}

	public void withdraw(int money)  throws BankException { // 출금 메서드
		if(money<=0) throw new BankException("출금 오류", BankErr.WITHDRAW);
		if(money>balance) throw new BankException("출금 오류", BankErr.NOTBALANCE);
		balance -= money;
	}

	public static void main(String[] args)  throws BankException {

		Account acc1 = new Account("10001", "홍길동", 100000); // 생성자 객체의 멤버변수 초기화
		System.out.println(acc1); // 인스턴스(acc1)메서드

		acc1.deposit(10000); // 메서드 호출
		System.out.println(acc1);

		acc1.withdraw(5000); // 메서드 호출
		System.out.println(acc1);
	}

}
//출력
//계좌번호  :10001 ,이름 : 홍길동 , 잔액 : 100000
//계좌번호  :10001 ,이름 : 홍길동 , 잔액 : 110000
//계좌번호  :10001 ,이름 : 홍길동 , 잔액 : 105000
