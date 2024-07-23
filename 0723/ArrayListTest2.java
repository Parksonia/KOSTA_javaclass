import java.util.ArrayList;
import java.util.Iterator;

class Person{
	Integer age;
	String name;
	
	public Person(Integer age,String name) {
		this.age = age;
		this.name =name;
	}
	void info() {
		System.out.println("["+name+","+age+"]");
	}
	@Override
	public String toString() {
		return "["+name+","+age+"]";
	}
}
public class ArrayListTest2 {

	public static void main(String[] args) {

		ArrayList aList1 = new ArrayList();
		ArrayList<Person> arrayList = new ArrayList<>();
		aList1.add(new Person(20, "홍길동"));
		aList1.add(new Person(30, "김길동"));

		arrayList.add(new Person(20, "홍길동"));
		arrayList.add(new Person(30, "김길동"));
		arrayList.add(new Person(40, "서길동"));
		arrayList.add(new Person(50, "송길동"));

		
//		for(int i=0; i<aList1.size();i++) {
//			Person person =(Person)aList1.get(i);  // 최상위 클래스인 Object 우선이기 때문에 다운캐스팅
//			Person person2 = arrayList.get(i); // 리스트 생성때 <Person>클래스 지정해주면 다운캐스팅 필요 없다.
//			
//			person.info();
//			person2.info();
//			
//		}

		
//		향상된  for문
//		for(Person p: arrayList) { // foreach문 타입을 지정한 변수 사용해야함
//			p.info();
//		}
		
		//반복자 Iterator 
		// 검색만 할때는 향상된 for문을 써도 괜찮지만 데이터를 삭제하면서 조회 할때는 반복자를 사용하는게 좋다.
		Iterator<Person> iterator = arrayList.iterator();
		while(iterator.hasNext()) { //.hasNext()데이터가 있으면?
			iterator.next().info(); //.next()이동하고 데이터 꺼내옴
		}
		
		System.out.println(arrayList); // toString @override
	}

}
