class Point {
	int x;
	int y;

	public Point() {
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	public Point3D() {
		super(0, 0);

	}

}

class Account {
	int id;
	String name;
	int balance;

	Account(int id, String name, int money) {
		this.id = id;
		this.name = name;
		this.balance = money;
	}

	Account(int id) {
		this.id = id;
	}

	Account(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class SpecialAccount extends Account {
	String grade;

	SpecialAccount(int id) {
		super(id);
	}

	SpecialAccount(int id, String name, int money, String grade) {
		super(id, name, money);
		this.grade = grade;
	}

	SpecialAccount(int id, String name) {
		super(id, name);
	}

}

public class InheritTest3 {

	public static void main(String[] args) {

	}

}
