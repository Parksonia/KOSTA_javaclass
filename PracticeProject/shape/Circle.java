package shape;

import pos.Point;

public class Circle  extends Shape {  // 부모로부터 상속 받음 부모의 color 메모리에 갖고 있음

	Point point;
	int radius;
	
	public Circle() {}
	
	public Circle(String color,Point point,int radius) {
		super(color); 
		this.point = point;
		this.radius = radius;
	}

	public Circle(String color,int px,int py,int radius) {
		this(color,new Point(px,py),radius);
	}
	
	
	
	public void draw() {
		System.out.println(String.format("[원:색-%s ,중심점 %s, 반지름: %d]",color,point.toString(),radius));
		
	}
}


//ss.addShape(new Circle("빨강", new Point(10, 20), 5));
//Circle circle1 = new Circle("빨강", new Point(10, 20), 5);// 색, 중심점,반지름
//ss.addShape(new Circle("주황", 35, 24, 5));
//Circle circle2 = new Circle("주황", 35, 24, 5); // 색, 중심점x,중심점y,반지름

//출력
//[원:색- 빨강,중심점(10,20),반지름:5]
//[원:색- 주황,중심점(35,24),반지름:15]