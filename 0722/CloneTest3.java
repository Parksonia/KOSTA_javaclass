class Circle implements Cloneable {
	Point center;
	int radius;
	
	public Circle(Point center,int radius) {
		this.center  =center;
		this.radius = radius;
	}
	public Circle(int x, int y, int radius) {
		center = new Point(x, y);
		this.radius = radius;
	}
	@Override
	public String toString() {
		return String.format("원[중심점 :%s,반지름:%d])",center,radius);
	}
	@Override
	public Object clone()  {
		try {
			Circle circle = (Circle)super.clone();
			circle.center = new Point(center.x,center.y); //Point center객체의 멤버변수를 분리시키기 위해 수동으로 따로 분리 시킴
			return circle;
			//return super.clone(); // clone은 Object 가 해주는거니까  super()로 메서드 호출	
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
}
public class CloneTest3 {

	public static void main(String[] args) {
		Circle c1 = new Circle(10,10,20);
		Circle c2 = (Circle)c1.clone();
		c1.center.x = 100;
		c1.radius =200;
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
