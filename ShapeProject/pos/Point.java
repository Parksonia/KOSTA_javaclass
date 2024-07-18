package pos;

public class Point {
	int x;
	int y;
	
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
	public Point() {}
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}

	 public String toString() { // 점을 출력하기 위해 포맷을 (점1,점2)로 만들어줌
		return "("+x+","+y+")";
	}
	
}
