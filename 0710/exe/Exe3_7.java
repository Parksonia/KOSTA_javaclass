package exe;

//chapter3과제 3-7
//아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
//5/9 × (F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
//셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)

public class Exe3_7 {

	public static void main(String[] args) {
		
		int f = 100;
		float c = (float) ((5.0/9.0)*(f-32));
		int c1 = (int)(c*100)+1;
		float result = (float)(c1/100F);
		//int c2 = c1%10;
		
		System.out.println(c);
		System.out.println(c1);
		System.out.println(result);
	}

}
