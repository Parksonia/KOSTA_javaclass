import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;

public class Bank {

	public Bank() {

	}

	Scanner scanner = new Scanner(System.in);
	// 여러개의 계좌를 저장하기 위해 Account클래스의 배열객체를 만듦
	Account[] accs = new Account[100];
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
		return Integer.parseInt(scanner.nextLine()); // 번호를 작성하면 int로 변환하여 반환
	}

	void selMakeAccount() {
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

	void makeAccount() {
		System.out.println("[계좌개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		
		if(searchAccByNum(num)!=null) {
			System.out.println("계좌번호가 중복됩니다.");
			return;
		}
		
		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());

		accs[cnt++] = new Account(num, name, money); // cnt 0 으로 초기화 돼 있음, 먼저 0번 인덱스부터 넣고 ++ 됨

	}

	void makeSpecialAccount() {
		System.out.println("[특수 계좌 개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		if(searchAccByNum(num)!=null) {
			System.out.println("계좌번호가 중복됩니다.");
			return;
		}
		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		System.out.print("등급(VIP-V, Gold-G, Silver-S, Normal-N) :");
		String grade = scanner.nextLine();
		
		accs[cnt++] = new SpecialAccount(num, name, money,grade); // cnt 0 으로 초기화 돼 있음, 먼저 0번 인덱스부터 넣고 ++ 됨

	}

	Account searchAccByNum(String num) { // 계좌 찾는 메서드를 만듦
		Account acc = null;
		for (int i = 0; i < cnt; i++) {
			if (accs[i].getNum().equals(num)) {
				acc = accs[i];
				break;
			}
		}
		return acc;
	}

	void deposit() { // 계좌번호와 입금할 돈을 입력 받기

		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		Account acc = searchAccByNum(num);

		if (acc == null) { // 계좌번호가 같으면

			System.out.println("계좌번호가 틀립니다.");
			return;

		}
		acc.deposit(money); // Account 에 있는 입금을 활용 함
		// accs[i].balance += money; // 해당 돈을 계좌에 입금
	}

	void withdraw() {
		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		System.out.println("출금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		Account acc = searchAccByNum(num);

		if (acc == null) { // 계좌번호가 없으면

			System.out.println("계좌번호가 틀립니다.");
			return;

		}
		
		acc.withdraw(money); // Account 에 있는 입금을 활용 함

	}

	void accoutInfo() {

		System.out.println("[계좌조회]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		Account acc = searchAccByNum(num);

		if (acc == null) { // 계좌번호가 없으면

			System.out.println("계좌번호가 틀립니다.");
			return;		
		}
	
		
		System.out.println(acc.info());
	}

	void allAccountInfo() {
		System.out.println("[전체 계좌 조회]");
		for (int i = 0; i < cnt; i++) { // 계좌가 null인 경우를 예방하기 위해 cnt를 활용함
			System.out.println(accs[i].info());
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank(); // bank객체 생성

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
