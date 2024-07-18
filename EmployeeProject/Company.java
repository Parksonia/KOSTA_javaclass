import emp.Employee;
import dept.Department;

public class Company {


	
	Employee[] employeeArr = new Employee[100]; // 목록 관리를 위해 Employee 클래스 배열
	int cnt;
	
	void addEmployee(Employee employee) {
		employeeArr[cnt++] = employee;
		
	}
	
	public void allEmployeeInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.println(employeeArr[i].info());
		}
		
	}
	
	
	public int getTotalPay() {
		int tot = 0;
		for(int i=0; i<cnt; i++) {
			tot += employeeArr[i].getWage();
		}
		return tot;
	}
	
	public void regDepartment(int num, int dNum,String dName) {

		Employee employee = findEmployee(num);
		
		if(employee == null) {
			System.out.println("없는 사번 입니다.");
			return;
		}
		employee.getDepartment().setdNum(dNum);
		employee.getDepartment().setdName(dName);
	}

	public void regPay(int num, int wage) {
		Employee employee = findEmployee(num);
		if(employee == null) {
			System.out.println("없는 사번 입니다.");
			return;
		}
		employee.setWage(wage); 
		
	}
	
	public Employee findEmployee(int num) {
		Employee employee = null;
		for(int i=0; i<cnt; i++) {
			if(num == employeeArr[i].getdNum()) {
				employee = employeeArr[i];
				break;
			}
		}
		return employee;
	}
		
		

}
