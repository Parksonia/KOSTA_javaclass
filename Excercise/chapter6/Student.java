package chapter6;

import java.net.NoRouteToHostException;

public class Student {

	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어 점수
	int eng; // 영어 점수
	int math; // 수학 점수

	public Student() {}
	public Student(String name,int ban,int no,int kor,int eng,int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		return String.format("%s %d %d %d %d %d %d %.1f",name,ban,no,kor,eng,math,getTotal(),getAverage());
	
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	public float getAverage() {
		return Math.round(getTotal()/3f*10)/10f;
	}
	
}
