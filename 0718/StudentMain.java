

import dept.Department;
import stu.Student;

public class StudentMain {

	static Student[] studs = new Student[100]; // 클래스배열
	static int cnt;
	
	//Student student;
	
	static void addStudent(Student student) { // static 안에서는  static 인 메서드만 호출 가능
		studs[cnt++] = student;
	}
	static Student findStudentByNum(int studNum) {
		Student student = null;
		for(int i=0; i<cnt; i++) {
			if(studNum == studs[i].getNum()) {
				student = studs[i];
				break;
			}
		}
		return student;
		
	}
	static void transfer(int studNum,int deptNum,String deptName) {
		Student student = findStudentByNum(studNum);
		if(student == null) {
			System.out.println("학번오류");
			return;
		}
		if(student.getDepartment() == null) {
			student.setDepartment(new Department(deptNum,deptName));
		}else {
			student.getDepartment().setNum(deptNum);
			student.getDepartment().setName(deptName);
		}
		System.out.println(student.toString());
	}
	static void studentInfoByStudNum(int studNum) {

		Student student = findStudentByNum(studNum);
		if(student== null) {
			System.out.println("학번오류");
			return;
		}
		System.out.println(student.toString());
	}
	static void studentInfoByDeptNum(int deptNum) {
		for(int i=0;i<cnt; i++) {
			if(studs[i].getDepartment().getNum() == deptNum) {
				System.out.println(studs[i].toString());
			}
		}
		
	}
	
	public static void main(String[] args) {
	
		
	// 학번,이름,학년,과번호,학과명,학교명	
	addStudent(new Student(100,"홍길동",1,10,"기계공학","호서대")); 
	addStudent(new Student(101,"김길동",2,11,"전자공학","호서대")); 
	addStudent(new Student(102,"하길동",3,12,"철학","호서대")); 
	addStudent(new Student(103,"서길동",3,10,"산업디자인","호서대")); 
 
	 transfer(100,13,"산업디자인"); //전과 : 학번이 100인 학생이 산업디자인과로 전과
	 studentInfoByStudNum(102); // 102 학번 학생 조회
	 studentInfoByDeptNum(10); // 학과번호가 13인 학생목록 조회
	
	
	}

}

//학번: 102,이름 : 하길동,학과:철학,대학 :호서대
//학번: 100,이름 : 홍길동,학과:산업디자인,대학 :호서대
//학번: 103,이름 : 서길동,학과:산업디자인,대학 :호서대
