package com.test05;

public class Sales extends Employee implements Bonus {

	public Sales() {}
	public Sales(String name,int number,String department,int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	double tax() {
		// TODO Auto-generated method stub
		return salary *0.13;
	}

	@Override
	public void incentive(int pay) {
		setSalary(salary+=(pay*1.2));
	}
	
	@Override
	public void info() {
		super.info();
		System.out.print(String.format("%10s %25s %10s", name,department,salary));
		}
}
