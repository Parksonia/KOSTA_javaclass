package exe;

public class Exe6 {
// 아래는 변수의 num의 값보다 크면서도 가장가까운 10의배수에서 변수num의 값을
//뺀 나머지를 구하는 코드이다. 예를들어 24의 크면서도 가장가까운 10의 배수는 30이고
//19의 경우 20이고 81의 경우 80이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다.
	//[hint] 나머지 연산자 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =24 ;
		int r = num%10; //4
		int o =(num/10*10)+10; //내가 푼 것
		int n = (num/10+1)*10;//2*10+10 30..?
		
		System.out.println(o-num);
		System.out.println(n-num);
	}

}
