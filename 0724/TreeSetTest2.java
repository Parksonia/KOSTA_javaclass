import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {

		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(34);
		tSet.add(67);
		tSet.add(25);
		tSet.add(12);
		tSet.add(7);
		tSet.add(77);
		tSet.add(70);
		
		System.out.println(tSet);
		SortedSet<Integer> sortedSet = tSet.subSet(70, 80); //(from,to)범위 검색, to는 포함 안됨
		System.out.println(sortedSet);
	}

}
