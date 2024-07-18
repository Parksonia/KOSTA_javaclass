import shape.Shape;

public class ShapeSet {

	Shape[] sets = new Shape[100];
	int cnt;

	public void addShape(Shape shape) { // shpae의 집합 
		sets[cnt++] = shape; // 생성된 레퍼런스(주소만)만 가져와서 담음
	}

	//우리가 가지고 있는  Shape은 draw메서드가 없었음
	//자식이 draw()를 가지고 있으니 오버라이딩을 활용하여 자식의 draw()출력될 수 있게함
	public void drawAll() { 
		for (int i = 0; i < cnt; i++) {
			 sets[i].draw(); // 오버라이딩
		}	
	}
}
