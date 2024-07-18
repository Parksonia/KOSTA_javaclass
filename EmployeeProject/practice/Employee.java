package practice;

public class Employee {

	int num;
	String name;
	Department department;
	int wage;
	
	
	public Employee() { } // 기본 생성자

	// 사번,이름,부서번호,부서,급여
    //company.addEmployee(new Employee(100,"홍길동",new Department(10,"홍보부"),1000000);
	// 형태의 생성자	
	Employee(int num, String name,Department department,int wage){
		this.num = num; 
		this.name  = name;
		this.department = department;
		this.wage = wage;
	}

	//company.addEmployee (new Employee(103,"하길동",13,"개발부",4000000));
	// 형태의 생성자
	Employee(int num,String name,int dNum,String dName,int wage){
		this(num, name, new Department(dNum,dName), wage); // 기존에 있는 생성자를 활용
			
	}
	
	//com.addEmployee (new Employee(104,"차길동"));
	//형태의 생성자 default로 부서는 미정으로 둠
	Employee(int num,String name) {
		this(num, name,new Department(),0);
	}

	public String info() {
		
		return String.format("사번 : %d, 이름 : %s, 부서 :%s, 급여: %d", num,name,department.dName,wage);
	}

	
}
