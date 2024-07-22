
class Person implements Cloneable {
	int age;
	String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) { // Object의 equals를 오버라이딩하여 사용
		if (!(obj instanceof Person))
			return false; // 파라미터로 최상위 클래스인 Object도 포함되기 때문에 걸러줌
		Person person = (Person) obj; // Object를 Person으로 down casting
		return age == person.age && name.equals(person.name);
	}

	@Override
	public int hashCode() {
		return age + age + name.hashCode();
	}

	@Override
	public String toString() { // Object의 toString()을 오버라이딩, 출력 시 .toString 생략가능하다.
		return "이름 :" + name + ", 나이 :" + age;
	}

	@Override
	public Object clone() {  
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}

	}
}

public class ObjectTest1 {

	public static void main(String[] args) {
		Person p1 = new Person(20, "홍길동");
		Person p2 = new Person(20, "홍길동");
		Person p3 = new Person(20, "고길동");
		Person p4 = new Person(22, "고길동");

		System.out.println(p1 == p2); // 다른 주소를 참조하기 때문에 false
		System.out.println(p1.equals(p2)); // Object의 equlas 를 사용함 : 같은 객체인지 비교함 false
											// 따라서 Person 에서 오버라이딩 해서 사용 할 수 있음

		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());

		System.out.println(p1.toString());// 이름 : 홍길동, 나이: 20;
		System.out.println(p3);// prinln 오버라이딩해서 알아서 toString을 호출함
		System.out.println(p4);

		Person p5 = (Person) p1.clone();  // clone 은 protected니까 오버라이딩과 다운캐스팅을 사용하여 clone 함 
		System.out.println("p5="+p5);

	}
}
