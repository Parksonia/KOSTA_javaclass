package chapter8;

class NumberException extends RuntimeException {
}

class InvalidNumberException extends NumberException {
}

class NotANumberException extends NumberException {
}

class Parent {
	void add(int a, int b) throws InvalidNumberException, NotANumberException {
	}

	void func() throws NumberFormatException {
		throw new InvalidNumberException();
	}

}

class Child extends Parent {// 상속관계에서 thorws 는 그대로거나 일부만! 가능 그 상위개념은 또 안됨

	@Override
	void add(int a, int b) throws InvalidNumberException, NotANumberException {
		super.add(a, b);
	}
	// void add(int a, int b) throws InvalidNumberException {}
	// void add(int a, int b) throws NotANumberException {}

	// void add(int a, int b) throws Exception {} //error
	// void add(int a, int b) throws NumberException {} //error

}

public class Exam8_3 {

	public static void main(String[] args) {
		Parent parent = new Parent();
		try {
			parent.add(10, 20);
		} catch (InvalidNumberException e) {

		} catch (NotANumberException e) {

		}
		try {
			parent.add(10, 20);
		} catch (InvalidNumberException e) {

		} catch (NumberException e) {

		}
		try {
			parent.add(10, 20);
		} catch (NotANumberException e) {

		} catch (NumberException e) {

		}
		try {
			parent.add(10, 20);
		} catch (NumberException e) { // 부모(NumberException)의 exception 하나만 둘 수도 있음

		}
	}

}
