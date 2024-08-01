import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import dao.BankDAO;
import exc.BankErr;
import exc.BankException;

//service 역할을 함
public class Bank {

	public Bank() {

	}

	Scanner scanner = new Scanner(System.in);

	int selectMenu() throws BankException {
		System.out.println("[코스타 은행]");
		System.out.println("0. 종료");
		System.out.println("1. 계좌 개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌 조회");
		System.out.println("5. 전체 계좌 조회");
		System.out.println(">>");
		int sel = Integer.parseInt(scanner.nextLine()); // 번호를 작성하면 int로 변환하여 반환
		if (sel < 0 || sel > 5) {
			throw new BankException("선택 오류", BankErr.BANKMENU);
		}
		return sel;
	}

	void selMakeAccount() throws BankException {
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
		default:
			new BankException("메뉴 오류", BankErr.MAKEACCMENU);
		}

	}

	void makeAccount() throws BankException {
		System.out.println("[계좌개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();

		Account acc;
		acc = BankDAO.selectAccount(num);
		
		if(acc != null) {
			throw new BankException("계좌 오류", BankErr.EXEACCID);
		}
			
		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());

		BankDAO.insertAccount(new Account(num, name, money));

	}

	void makeSpecialAccount() throws BankException {
		System.out.println("[특수 계좌 개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		Account acc = BankDAO.selectAccount(num);
		
		if (acc != null) {
			throw new BankException("계좌 중복", BankErr.EXEACCID);
		}
		
		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		if (money < 0) {
			throw new BankException("입금 이상", BankErr.DEPOSIT);
		}
		System.out.print("등급(VIP-V, Gold-G, Silver-S, Normal-N) :");
		String grade = scanner.nextLine();
		BankDAO.insertAccount(new SpecialAccount(num, name, money, grade));
	
	}


	void deposit() throws BankException { // 계좌번호와 입금할 돈을 입력 받기

		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		Account acc = BankDAO.selectAccount(num);
		if (acc == null ) { // 계좌번호가 같으면
			throw new BankException("계좌 오류", BankErr.NOTACCID);

		}
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		// 입금 이상은 Account 에서 처리함
		acc.deposit(money);
		BankDAO.updateBalance(acc);
		// accs[i].balance += money; // 해당 돈을 계좌에 입금
	}

	void withdraw() throws BankException {
		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		Account acc = BankDAO.selectAccount(num);
		if (acc ==null ) { // 계좌번호가 같으면
			throw new BankException("계좌 오류", BankErr.NOTACCID);

		}
		System.out.println("출금액 :");
		int money = Integer.parseInt(scanner.nextLine());

		acc.withdraw(money);
		BankDAO.updateBalance(acc);

	}

	void accoutInfo() throws BankException {

		System.out.println("[계좌조회]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();

		Account acc = BankDAO.selectAccount(num);
		if (acc == null ) { // 계좌번호가 같으면
			throw new BankException("계좌 오류", BankErr.NOTACCID);

		}
		System.out.println(acc);
	}

	void allAccountInfo() {
		System.out.println("[전체 계좌 조회]");
		List<Account> accs = BankDAO.selectAllAccount();
		for(Account acc: accs) {
			System.out.println(acc);
		}
		
//		Iterator<Account> iterator = accs.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		for (int i = 0; i < cnt; i++) { // 계좌가 null인 경우를 예방하기 위해 cnt를 활용함
//			System.out.println(accs[i]);
//		}
		
	}



	public static void main(String[] args) throws BankException {
		Bank bank = new Bank(); // bank객체 생성
		
		int sel;

		while (true) {
			try { // 해당 case들을 제외한 문자 입력 시 다시 무한 반복을 돌 수 있게됨.
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

			} catch (NumberFormatException e) {
				System.out.println("입력 형식이 맞지 않습니다.");

			} catch (BankException e) {
				System.out.println(e.toString());

			}

		}

	}
}
//1001 홍길동 100000
//1002 김길동 200000 VIP
//
//N1001홍길동 100000SVIP1002김길동200000

//Line단위로 읽어오기 (갯수가 필요없음)
//구분자로 저장하고 , split하여 데이터 넣기
//1001#홍길동#100000
//1002#김길동#200000#VIP
