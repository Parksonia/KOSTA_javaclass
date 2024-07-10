
public class SwitchTest {

	public static void main(String[] args) {
	
		int kor = 100, eng = 100, math =100;
		int tot = kor+eng+math;
		double avg = tot/3.0;
	
	//A,b,c,d,e,f switch문으로 출력
		
		System.out.println(((int)avg/10));
		switch((int)(avg/10)) { //switch문의 조건식에는 정수형만 올 수 있다.->byte,short,int,long,char,String

		
		case 10:  	case 9: //break를 쓰지 않으면 그다음 조건을 만날때까지 진행함
		System.out.println("A");
		break;
		case 8:
			System.out.println("B");
		break;
			
		case 7:
			System.out.println("C");
		break;
			
		case 6:
			System.out.println("D");
		break;
		
		default : System.out.println("F");
		}
	}

}
