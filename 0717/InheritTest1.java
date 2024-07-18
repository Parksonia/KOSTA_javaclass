class Person { // 부모
	int age;
	String name;
	
	Person() {
	
	}
	
	Person(int age,String name){
		this.age = age;
		this.name = name;
	}
	String info() {
		return String.format("이름: %s, 나이:%d", name,age);
	}
	
}

class Student extends Person { //자식 -Person을 상속 받음
	//객체 생성 시 부모의 멤버변수를 상속받는다.
	int  grade;
	String school;
	
	public Student() {
	
	}
	
	Student(int age,String name,int grade,String school){
//		this.age = age;
//		this.name = name;
		super(age,name); // 부모의 생성자가 우선적으로 자동호출됨
		this.grade = grade;
		this.school = school;
	}
	@Override// 자식이 부모의 메서드 재정의 
		String info() {  
			//return String.format("이름: %s, 나이:%d, 학년: %d, 학교: %s", name,age,grade,school);
			return super.info() +String.format(", 학년: %d, 학교: %s",grade,school); // 부모의 메서드를 호출해서 재정의도 가능
	}
	
	void test() {
		System.out.println("시험보다");
	}
	
	
}
public class InheritTest1 {

	public static void main(String[] args) {
		Student student = new Student(); 
		student.age = 10;
		student.name ="박잼민";
		student.grade =3;
		student.school ="호서초등학교";

		Student student2 = new Student(12,"김초딩",5,"가산초등학교");
		System.out.println(student.info()); // 부모의 기능도 상속받아 사용 가능! 
		System.out.println(student2.info());
	
	
		student.test();
		Person person = new Person();
		person.age =10;
		person.name = "최잼민";
		//person.grade = 3;  error: 부모객체에서는 자식 접근 못함 , 자식의변수나 메서드를 사용할 수 없다.
		//person.test(); error
	
	
	}

}
