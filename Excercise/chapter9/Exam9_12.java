package chapter9;

public class Exam9_12 {

	public static int getRand (int from,int to) {

		int min = Math.min(from, to);
		int max = Math.max(from, to);
		
		//int rand = (int)(Math.random()*(Math.max(from, to)-Math.min(from, to)+1))+Math.min(from, to);
		
		
		return min+(int)(Math.random()*(max-min+1));
	}
	public static void main(String[] args) {
		for(int i=0; i< 20; i++)
			 System.out.print(getRand(1,-3)+",");

	}

}
