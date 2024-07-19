package emp;

import dept.Department;

public class Permanet extends Employee {
	int pay;
	
	public Permanet() {}
	public Permanet(int num,String name,Department department,int pay) {
		super(num, name, department);
		this.pay = pay;
		//setPay(pay);
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	//급여 총액을 구하기 위해 각각 getPay()를 메서드 오버라이딩 하여 사용 
	@Override
	public int getPay() {
	
		return pay;
	}
	
	// info()출력을 위해 오버라이딩 함
	@Override
	public String info() {
		return String.format("사번 : %d, 이름 : %s, 부서 :%s,급여 :%d", num,name,department.getdName(),pay);
	}
	
}
