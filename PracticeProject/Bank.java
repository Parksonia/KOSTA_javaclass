import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;

public class Bank {

	Scanner scanner = new Scanner(System.in);
	Account[] accounts = new Account[100]; 
	// 100개의 계좌를 저장할 수 있는 계좌 목록 클래스 배열
	//Account 가 SpecialAccount를 상속 했으면 Account a = new SpecialAccount(); 도 가능! 모두 품을 수 있다.
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
		return Integer.parseInt(scanner.nextLine());
	}

	public void selMakeAccount() {
		System.out.println("[계좌 개설]");
		System.out.println("1.일반 계좌 개설");
		System.out.println("2.특수 계좌 개설");
		System.out.println(">>");
		int sel = Integer.parseInt(scanner.nextLine());
		switch (sel) {
		case 1:
			makeAccount();
			break;
		case 2:
			makeSpecialAccount();
			break;
		}
	}

	public void makeAccount() {
		System.out.println("[계좌개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		if(searchAccountByNum(num)!=null) { //null이 아니라는 의미는 이미 존재하는 계좌라는 뜻
			System.out.println("계좌번호가 중복됩니다.");
			return;
		}
		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		accounts[cnt++] = new Account(num,name,money);
	
	
	}

	public void makeSpecialAccount() {
		
		System.out.println("[특수계좌개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		if(searchAccountByNum(num)!=null) { //null이 아니라는 의미는 이미 존재하는 계좌라는 뜻
			System.out.println("계좌번호가 중복됩니다.");
			return;
		}
		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		System.out.print("등급(VIP-V, Gold-G, Silver-S, Normal-N) :");
		String grade = scanner.nextLine();
		
		accounts[cnt++] = new SpecialAccount(num,name,money,grade);
	
	}

	public Account searchAccountByNum(String num) {
		Account account = null; // 클래스 배열에 저장된 주소지로 알맞은 시작주소를 찾아서 클래스변수에 저장, 그럼 시작주소가 저장됨 
		
		for(int i=0; i<cnt; i++) {
			if(accounts[i].getNum().equals(num)) {
				account = accounts[i];
			}
		}
		return account;
	}
	public void deposit() {
		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = searchAccountByNum(num);

		if (account == null) { //입력 계좌가 존재하지 않는것은 틀리게 입력한 것.

			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		account.deposit(money);  
		// acccount에 담긴게 일반계좌면 해당 주소지는 Account 클래스의 메서드를 사용할테고
		//특수계좌라면 SpecialAccount라면 메서드는 오버라이딩 된 deposit()이 호출된다.

	}
	public void withdraw() {
		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		System.out.println("출금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		Account account = searchAccountByNum(num);

		if (account == null) { 

			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		account.withdraw(money); //specialAccount 딱히 오버라이딩 할 필요 없음

	}
	public void accoutInfo() {
		System.out.println("[계좌조회]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		Account account = searchAccountByNum(num);
		if (account == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;		
		}
		System.out.println(account.info());
	}
	public void allAccountInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.println(accounts[i].info());
		}
		
	}
	public static void main(String[] args) {
		Bank bank = new Bank(); // bank안의 메서드 사용 가능
		int sel;

		while (true) {
			sel = bank.selectMenu();
			if (sel == 0) {
				System.out.println("===코스타 은행을 이용해주셔서 감사합니다===");
				break;
			}

			switch (sel) {
			case 1:
				bank.selMakeAccount();
				break;
			case 2:
				bank.deposit();
				break;
			case 3:
				bank.withdraw();
				break;
			case 4:
				bank.accoutInfo();
				break;
			case 5:
				bank.allAccountInfo();
				break;
			}
		}

	}

}
