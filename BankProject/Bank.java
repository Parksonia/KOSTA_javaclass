import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import exc.BankErr;
import exc.BankException;

public class Bank {

	public Bank() {

	}

	Scanner scanner = new Scanner(System.in);
	// 여러개의 계좌를 저장하기 위해 Account클래스의 배열객체를 만듦
	ArrayList<Account> accs = new ArrayList<>();

	int selectMenu() throws BankException {
		System.out.println("[코스타 은행]");
		System.out.println("0. 종료");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌 조회");
		System.out.println("5. 전체 계좌 조회");
		System.out.println(">>");
		int sel =Integer.parseInt(scanner.nextLine()); // 번호를 작성하면 int로 변환하여 반환
		if(sel<0 || sel>5) {
			throw new BankException("선택 오류", BankErr.BANKMENU);
		}
		return sel;
	}

	void selMakeAccount()  throws BankException{
		System.out.println("[계좌 개설]");
		System.out.println("1.일반 계좌 개설");
		System.out.println("2.특수 계좌 개설");
		System.out.println(">>");
		int sel = Integer.parseInt(scanner.nextLine());
//		if(sel<0||sel>2) {
//			throw new BankException("선택 오류",BankErr.MAKEACCMENU);
//		}
		switch (sel) {
		case 1:
			makeAccount();
			break;
		case 2:
			makeSpecialAccount();
			break;
		default : new BankException("메뉴 오류", BankErr.MAKEACCMENU);
		}

	}

	void makeAccount() throws BankException{
		System.out.println("[계좌개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();

		if (searchAccByNum(num) != null) {
			throw new BankException("계좌 오류",BankErr.EXEACCID);			
		}

		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		
		accs.add (new Account(num, name, money)); // cnt 0 으로 초기화 돼 있음, 먼저 0번 인덱스부터 넣고 ++ 됨

	}

	void makeSpecialAccount() throws BankException{
		System.out.println("[특수 계좌 개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		if (searchAccByNum(num) != null) {
			throw new BankException("계좌 중복", BankErr.EXEACCID);
		}
		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		if(money<0) {
			throw new BankException("입금 이상", BankErr.DEPOSIT);
		}
		System.out.print("등급(VIP-V, Gold-G, Silver-S, Normal-N) :");
		String grade = scanner.nextLine();

		accs.add(new SpecialAccount(num, name, money, grade)); // cnt 0 으로 초기화 돼 있음, 먼저 0번 인덱스부터 넣고 ++ 됨

	}

	Account searchAccByNum(String num) { // 계좌 찾는 메서드를 만듦
		for(Account acc: accs) {
			if(acc.getNum().equals(num)) {
				return acc;
			}
		}
		return  null;
	}
//		Account acc =null;	
//		for (int i = 0; i < cnt; i++) {
//			if (accs[i].getNum().equals(num)) {
//				acc = accs[i];
//				break;
//			}
//		}
//		return acc;
//	}

	void deposit() throws BankException{ // 계좌번호와 입금할 돈을 입력 받기

		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		Account acc = searchAccByNum(num);

		if (acc == null) { // 계좌번호가 같으면
			throw new BankException("계좌 오류", BankErr.NOTACCID);
	
		}
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		//입금 이상은 Account 에서 처리함 
		acc.deposit(money); // Account 에 있는 입금을 활용 함
		
		// accs[i].balance += money; // 해당 돈을 계좌에 입금
	}

	void withdraw() throws BankException {
		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		Account acc = searchAccByNum(num);

		if (acc == null) { // 계좌번호가 없으면
			throw new BankException("계좌 오류",BankErr.NOTACCID);
		}

		System.out.println("출금액 :");
		int money = Integer.parseInt(scanner.nextLine());
// 		Account에서 예외 처리 함 
//		if(money<0) {
//			throw new BankException("출금 이상", BankErr.WITHDRAW);
//		}
//		if(acc.getBalance()<money) {
//			throw new BankException("잔액 부족", BankErr.NOTBALANCE);
//		}
//	
		acc.withdraw(money); // Account 에 있는 입금을 활용 함

	}

	void accoutInfo()throws BankException {

		System.out.println("[계좌조회]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		Account acc = searchAccByNum(num);
		if (acc == null) { // 계좌번호가 없으면
			throw new BankException("계좌 오류",BankErr.NOTACCID);
		}

		System.out.println(acc);
	}

	void allAccountInfo() {		
		System.out.println("[전체 계좌 조회]");
		Iterator<Account> iterator = accs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		for (int i = 0; i < cnt; i++) { // 계좌가 null인 경우를 예방하기 위해 cnt를 활용함
//			System.out.println(accs[i]);
//		}
	}

	public static void main(String[] args) throws BankException{
		Bank bank = new Bank(); // bank객체 생성

		int sel;

		while (true) {
			try { //해당 case들을 제외한 문자 입력 시 다시 무한 반복을 돌 수 있게됨.
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
			
			}catch (NumberFormatException e) {
				System.out.println("입력 형식이 맞지 않습니다.");
			
			}catch (BankException e) {
				System.out.println(e.toString());
				
			}
		
		}

	}

}
