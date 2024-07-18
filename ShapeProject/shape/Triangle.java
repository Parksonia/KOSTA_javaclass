package shape;
import pos.Point;

public class Triangle extends Shape {

	Point pos1;
	Point pos2;
	Point pos3;
	
	public Triangle() {}
	public Triangle(String color,Point pos1,Point pos2, Point pos3) {
		super(color);
		this.pos1 = pos1;
		this.pos2 = pos2;
		this.pos3 = pos3;
		
	}
	
	public Triangle(String color,int px1,int py1,int px2,int py2,int px3,int py3) {
	this(color,new Point(px1,py1),new Point(px2,py2),new Point(px3,py3));

	}
	@Override
	public void draw() {
	System.out.println( String.format("[삼각형:색-%s,점1-%s,점2-%s,점3-%s]",color,pos1.toString(),pos2.toString(),pos3.toString()));	
	
	}
	
}
