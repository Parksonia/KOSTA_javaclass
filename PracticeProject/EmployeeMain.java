import dept.Department;
import emp.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Company com = new Company();
		//사번,이름,부서번호,부서,급여
		com.addEmployee (new Employee(100,"홍길동",new Department(10,"홍보부"),1000000));
		com.addEmployee (new Employee(101,"김길동",new Department(11,"인사과"),2000000));
		com.addEmployee (new Employee(102,"허길동",new Department(12,"개발부"),3000000));
		com.addEmployee (new Employee(103,"하길동",13,"개발부",4000000));
		com.addEmployee (new Employee(104,"차길동"));


		com.regDepartment(104,10,"홍보부"); //104 부서 수정 
		com.regPay(104,3000000); // 104 페이 수정
		
		com.allEmployeeInfo();
		
		System.out.println("회사 급여 총액 :"+com.getTotalPay());
		
		
		
	}

}

//출력결과
//사번 : 100, 이름 : 홍길동, 부서 :홍보부, 급여: 1000000
//사번 : 101, 이름 : 김길동, 부서 :인사과, 급여: 2000000
//사번 : 102, 이름 : 허길동, 부서 :개발부, 급여: 3000000
//사번 : 103, 이름 : 하길동, 부서 :개발부, 급여: 4000000
//사번 : 104, 이름 : 차길동, 부서 :홍보부, 급여: 3000000
//회사 급여 총액 :13000000
