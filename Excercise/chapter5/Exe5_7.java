package chapter5;

import java.util.Scanner;

//문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄  
//금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
//돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불
//한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣
//어서 프로그램을 완성하시오.

public class Exe5_7 {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
			   // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
			 int money = sc.nextInt();
			 System.out.println("money="+money);
			 int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
			 int[] coin      = {5, 5, 5, 5};         // 단위별 동전의 개수
		     for(int i=0;i<coinUnit.length;i++) {
			 int coinNum = 0;
			    
			            
			   //1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.          
			 coinNum = money / coinUnit[i];
			  
			 //2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
			 if(coinNum>coin[i]) coinNum =coin[i]; // coinNum이 개수보다 크면 코인의 개수로 갱신시킴
			 coin[i] -= coinNum;
			 
			//3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			 money -= coinUnit[i]*coinNum;
			          
			 System.out.println(coinUnit[i]+"원: "+coinNum);
			 }
			 if(money > 0) {
			 System.out.println("거스름돈이 부족합니다.");
			 System.exit(0);  // 프로그램을 종료한다.
			 }
			 System.out.println("=남은 동전의 개수 =");
			 for(int i=0;i<coinUnit.length;i++) {
			 System.out.println(coinUnit[i]+"원:"+coin[i]);
			 }
	}

}
//money:3170
//3170/500 =6 min(6,5) = 5 ,남은 동전의 수 구하기 5(min)-coin =0, 3170 -500*5(min)=670 /5-5=0
//670/100 =6 min (6,5) =5, coin-5 =-1 , 670-100*5 =170 /5-5 =0
//170/50 =3 min(3,5) =3 ,coin-3 , 170-50*3 =20  /5-3 =2
//20/10 =2 ,min(2,5) =2 , coin-2  ,20-10*2 =0 /5-2=3