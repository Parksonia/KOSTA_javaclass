package shape;

import pos.Point;

public class Triangle extends Shape {

	Point point1;
	Point point2;
	Point point3;
	
	
	public Triangle() {}
	
	public Triangle(String color,Point point1,Point point2,Point point3) {
		super(color);
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	public Triangle(String color,int p1x,int p1y,int p2x,int p2y,int p3x,int p3y) {
		this(color,new Point(p1x,p1y),new Point(p2x,p2y),new Point(p3x,p3y));
	}
	@Override
	public void draw() {
		System.out.println(String.format("[삼각형:색- %s,점1:%s,점2:%s,점3:%s]",color,point1.toString(),point2.toString(),point3.toString()));
	}
}


//		ss.addShape(new Triangle("초록", new Point(10, 1), new Point(1, 20), new Point(10, 20)));
//		ss.addShape(new Triangle("연두", 20, 2, 2, 30, 20, 30));

//[삼각형:색- 초록,점1:(10,1),점2:(1,20),점3:(10,20)]
//[삼각형:색- 연두,점1:(20,2),점2:(2,30),점3:(20,30)]