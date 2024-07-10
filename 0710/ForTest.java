
public class ForTest {

	public static void main(String[] args) {

		int sum = 0;
		for(int i=1; i<=10; i+=2) {
			sum += i;
		}
		System.out.println(sum);

		for(int i = 1; i <10; i++) {

			for(int dan=2; dan<10; dan++) {
				System.out.print(String.format("%dx%d=%2d\t",dan,i,dan*i));
				
			}
			System.out.println();
		}
		
		for(int i=2; i<10; i+=3) {
			for(int j=1;j<10; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}

