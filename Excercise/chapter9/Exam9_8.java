package chapter9;

public class Exam9_8 {

	public static double round(double pi,int n ) {
		double pow = Math.pow(10, n); //10의n^
		return Math.round(pi*pow)/pow;
	
	}
	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
	}

}

//  3.1245
//  3.1245 *100d => 312.45
//  Math.round(312.45) ==>312
//  312/100d =3.12


//3.1
//3.14
//3.142
//3.1415
//3.1415