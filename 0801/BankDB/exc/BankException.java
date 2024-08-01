package exc;

public class BankException extends Exception {

	private final BankErr ERR_CODE;
	
	public BankException(String msg,BankErr code){
		super(msg); // 부모인 Exception 에게  메세지를 넘김
		ERR_CODE = code; // final 변수는 생성자에서 초기화*
	}
	public BankErr getErrCode() {
		return ERR_CODE;
	}
	@Override
	public String toString() {
		String message = getMessage();
		
		switch (ERR_CODE) {
		case NOTACCID: 
			message += " : 계좌번호 오류입니다."; break;
		case EXEACCID :
			message += " : 이미 존재하는 계좌번호 입니다."; break;
		case NOTBALANCE :
			message += " : 잔액이 부족합니다."; break;
		case DEPOSIT :
			message += " : 입금 오류입니다."; break;
		case WITHDRAW :
			message +=" 출금 오류 입니다."; break;
		case BANKMENU :
			message += " : 0-5 메뉴만 선택하세요."; break;
		case MAKEACCMENU :
			message += " :1-2 메뉴만 선택하세요."; break;
		}
		return message;
	}
}
