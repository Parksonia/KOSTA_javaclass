package com.test02;

public class Student extends Human {

	String number;
	String major;
	
	//기본 생성자
	public Student() {}
	public Student(String name,int age,int heigth,int weight,String number,String major) {
		super(name,age,heigth,weight);
		this.number = number;
		this.major = major;	
	}
	
	@Override
	public String toString() {
		return super.toString()+" "+number+" "+major;
	}
	
}
