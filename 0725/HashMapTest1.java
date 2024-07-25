
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Account {
	String id;
	String name;
	Integer balance;

	public Account(String id, String name, Integer balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [id = "+id+", name= "+name+", balance= "+balance+"]";
	}
}

public class HashMapTest1 {

	public static void main(String[] args) {

		HashMap<String,Account> hs = new HashMap<>(); //String-value의 타입지정, Account-제너릭 
		hs.put("1001", new Account("1001", "hong", 100000)); //.put :데이터 삽입(key-value)
		hs.put("1002", new Account("1002", "song", 200000));
		hs.put("1003", new Account("1003", "tong", 300000));
		hs.put("1004", new Account("1004", "gong", 400000));
		hs.put("1005", new Account("1005", "bong", 500000));
		
		Account account = hs.get("1003"); // .get(key)를 통해 value를 가져옴
		System.out.println(account);

	
		
		if(hs.containsKey("1006") == false) {// 해당키가 존재하는지 확인하기
			hs.put("1006",new Account("1006", "kong", 600000));
		}
		
		System.out.println(hs);
		hs.remove("1006"); //.remove: key를 통해 삭제하기
		System.out.println(hs);  // hash는 순서 보장 안됨 hash기 때문에 

		// Set으로 모든key저장함
		Set kSet = hs.keySet(); 
		System.out.println(kSet);
		
		//Collection으로 value의 값만 저장
		Collection<Account>vsAccounts = hs.values(); 
		System.out.println(vsAccounts);
		
		//value를 가져오는 두가지 방법
		for(Account ac: hs.values()) {
			System.out.println(ac);
		}
		System.out.println("================================================");
		for(String keyString : hs.keySet()) {
			System.out.println(hs.get(keyString));
		}//
		
		//HashMap에는 entryMap이 있다. 
		//entry :key-value한쌍을 저장 
		System.out.println("================================================");
		for(Map.Entry<String,Account> entry : hs.entrySet()) {
			System.out.println(entry.getKey()+" :"+entry.getValue());
		}
		//Set<Entry<String, Account>> hSet = hs.entrySet();
	
	}

}
