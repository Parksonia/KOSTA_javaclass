package com.test05;

public class Secretary extends Employee implements Bonus {

	public Secretary() {
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	double tax() {

		return (double) salary * 0.1;
	}

	@Override
	public void incentive(int pay) {

		setSalary(salary += (pay * 0.8));

	}

	@Override
	public void info() {
		super.info();
		System.out.print(String.format("%10s %25s %10s", name, department, salary));
	}
}
