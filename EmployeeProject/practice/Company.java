package practice;

public class Company {

	Employee[] employees = new Employee[100]; // 사원 목록 담기 위한 클래스 배열
	int cnt;
	
	void addEmployee(Employee employee) {
		
	employees[cnt++]= employee; 	
				
	}
	void allEmployeeInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.println(employees[i].info());
		}
	}
	
	
}
