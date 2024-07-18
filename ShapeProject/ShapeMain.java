
import pos.Point;
import shape.Circle;
import shape.Ellipse;
import shape.Rectangle;
import shape.Triangle;

public class ShapeMain {

	public static void main(String args[]) {
		
		ShapeSet ss = new ShapeSet();
		ss.addShape(new Circle("빨강", new Point(10, 20), 5));
		ss.addShape(new Circle("주황", 35, 24, 5));
		ss.addShape(new Rectangle("파랑", new Point(3, 5), 20, 10));
		ss.addShape(new Rectangle("하늘", 50, 60, 20, 10));
		ss.addShape(new Triangle("초록", new Point(10, 1), new Point(1, 20), new Point(10, 20)));
		ss.addShape(new Triangle("연두", 20, 2, 2, 30, 20, 30));
		ss.addShape(new Ellipse("노랑",new Point(10,10),new Point(20,20),30)); // 색,점1,점2, 두점에서의 거리의 합 
		ss.addShape(new Ellipse("베이지",12,21,13,31,20)); // 색,점1x,점1y,점2x,점2y,점3x,점3y
		
		ss.drawAll();
		
		
		//Circle circle1 = new Circle("빨강", new Point(10, 20), 5);// 색, 중심점,반지름
		//Circle circle2 = new Circle("주황", 35, 24, 5); // 색, 중심점x,중심점y,반지름

		//Rectangle rectangle1 = new Rectangle("파랑", new Point(3, 5), 20, 10); // 색,시작점,가로,세로
		//Rectangle rectangle2 = new Rectangle("하늘", 50, 60, 20, 10); // 색, 중심점X,중심점y,가로,세로

		//Triangle triangle1 = new Triangle("초록", new Point(10, 1), new Point(1, 20), new Point(10, 20));// 색,점1,점2,점3
		//Triangle triangle2 = new Triangle("연두", 20, 2, 2, 30, 20, 30);// 색,점1x,점1y,점2x,점2y,점3x,점3y

//		circle1.draw();
//		circle2.draw();
//		rectangle1.draw();
//		rectangle2.draw();
//		triangle1.draw();
//		triangle2.draw();
	
	}

}

//[원:색- 빨강,중심점(10,20),반지름:5]
//[원:색- 주황,중심점(35,24),반지름:15]
//[사각형:색- 파랑,시작점(3,5),가로:20,세로:10]
//[사각형:색- 하늘,시작점(50,60),가로:10,세로:20]
//[삼각형:색- 초록,점1:(10,1),점2:(1,20),점3:(10,20)]
//[삼각형:색- 연두,점1:(20,2),점2:(2,30),점3:(20,30)]
//[타원:색- 노랑,점1-(10,10),점2-(20,20),거리합-30]
//[타원:색- 베이지,점1-(12,21),점2:(13,31),거리합-20]