package shape;

public class Shape { // 부모 - 원,삼각형,사각형,타원과 상속관계

	String color;

	public Shape() {
	}

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// 각각의 도형들에 작성한 출력문이 출력 될 수 있도록 오버라이딩을 활용함, 필수적으로 부모에게 같은 메서드가 있어야 오버라이딩 됨
	public void draw() {
		
	}
	
}
