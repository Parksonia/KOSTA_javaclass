import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest1 {

	public static void main(String[] args) {

		TreeMap<String,Account> accs = new TreeMap<>(); 
		// key를가지고 Tree를 만듦, String은 Comparable을 가지고 있기 때문에 값을 넣을 수 있다.
	
		accs.put("1003", new Account("1001", "hong", 100000)); //.put :데이터 삽입(key-value)
		accs.put("1005", new Account("1002", "song", 200000));
		accs.put("1001", new Account("1003", "tong", 300000));
		accs.put("1002", new Account("1004", "gong", 400000));
		accs.put("1004", new Account("1005", "bong", 500000));
		
		System.out.println(accs);  // treemap은 정렬이 되어 들어감(오름차순기본) 
		Account account = accs.get(accs.firstKey()); //첫번째 키값을 가지고 value를 저장
		System.out.println(account);
		
		Account account2 = accs.get(accs.lastKey()); //마지막 키값을 가지고 value를 저장
		System.out.println(account2);
		
		SortedMap<String,Account> sm = accs.tailMap("1004"); //범위지정 정렬
		System.out.println(sm.values());
	}

}
