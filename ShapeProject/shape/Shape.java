package shape;

public class Shape {

	String color;
	
	public Shape() {
		color ="흰색";
	}

	public Shape(String color){
		this.color = color;
	}
//	public String draw() { // 오버라이딩
//		
//		return "색"+color;
//		
//	}
	public void draw() {  //자식들이 draw를 가지고 있어서  자식들이 오버라이딩 해서 출력이 될 수 있는거야~
		
	}
	
}
