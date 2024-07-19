import pos.Point;
import shape.Circle;
import shape.Rectangle;
import shape.Triangle;

public class ShapeMain {

	public static void main(String[] args) {
	
		ShapeSet ss = new ShapeSet();
		
		ss.addShape(new Circle("빨강", new Point(10, 20), 5));
		ss.addShape(new Circle("주황", 35, 24, 5));
//		ss.addShape(new Rectangle("파랑", new Point(3, 5), 20, 10));
//		ss.addShape(new Rectangle("하늘", 50, 60, 20, 10));
		ss.addShape(new Triangle("초록", new Point(10, 1), new Point(1, 20), new Point(10, 20)));
		ss.addShape(new Triangle("연두", 20, 2, 2, 30, 20, 30));
	
		ss.drawAll();
		
		
	}

}
