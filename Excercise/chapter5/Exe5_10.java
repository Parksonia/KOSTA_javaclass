package chapter5;

//다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
//(1)에 알맞은 코드를 넣어서 완성하시오.
public class Exe5_10 {

	public static void main(String[] args) {
		//a b c d e f g ...
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' }; // 'a'-'a' ~'z'-'a'로 인덱스 알아내기

		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			
			if(ch>='a'&& ch<='z') { //abcCode참조
				result+= abcCode[ch-'a'];
				
			}else if(ch>='0' && ch<='9') {  //numCode참조
				result+=numCode[ch-'0'];
				
			}
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);

	}

}
//abc123 알파벳인지? 숫자인지? 확인하고 abcCode인지? numCode인지 확인 
//'a' =>abcCode[0]   'a' -'a' =0
//'b' =>abcCode[1]   'b' -'a' =1
//'c' =>abcCode[2]   'c' -'a' =2
//'t' =>abcCode[15]  't' -'a' =15
//'1' =>numCode[1]  '1'-'0' =1
//'2' =>numCode[2]  '2'-'0' =2
//'3' =>numCode[3]  '3'-'0' =3
