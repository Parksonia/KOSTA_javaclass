package chapter7;

class Parent {
	int x = 100; // Parent의 멤버변수 x

	Parent() {
		this(200);
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {  
		return x;
	}
}

class Child extends Parent {
	int x = 3000; // Child의 멤버변수 x parent의 x와 다름!

	Child() {
		this(1000);
	}

	Child(int x) {
		this.x = x;
	}
}

public class Exam7_7 {

	public static void main(String[] args) {
		Child c = new Child(); // 생성자 자동호출-> 부모의 생성자 우선으로 생성 후 자식 생성자 호출 
		
		System.out.println("x=" + c.getX());  //****** 메서드에서 리턴받는 건 실행되는 변수가 우선됨!!!!!********** 

	}

}
