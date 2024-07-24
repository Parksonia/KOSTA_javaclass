import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {

		//Comparable 인터페이스 상속
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person(20, "홍길동"));
		ts.add(new Person(10, "김길동"));
		ts.add(new Person(50, "서길동"));
		ts.add(new Person(40, "허길동"));
		ts.add(new Person(30, "신길동"));
		ts.add(new Person(70, "나길동"));
		
		System.out.println(ts);
		
		//Comparator인터페이스 상속 - 생성자로 구현 
		TreeSet<Employee> eTreeSet = new TreeSet<>(new Comparator <Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getPay()-o2.getPay(); 
				// 트리는 비교 값이 0이면 값이 들어가지 않음(저장이 안된다.) 작거나 커야함 (음수나,양수여야 값이 들어간다.)
				// 트리 구조라서 왼쪽 노드와 오른쪽 노드가 비교되야하기때문
				// 해시는 저장은 된다.	
			}
		});
		// 생성자로 Comparator 처리를 하므로 에러가 안나게 됨
		eTreeSet.add(new Employee("강길동", 1000000));
		eTreeSet.add(new Employee("강길동", 1000000));
		eTreeSet.add(new Employee("송길동", 2000000));
		eTreeSet.add(new Employee("김길동", 7000000));
		eTreeSet.add(new Employee("박길동", 5000000));
		System.out.println(eTreeSet);
		
		
		//Comparable 보다 생성자에 넣어준 Comparator가 우선이 된다
		TreeSet<Person>tSet = new TreeSet<>(new Comparator<Person>() {
		
		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
		});
		
	}

}
