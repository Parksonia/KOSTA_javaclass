package practice;

import java.util.Scanner;

//Account를 활용하여 여러 계좌 중 하나의 계좌에 입,출금, 조회 할 수 있는 클래스 만들기
public class Bank {

	Scanner scanner = new Scanner(System.in);
	Account[] accounts = new Account [100];// 100개의 계좌 개설 가능
	int cnt;
	
	int selectMenu() {
		System.out.println("[코스타 은행]");
		System.out.println("0. 종료");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌 조회");
		System.out.println("5. 전체 계좌 조회");
		System.out.println(">>");
		
		return Integer.parseInt(scanner.nextLine()); // 입력 숫자를 반환

	}
	void makeAccount() {
		System.out.println("[계좌개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		accounts[cnt++] = new Account(num,name,money) ;// 객체 생성및 생성자 통한 초기화
	}
	Account searchAccByNum(String num) { // 목록 중에서 입력 계좌 번호를 통해 계좌를 찾을 수 있음
		Account account = null;
		for(int i=0; i<cnt; i++) {
			if(num.equals(accounts[i].num)) {
				account = accounts[i];
				break;
			}
		}
		return account;
	}
	void accountInfo() {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		Account account = searchAccByNum(num); //계좌번호로 조회한 객체 반환 받음
		
		if(account ==null) {
			System.out.println("계좌번호가 틀립니다.");
		}
		System.out.println(account.info());
	
	}
	
	void deposit() { //계좌번호를 입력해서 해당 계좌에 입금하기
		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = searchAccByNum(num); // 맞는 계좌번호 계정 가져오기
		
		if(num==null) { 
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		account.deposit(money);
	}
	void withdraw() { //계좌번호를 입력해서 해당 계좌에서 출금하기
		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		System.out.println("출금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = searchAccByNum(num); // 맞는 계좌번호 계정 가져오기
		
		if(num==null) { 
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		account.withdraw(money);
	}
	
	
	
	void allAccountInfo() {
		System.out.println("[전체 계좌 조회]");
		for(int i=0; i<cnt; i++) { // 계좌가 없을 수 있음 accounts의 length로 접근하면 에러
		 System.out.println(accounts[i].info());
		}
	}
	
	
	public static void main(String args[]) {
		
		Bank bank = new Bank();
		
		int number;
		
		while(true) { // 무한으로 돌아감
		
			number = bank.selectMenu(); // atm실행, 반환 숫자로 받음
			if(number == 0) {
				System.out.println("Thank you");
				break; // 0이면 종료
			}
			
			
			switch(number) { // 숫자에 따라 각각의 메서드 호출함
			
			case 1 : // 계좌 개설
			bank.makeAccount();
				break;
			case 2 : // 입금
				bank.deposit();
				break;
			case 3: // 출금
				bank.withdraw();
				break;
			case 4:// 계좌 조회
				bank.accountInfo();
				break;
				
			case 5: // 전체 계좌 조회
				bank.allAccountInfo();
				break;
			}
		}
		
		
		
		
		
	}
	
	
	
}

//출력
//계좌번호  :10001 ,이름 : 홍길동 , 잔액 : 100000
//계좌번호  :10001 ,이름 : 홍길동 , 잔액 : 110000
//계좌번호  :10001 ,이름 : 홍길동 , 잔액 : 105000
