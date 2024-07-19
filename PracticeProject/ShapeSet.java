import pos.Point;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Triangle;

public class ShapeSet {
	
	 Shape[] shapes = new Shape[100] ; // Shape가 엄마! 상속관계인 자식들을 레퍼런스도 저장할 수 있다.
	 int cnt;
	 
	 public void addShape(Shape shape) { 
		 
		 shapes[cnt++] = shape; 
		// shapes[cnt++] = new Circle(a,b,c,d);
		// shapes[cnt++] = new Rectangle(a,b,c,d);
		// shapes[cnt++] = new Triangle(a,b,c,d);
		// shapes[cnt++] = new Ellipse(a,b,c,d); 와 같다. Shape의 상속을 받는 클래스들이기 때문에 포괄 할 수 있는 Shape(부모)로 객체를 생성 및 주소지를 클래스배열에 저장 
	 }
	 
	 public void drawAll() {
		 for(int i=0; i<cnt; i++) {
			 shapes[i].draw();
		 }
	 }
	 
	 
	 
}
