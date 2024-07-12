package chapter5;

public class Exe5_6 {

	public static void main(String[] args) {
	
		   // 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		 int[] coinUnit = {500, 100, 50, 10};
		 int money = 2680;
		 System.out.println("money="+money);
		 for(int i=0;i<coinUnit.length;i++) {
	
			System.out.println(coinUnit[i]+"원 :"+money/coinUnit[i]);
			money= money % coinUnit[i]; //money 갱신
		 }	

	}

}
//2680/500 = 5, 2650%500 = 180
//180/100 = 1, 180%100 = 80
//80/50 = 1, 80%50 = 30
//30/10 =3, 30%10 = 0