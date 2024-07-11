package chapter4;

public class Exe4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//			for(int j=2; j<=i+3; j++) {
//				System.out.print(String.format("%dx%d=%d\t", j,i,i*j));
//			}
//			System.out.println();

		for (int sdan = 2; sdan < 9; sdan += 3) {
			for (int idx = 1; idx <= 3; idx++) {//1,2,3,고정시키기...
				for (int dan = sdan; dan <= (sdan + 2 < 10 ? sdan + 2 : sdan + 1); dan++) {
					System.out.print(String.format("%dx%d=%d\t", dan, idx, dan * idx));
				}
				System.out.println();
			}
			
			System.out.println();//행바꿈
		}

	}
}

//2*1=2 3*1=3 4*1=4
//2*2=4 3*2=6 4*2=8
//2*3=6 3*3=9 4*3=12
//5*1=5 6*1=6 7*1=7
//5*2=10 6*2=12 7*2=14
//5*3=15 6*3=18 7*3=21
//8*1=8 9*1=9
//8*2=16 9*2=18
//8*3=24 9*3=27



		// for (int i = 2; i < 10; i += 3) {// 2,5,8 큰 틀의 줄바꿈

		// 	for (int j = 1; j <= 3; j++)  {

				                                 
		// 			for (int k = i; k <= (i + 2); k++) {// 한줄인 거임
		// 		System.out.print(String.format("%dx%d=%d\t", k, j, k * j));

		// 		}

		// 		System.out.println();
		// 	}

		// 	System.out.println();
		// }
