package dept;

public class Department {

	int dNum ;
	String dName ="미정";

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
	public Department() { //기본생성자
	
	}
	public Department(int dNum,String dName){ // 부서와 부서이름 초기화 생성자
		this.dNum = dNum;
		this.dName = dName;
	}
	
}
