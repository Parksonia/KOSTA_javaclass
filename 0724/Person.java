//TreeSet -비교문이 들어가야함! 
public class Person implements Cloneable,Comparable<Person> { // 
	int age;
	String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false)
			return false;
		Person p = (Person) obj;
		return age == p.age && name.equals(p.name);

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
	//Comparable 인터페이스의 상속을 받았으니 인터페이스의 메서드 구현을 해줘야 에러 안남.
	@Override
	public int compareTo(Person o) {  // 비교대상의 차이를 반환

		//return age-o.age;  // 오름차순 순서대로 정렬이 됨 
		//return name.compareTo(o.name); // 이름순서대로 정렬이 됨
		return o.age-age; // 나이 많은 순서대로 정렬
	}

	
	
}
