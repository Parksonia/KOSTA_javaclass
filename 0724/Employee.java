
public class Employee {

		String name;
		int pay;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPay() {
			return pay;
		}

		public void setPay(int pay) {
			this.pay = pay;
		}

		public Employee(String name,int pay) {
			this.name = name;
			this.pay = pay;
		}
		
		@Override
		public String toString() {
		return String.format("이름 : %s, 급여 :%d", name,pay);
		}

		//중복을 제거 하기 위해서 equals랑 hashcode 오버라이딩
		@Override
		public boolean equals(Object obj) {
		if(obj instanceof Employee==false)return false;
		Employee employee = (Employee)obj;
		return name.equals(employee.name)&& pay == employee.pay;
		}
		
		@Override
		public int hashCode() {
		return name.hashCode()+pay;
		}
		
		
	
}
