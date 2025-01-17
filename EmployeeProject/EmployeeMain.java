import dept.Department;
import emp.Employee;
import emp.Freelancer;
import emp.Permanet;
import emp.Sales;

public class EmployeeMain {

	public static void main(String[] args) {

		Company com = new Company();
		//사번,이름,부서번호,부서,급여
		Permanet emp1 = new Permanet(100,"홍길동",new Department(10,"홍보부"),1000000);
		Sales emp2 = new Sales(101,"김길동",new Department(11,"인사과"),800000, 500000);
		Freelancer emp3 = new Freelancer(102,"허길동",new Department(12,"개발부"), 160, 10000); 
	
		
		com.addEmployee(emp1);
		com.addEmployee (emp2);
		com.addEmployee (emp3);
		
		//com.regBusinessTrip(emp1,2); //error : Interface상속 받지 않음 
		com.regBusinessTrip(emp2,3); //o
		com.regBusinessTrip(emp3,2); //o
		com.allEmployeeInfo();
		System.out.println("회사 급여 총액 :"+com.getTotalPay());
		
	}

}

//출력결과
//사번 : 100, 이름 : 홍길동, 부서 : 홍보부, 급여 : 1000000
//사번 : 101, 이름 : 김길동, 부서 : 인사과, 급여 : 1300000
//사번 : 102, 이름 : 허길동, 부서 : 개발부, 급여 : 1600000

//회사 급여 총액 : 3900000