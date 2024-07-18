package shape;

import pos.Point;

public class Ellipse extends Shape{

	Point point1;
	Point point2;
	int distanceSum;
	
	public Ellipse() {
	
	}
	public Ellipse(String color,Point point1,Point point2,int distanceSum) {
		super(color);
		this.point1= point1;
		this.point2 = point2;
		this.distanceSum =distanceSum;
		
	}
	//ss.addShape(new Elipse("베이지",12,21,13,31,20)); // 색,점1x,점1y,점2x,점2y,
	public Ellipse(String color,int p1x,int p1y,int p2x,int p2y,int distanceSum) {
		this(color,new Point(p1x,p1y),new Point(p2x, p2y),distanceSum);
	}
	
	@Override
	public void draw() {
		System.out.println( String.format("[타원:색-%s,점1-%s,점2-%s,거리합-%d]",color,point1.toString(),point2.toString(),distanceSum));	
	}
	
}
