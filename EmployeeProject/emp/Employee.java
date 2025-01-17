package emp;
import dept.Department;

public class Employee {

	int num;
	String name;

	Department department;
	int dNum;
	String dName;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public int getdNum() {
		return dNum;
	}

	public void setdNum(int dNum) {
		this.dNum = dNum;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Employee() { // 기본 생성자
	
	}
	
	//사번,이름,(부서 클래스:부서번호,부서), 급여
	public Employee(int num,String name,Department department) {
	
	
		this.num = num;
		this.name = name;
		
		this.department = department;

	}
	public Employee(int num,String name,int dNum,String dName) {
//		this.num = num;
//		this.name = name;
//		this.dNum = dNum;
//		this.department = new Department(dNum,dName);
		this(num,name,new Department(dNum,dName));  //다른 생성자 호출해서 활용 

	}
	
	public Employee(int num, String name) {
		this(num,name,new Department());
	}
	
	public String info() {
		return String.format("사번 : %d, 이름 : %s, 부서 :%s", num,name,department.getdName());
	}
	public int getPay() {
		return 0;
	}

}
