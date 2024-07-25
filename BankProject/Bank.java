import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
	//ArrayList<Account> accs = new ArrayList<>();
	Map<String, Account> accs = new HashMap<>(); 
	
	
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

		
		if (accs.containsKey(num)) { //이미 존재하는 계좌 
			throw new BankException("계좌 오류",BankErr.EXEACCID);			
		}

		System.out.print("이름 :");
		String name = scanner.nextLine();
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		
		accs.put (num,new Account(num, name, money)); // cnt 0 으로 초기화 돼 있음, 먼저 0번 인덱스부터 넣고 ++ 됨

	}

	void makeSpecialAccount() throws BankException{
		System.out.println("[특수 계좌 개설]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		if (accs.containsKey(num)) {
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

		accs.put(num,new SpecialAccount(num, name, money, grade)); // cnt 0 으로 초기화 돼 있음, 먼저 0번 인덱스부터 넣고 ++ 됨

	}

//HashMap으로 바꾸면 contains로 key값을 통해 존재유무를 확인 할 수 있기 때문에 필요 없음	
//	Account searchAccByNum(String num) { // 계좌 찾는 메서드를 만듦
//		for(Account acc: accs) {
//			if(acc.getNum().equals(num)) {
//				return acc;
//			}
//		}
//		return  null;
//	}
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

		if (!accs.containsKey(num)) { // 계좌번호가 같으면
			throw new BankException("계좌 오류", BankErr.NOTACCID);
	
		}
		System.out.println("입금액 :");
		int money = Integer.parseInt(scanner.nextLine());
		//입금 이상은 Account 에서 처리함 
		accs.get(num).deposit(money); // Account 에 있는 입금을 활용 함
		
		// accs[i].balance += money; // 해당 돈을 계좌에 입금
	}

	void withdraw() throws BankException {
		System.out.println("[입력]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();
		if (!accs.containsKey(num)) { // 계좌번호가 없으면
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
		accs.get(num).withdraw(money); // Account 에 있는 입금을 활용 함

	}

	void accoutInfo()throws BankException {

		System.out.println("[계좌조회]");
		System.out.print("계좌번호 :");
		String num = scanner.nextLine();

		if(!accs.containsKey(num)) {
			throw new BankException("계좌 오류",BankErr.NOTACCID);			
		}
		System.out.println(accs.get(num));
	}

	void allAccountInfo() {		
		System.out.println("[전체 계좌 조회]");
		for(Account account : accs.values()) {
			System.out.println(account);
		}
		
//		Iterator<Account> iterator = accs.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
//		for (int i = 0; i < cnt; i++) { // 계좌가 null인 경우를 예방하기 위해 cnt를 활용함
//			System.out.println(accs[i]);
//		}
	}
	public void saveAccsBin() { // 바이너리 형태로 데이터파일저장
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("accs.bin");
			dos = new DataOutputStream(fos)	;
			
			dos.writeInt(accs.size()); // 계좌 갯수
			for(Account acc : accs.values()) {// 계좌 구분:특수 계좌면 -S , 일반 계좌면 -N
				if(acc instanceof SpecialAccount) { 
					dos.writeChar('S');
					dos.writeUTF(((SpecialAccount)acc).getGrade());
				}else {
					dos.writeChar('N');
				}
				dos.writeUTF(acc.getNum()); //계좌번호
				dos.writeUTF(acc.getName());// 이름
				dos.writeInt(acc.getBalance());// 잔액
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos !=null) dos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}
	public void loadAccsBin() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("accs.bin");
			dis = new DataInputStream(fis);		
			
			char sect;
			String num ="";
			String grade ="";
			String name="";
			int balance =0;
			int cnt = dis.readInt(); // 저장된갯수 읽어옴
			for(int i=0; i<cnt; i++) {
				sect = dis.readChar(); //계좌구분  S,N
				if(sect =='S') {
					grade = dis.readUTF(); //등급
				}
				num=dis.readUTF();
				name =dis.readUTF();
				balance = dis.readInt();
			
				if(sect=='S') {
					accs.put(num,new SpecialAccount(num, name, balance,grade));
				}else {
					accs.put(num, new Account(num, name, balance));
				}
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(dis !=null) dis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws BankException{
		Bank bank = new Bank(); // bank객체 생성
		bank.loadAccsBin(); // 마지막에 저장된 계좌정보를 불러옴
		int sel;

		while (true) {
			try { //해당 case들을 제외한 문자 입력 시 다시 무한 반복을 돌 수 있게됨.
			sel = bank.selectMenu();
			if (sel == 0) {
				System.out.println("===코스타 은행을 이용해주셔서 감사합니다===");
			bank.saveAccsBin(); // 종료하면 계좌 정보를 파일로 반환 받음
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
//1001 홍길동 100000
//1002 김길동 200000 VIP
//
//N1001홍길동 100000SVIP1002김길동200000
//writeInt wirteChar writeUTF writeUTF writeInt writeChar writeUTF writeUTF writeInt writeUTF
