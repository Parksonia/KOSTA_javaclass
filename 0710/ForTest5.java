import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int dan1 = sc.nextInt();
		int dan2 = sc.nextInt();
		int tmp=0;
		//dan1>dan2  
		//dan1<dan2  입력값의 크기를 고려해야함
		
		
		for(int i=1; i<10; i++) {
			if(dan2 <dan1) {
				for(int dan=dan1; dan<=dan2; dan++) {
					System.out.print(String.format("%dx%d=%d",dan,i,dan*i));
				}
			}else {
				for(int dan=dan1; dan>=dan2;dan--) {
					System.out.print(String.format("%dx%d=%d",dan,i,dan*i));
				}
			}
		System.out.println();
		}
		
	}

}

//5 ,3 입력
//5,4,3 단 나란히 구구단 출력
//3,5 입력 
//3,4,5 나란히 구구단 출력