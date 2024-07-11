package chapter4;

public class Exe4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 0;
		int sum = 0;

//		for(i=1;; i++) {
//			sum += i%2 == 0? -i:i;
//		if(sum>=100)break;
//		}
//		System.out.println(i);
//		System.out.println(sum);
//	
		for(i=1; sum<=100; i++) {
			
			if(i%2==0) {
				sum -= i;
				System.out.println(i);
				System.out.println(sum);
			}else {
				sum+=i;	
			}
			
		}
		System.out.println(i-1);
		System.out.println(sum);
	}

}
