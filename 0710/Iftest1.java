
public class Iftest1 {

	public static void main(String[] args) {

		int kor = 92, eng = 92, math =100;
		int tot = kor+eng+math;
		double avg = tot/3.0;
		String grade;
		System.out.println(avg);
		//Math.round() 메서드의 리턴값과 그 활용에 대해 더 알아보기
		System.out.println(Math.round(avg*100)/100F);
		
		
		if(avg >=90) {
			grade="A";
				if(avg >=98) { //중첩 조건문
					grade+="+";
				}else if(avg>=94) {
					grade+="0";
				}else {
					grade +="-"; //중첩 조건문에서는 반드시! else를 생각해야한다!(빠지는 조건은 없는지 확인)
				}	
			System.out.println(grade); 
		}else if(avg >= 80) { //if가 참일 경우는 else if로 갈 일이 없기때문에 avg <90 넣지 않아도 된다.
			System.out.println('B');
		}else if(avg>=70) {
			System.out.println('C');
		}else if (avg>=60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}
	
		if(avg <60) {
			System.out.println('F');
		}else if(avg < 70) { //if가 참일 경우는 else if로 갈 일이 없기때문에 avg <90 넣지 않아도 된다.
			System.out.println('D');
		}else if(avg < 80) {
			System.out.println('C');
		}else if (avg < 90) {
			System.out.println('B');
		}else {
			System.out.println('A');
		}
	}

}
