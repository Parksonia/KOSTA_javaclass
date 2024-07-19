package acc;

public class SpecialAccount extends Account { // Account의 멤버변수,메서드 상속 받음

	// 상속받았기 때문에 계좌번호,이름,잔액은 사용 가능하기때문에 중복을 줄이고 최대한 활용하는 게 좋다! 상속받는 이유!
	String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		switch (grade.charAt(0)) {
		case 'V':
		case 'v':
			this.grade = "VIP";
			break;
		case 'G':
		case 'g':
			this.grade = "Gold";
			break;
		case 'S':
		case 's':
			this.grade = "Silver";
			break;

		default:
			this.grade = "Normal";
			break;
		}
	}

	public SpecialAccount() {
	}

	public SpecialAccount(String sNum, String sName, int sMoney, String grade) {
		super(sNum, sName, sMoney);
		setGrade(grade);
	}
	@Override
		public void deposit(int money) {
			
			switch(getGrade()) {

			case "VIP" : money *= 1.04; break;
			case "Gold" : money *= 1.03; break;
			case "Silver" : money *= 1.02; break;
			case "Normal" : money *= 1.01; break;
			
			}
			super.deposit(money);
		}
	@Override
	public String info() {
	
		return  String.format("계좌번호 :%s ,이름 : %s , 잔액 : %d, 등급 : %s", num, name, balance,grade);
	}
}
