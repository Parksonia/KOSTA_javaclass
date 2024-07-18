package shape;
import pos.Point;

public class Rectangle extends Shape{
	Point startPosPoint;
	int width;
	int heigh;
	
	public Rectangle() {
	
	}
	public Rectangle(String color,Point starPos,int width,int height){
		super(color);
		this.startPosPoint = starPos;
		this.width = width;
		this.heigh = height;
		
	}
	
	public Rectangle(String color, int sx,int sy, int width,int height){
		this(color, new Point(sx,sy),width,height);
	}
	
	@Override
	public void draw() {
		
		System.out.println(String.format("[사각형:색-%s,시작점-%s,가로-%d,세로-%d]",color,startPosPoint.toString(),width,heigh));
	
	}
		
	
}
