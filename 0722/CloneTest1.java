class Point implements Cloneable{
	int x;
	int y;
	
	public Point() {}
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		
	}
	@Override
	public String toString() {
		
		return "("+x+","+y+")";
	}
	@Override
	public Object clone() {  // implements Cloneable 해야한다. 
		
		try {
			return super.clone();
			
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}


public class CloneTest1 {

	public static void main(String[] args) {
		Point p1 = new Point(3,5);
		Point p2 = (Point)p1.clone(); //메모리가 분리되어 복사됨 서로 다른 객체임 
		p1.x = 100; //p1의 x만 바뀜
		System.out.println(p1);
		System.out.println(p2);
		
		
	}

}
