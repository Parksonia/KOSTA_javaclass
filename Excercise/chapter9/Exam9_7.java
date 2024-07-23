package chapter9;

public class Exam9_7 {

	public static boolean contains(String a, String b) {
	
		return a.contains(b)? true:false;
		//return src.indexOf(target)>0;
	}
	public static void main(String[] args) {

		 System.out.println(contains("12345","23"));
		 System.out.println(contains("12345","67"));
	}

}
