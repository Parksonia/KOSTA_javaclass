import pac.ShareArray;

public class ShareArrayMain {

	public static void main(String[] args) {
		ShareArray sArray = ShareArray.getRefShareArray();

		sArray.addDate(100);
		sArray.addDate(200);
		sArray.addDate(300);
	
		ShareArray sArray2 = ShareArray.getRefShareArray(); // 객체생성
		System.out.print(sArray2.getData(0)+" ");
		System.out.println(sArray.getData(0));
		
		System.out.print(sArray2.getData(1)+" ");
		System.out.println(sArray.getData(1));
		
		System.out.print(sArray2.getData(2)+" ");
		System.out.println(sArray.getData(2));
		
		// sArray와 sArray2 는 레퍼런스가 같다! Static임 
	}

}
