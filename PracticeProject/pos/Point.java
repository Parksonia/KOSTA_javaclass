package pos;

public class Point {

	int x; 
	int y;
	
	public Point(){ // 기본생성자
		
	}
	public Point(int x,int y){ // 인자가 있는 생성자, 값을 초기화
	
		this.x = x;
		this.y = y;
	}
	
	public String toString() { // 출력형태를 (x,y)로 하기 위함
		return "("+x+","+y+")"; 
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
