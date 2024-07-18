package chapter6;


public class Exam6_19 {

	public static void change(String str) { //static메서드 
		 str += "456"; // str = ABC123456
		 }

	
	public static void main(String[] args) {
		
		 String str = "ABC123";  //readonly 
		 System.out.println(str);
		 change(str); 
		 System.out.println("After change:"+ str); //str = ABC123
		
	}

}
