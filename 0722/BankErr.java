
public enum BankErr { //*enum : 상수값들의 정의 목록을 담음 , 하나의 타입이 됨..?

	NOTACCID, // 계좌번호 없음 
	EXEACCID,  //계좌번호 이미 존재  
	NOTBALANCE, //잔액부족  
	DEPOSIT,//입급 이상(음수,문자등) 
	BANKMENU ,// 메뉴이상(0~6이상의 문자)  
	MAKEACCMENU //계좌 개설 메뉴 이상  
}
