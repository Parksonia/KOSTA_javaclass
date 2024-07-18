package shape;
import pos.Point;

public class Circle extends Shape{

	
	Point center; 
	int radius;
	
	Circle(){
		
	}
	public Circle(String color,Point center,int radius){
		super(color);
		this.center =center;
		this.radius= radius; 
	}

	public Circle(String color,int cx,int cy,int radius){
		//this(color,new Point(cx,cy),radius); 아래와 같다.
		super(color);
		center = new Point(cx,cy);
		this.radius = radius;
		
		
	}
	@Override
	public void draw() {
		
	 System.out.println(String.format("[원:색-%s, 중심점-%s,반지름:%d]",color,center.toString(),radius));
	}
		
}
