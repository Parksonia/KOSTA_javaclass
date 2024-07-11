
public class ArrayTest2 {

	public static void main(String[] args) {

		char[] hex = {'C','A','F','E'};
		String [] binary = {"0000","0001","0010","0011"
				,"0100","0101","0110","0111"
				,"1000","1001","1010","1011"
				,"1100","1101","1110","1111"};


		String result ="";
		
		for(int i=0; i<hex.length; i++) {
			if(hex[i]>='0' && hex[i]<='9') { 
				result += binary[hex[i]-'0'];
			}else if(hex[i]>='A' && hex[i]<'Z') {
				result += binary[hex[i]-'A'+10]; //앞에 10개는 0~9 숫자니까 10더해줌
			}else if(hex[i]>='a' && hex[i]<'z') {
				result +=binary[hex[i]-'a'+10]; 
			}
		}

		System.out.println("hex:"+new String(hex));
		System.out.println("binary:"+result);
	}

}
//'0' :"0000" binary[0] == binary['0'-'0']<-0번째 인덱스를 만들어줌(int) 
//'1' :"0001" binary[1] == binary['1'-'0']<-1번째 인덱스 
//'2' :"0010" binary[2] == binary['2'-'0']<-2번째 인덱스 
//'3' :"0011" binary[3] == binary['3'-'0']<-3번째 인덱스 
//...'9' 까지
//'A' :"1010" binary[10] binary['A'-'A'+10]
//'B' :"1011" binary[11] binary['B'-'A'+10]
//'C' :"1100" binary[12] binary['C'-'A'+10] 