import java.util.HashSet;


class Person1 implements Cloneable {
	int age;
	String name;

	Person1(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person1== false) return false;
		Person1 p = (Person1)obj;
		return age==p.age && name.equals(p.name);
	
	}

	@Override
	public int hashCode() {
		return age + name.hashCode();
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
public class HashSetTest1 {

	public static void main(String[] args) {

			HashSet<Integer> hSet = new HashSet<>();
			hSet.add(32);
			hSet.add(17);
			hSet.add(84);
			hSet.add(17); // 중복허용 안함  
			System.out.println(hSet); //[32,17,84] 출력
			
			HashSet<Person1> hspHashSet = new HashSet<>();
			hspHashSet.add(new Person1(10, "홍길동"));
			hspHashSet.add(new Person1(20, "김길동"));
			hspHashSet.add(new Person1(10, "홍길동")); // equals만 오버라이딩 하면 안되고  equals와hashcode 둘다 오버라이딩 구현해야한다.(그래야 중복 안됨)
			hspHashSet.add(new Person1(40, "서길동"));
			
			System.out.println(hspHashSet);
	}

}
