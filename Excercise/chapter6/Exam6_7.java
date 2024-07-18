package chapter6;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double getDistance(int x,int y) {
		return Math.sqrt((double)(this.x-x)*(this.x-x)+(this.y-y)*(this.y-y)); 
	}
		
}

public class Exam6_7 {

	public static void main(String[] args) {

		MyPoint point = new MyPoint(1, 1);
		 // p(1,1)과 (2,2)의 거리를 구한다.
		System.out.println(point.getDistance(2,2));
	}

}
