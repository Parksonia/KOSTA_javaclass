package exe;

public class Exe_2 {

	public static void main(String[] args) {
		int numOfApples  = 123;// 사과의 개수
		int sizOfBucket = 10; // 바구니 크기
		//삼항연산자 
		int numOfBucket =(numOfApples%sizOfBucket != 0)? (numOfApples/sizOfBucket)+1 :numOfApples/sizOfBucket; //모든 사과를 담는데 필요한 바구니의 수;

		System.out.println("필요한 바구니의 수:" +numOfBucket);
		
	}

}
