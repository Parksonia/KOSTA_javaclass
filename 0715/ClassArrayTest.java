
public class ClassArrayTest {

	public static void main(String[] args) {

		// *** 주소(4byte)를 담은 3개의 그릇이므로 12바이트다!!***
		// Person객체가 생성된 것이 아님, reference 변수 3개만 힙에 생성됨.
		Person[] persons = new Person[3];

		// persons[0].age =20; 각각의 객체를 생성하지 않고 데이터를 저장 할 수 없음, 에러

		
		int cnt = 0;
		persons[cnt] = new Person(); // 각각 객체를 생성해야 한다.
		persons[cnt].age = 20;
		persons[cnt].height = 178.2;
		persons[cnt].name ="월요일";
		cnt++;
		
		for(int i=0; i<cnt; i++) {
			System.out.println(persons[i].info());
		}
		
	}

}
