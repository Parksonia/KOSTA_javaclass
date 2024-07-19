import emp.Employee;
import emp.Freelancer;
import emp.IBusinessTrip;
import emp.Permanet;
import dept.Department;

public class Company {


	
	Employee[] employeeArr = new Employee[100]; // 목록 관리를 위해 Employee 클래스 배열
	int cnt;
	
	public void regBusinessTrip(IBusinessTrip emp,int day) { // Permenent는 오지 않도록 해야하니까 Employee가 오면 안됨
		emp.goBusinessTrip(day);
	}
	
	
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
			
			//굳이 (casting)하지 말고 이미 employeeArr[i]에 각자 override된 공통 메서드가 있으니 필요 없다!
			//tot += employeeArr[i].getPay();로 끝나면 됨!
			//아래는 각자가 특별히 가지고 있는 메서드가 있을 경우 활용하는 것이다.
//			if(employeeArr[i] instanceof Permanet) {
//				tot += ((Permanet)employeeArr[i]).getPay();
//			}else if (employeeArr[i] instanceof Freelancer) {
//				tot +=((Freelancer)employeeArr[i]).getPay();
//			}
			tot+= employeeArr[i].getPay();
			
		}
		return tot;
	}
	
//	public void regDepartment(int num, int dNum,String dName) {
//
//		Employee employee = findEmployee(num);
//		
//		if(employee == null) {
//			System.out.println("없는 사번 입니다.");
//			return;
//		}
//		employee.getDepartment().setdNum(dNum);
//		employee.getDepartment().setdName(dName);
//	}

//	public void regPay(int num, int wage) {
//		Employee employee = findEmployee(num);
//		if(employee == null) {
//			System.out.println("없는 사번 입니다.");
//			return;
//		}
//		employee.setWage(wage); 
//		
//	}
	
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
