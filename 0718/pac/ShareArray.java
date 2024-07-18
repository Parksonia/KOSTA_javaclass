package pac;

public class ShareArray {

	int [] array = new int[100];
	int cnt;
	static ShareArray shareArray;
	
	
	private ShareArray() {}
	
	
	public static ShareArray getRefShareArray() {
		if(shareArray ==null) {
			shareArray = new ShareArray();//객체 생성해서
		}
		
		return shareArray; // 반환 두번째 호출부터는 Static변수이기때문에 이미 만들어져 있는 레퍼런스(주소지)를 반환
	}
	public void addDate(int data) {
		array[cnt++] = data;
	}
	public int getData(int idx) {
		return array[idx];
	}
}
