class MyClass{
	static int [] arr = new int[10];
	
	static { // static변수 초기화 위해 사용, static 변수 생성 직후 호출됨, 한번만 초기화 
		for(int i=0; i<arr.length; i++) {
			int rand = (int)(Math.random()*100)+1;
			arr[i] =rand;
		}
		
	}
	public MyClass() {
	
	}
	
//	public MyClass() {  // 객체 생성 시마다 초기화 됨으로 소용 없음
//		for(int i=0; i<arr.length; i++) {
//			int rand = (int)(Math.random()*100)+1;
//		}
//	}
}

public class InitialTest2 {

	public static void main(String[] args) {
	
		for(int i=0; i<MyClass.arr.length; i++) {
			System.out.print(MyClass.arr[i]+" ");
		}
		System.out.println();
		MyClass mc1 = new MyClass();
		for(int i=0; i<MyClass.arr.length; i++) {
			System.out.print(mc1.arr[i]+" ");
		}
		System.out.println();		
		
		MyClass mc2 = new MyClass();
		for(int i=0; i<MyClass.arr.length; i++) {
			System.out.print(mc2.arr[i]+" ");  // 공유되는 static 변수기 때문에 한번만 초기화 됨
		}
		System.out.println();
	}

}
