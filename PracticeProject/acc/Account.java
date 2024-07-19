package acc;

public class Account {  // 부모  

	String num; //계좌번호
	String name;
	int balance; //계좌잔액
	
	public Account(){}
	public Account(String num,String name,int money) {
		//this.num = num;
		//this.name = name;
		//this.balance = money;
		setNum(num);
		setName(name);
		setBalance(money);
	}
	
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) {
		balance-=money;
	}
	public String info() {
		return String.format("계좌번호 :%s ,이름 : %s , 잔액 : %d", num, name, balance);
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
	
	
}
