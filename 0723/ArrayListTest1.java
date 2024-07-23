import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest1 {

	public static void main(String[] args) {

		//ArrayList는 자체적으로 toString()되어 있어 출력 시 for문 돌리지 않아도 전체 출력 가능  
		
		ArrayList arrayList = new ArrayList();
		arrayList.add(40);
		arrayList.add(30);
		arrayList.add(20);
		arrayList.add(10);
		
		System.out.println(arrayList);
		Collections.sort(arrayList);//정렬
		System.out.println(arrayList);
		
		ArrayList arrayList2 = new ArrayList();
		arrayList2.add(10);
		arrayList2.add(20);
		arrayList2.add(50);
		
		System.out.println(arrayList.contains(arrayList2));
		
		List arrayList3 = arrayList.subList(1, 3);
		System.out.println(arrayList3);
		
		arrayList3.set(0, 200); // insert와 다르게 그 인덱스에 저장함 뒤로 밀리는게 아님
		System.out.println(arrayList3);
		
		arrayList3.remove(0);
		System.out.println(arrayList3);
	}

}
