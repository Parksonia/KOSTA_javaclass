
public class ArrayTest1 {

	public static void main(String[] args) {

			int[]  narr = new int[5];
			narr[0] = 10;
			narr[1] = 20;
			narr[2] = 30;
			narr[3] = 40;
			narr[4] = 50;
			//narr[5] = 60; <-ArrayIndexOutOfBoundsException 인덱스 주의! 인덱스틑 0부터 시작함
			
			for(int i=0; i<narr.length; i++) { //.length 배열의 크기를(데이터의 갯수) 반환하는 메서도
				System.out.println(narr[i]); 
	
			}
			double [] darr; //배열명 선언 <- 이름만 있음,변수 이름만 stack에  쌓임
			darr = new double[3]; //배열 객체 생성 , heap영역 메모리 할당
		
			int[] narr2 = new int[] {1,2,3,4,5}; // 배열의 생성과 동시에 초기화 1
			int[] narr3 = {1,2,3,4,5} ;//배열의 생성과 동시에 초기화2-문법 적으로 new로 객체생성하는게 생략이 가능 위와 같음
			
			//int []narr4;
			//narr4 ={1,2,3,4,5] <-error, 배열변수의 선언과 동시에 하지 않을 경우 new int[] 생략 불가
	}

}
