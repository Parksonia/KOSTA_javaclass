package emp;

import dept.Department;

public class Freelancer extends Employee implements IBusinessTrip{

	int time;
	int payPerTime;
	

	public Freelancer() {}
	public Freelancer(int num,String name,Department department,int time,int payPerTime) {
		super(num,name, department);
		this.time = time;
		//this.payPerTime =payPerTime*time;
		this.payPerTime = payPerTime;
	}
	
	@Override
	public int getPay() {
		
		return payPerTime*time;
	}
	@Override
	public String info() {

		return String.format("사번 : %d, 이름 : %s, 부서 :%s, 급여 :%d ", num,name,department.getdName(),getPay());
	}

	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPayPerTime() {
		return payPerTime;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	@Override
	public void goBusinessTrip(int day) {
		time+=(day*24);
	}
	
}
