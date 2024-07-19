package emp;

import dept.Department;


public class Sales extends Permanet implements IBusinessTrip {

// pay는 또 Permanet이 가지고 있으니 손녀로 만들어줌 상속의 상속
	int incentive;

	public Sales() {}
	
	public Sales(int num,String name,Department department,int pay,int incentive) {
		super(num, name, department, pay);
		//pay+incentive-sales의 부모로 이미 더해진 값을 보냈다. 그냥 pay 값만 보내면 아래와 같이 getPay()를 또 구현하면 됨
		this.incentive = incentive;
		//setIncentive(incentive);
	}	
	
	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	@Override
	public int getPay() {
		return pay+incentive; //super.getPay() +incentive
	}


	@Override
	public String info() {
		return String.format("사번 : %d, 이름 : %s, 부서 :%s,급여 :%d", num,name,department.getdName(),getPay());
	}

	 @Override
		public void goBusinessTrip(int day) {
			incentive +=day*100000;		
		}
	

}
