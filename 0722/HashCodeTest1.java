class Testing {
	String string = "hong";
}

public class HashCodeTest1 {

	public static void main(String[] args) {
		String str1 = "hong";
		String str2 = "hong";
		String str3 = "song";
		
		Testing testing = new Testing();
		System.out.println(testing.string.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // 데이터가 같으면 같은 hashCode가 나옴
		System.out.println(str3.hashCode()); // 데이터가 다르면 다른 값이 나옴 

	}
}

//3208448
//3208448
//3208448
//3536149

