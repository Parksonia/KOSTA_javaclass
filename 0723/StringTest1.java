
public class StringTest1 {

	public static void main(String[] args) {

		String string = new String("hong"); // String class의 생성자, 인자로 초기화 값을 보냄
		char [] carr = {'g','i','l','d','o','n','g'};
		String name = new String(carr); // char[]을 인자로 보내 생성자로 초기화 가능
		
		System.out.println(string);
		System.out.println(name);

		StringBuffer sBuffer = new StringBuffer("hong gil dong");
		String fullname = new String(sBuffer); //StringBuffer 인자로 초기화
		System.out.println(fullname);
		
		//String.charAt(index);메서드 String의 특정 글자를 가져올 때 
		char ch = string.charAt(1);
		System.out.println(ch);
		
		//.concat(param) 메서드 : 문자열을 이어줌
		String fullname2 = string.concat(name); 
		System.out.println(fullname2);
	
		//.contains(param) param이 존재 여부 true/false return 
		System.out.println(fullname.contains("tong"));
	
		//.endWith(param) 파일 확장자를 알 수 있음  true/false return
		String filename = "hello.txt";
		System.out.println(filename.endsWith("txt"));
		System.out.println(filename.startsWith("hello"));
		
		//.equals() :문자열이 동일 한지 확인  true/false return
		System.out.println(fullname.equals(fullname2));
		System.out.println(string.equals("HONG"));
		//.equalsIgnoreCase() :대소문자 구분없이 문자가 동일한지 확인
		System.out.println(string.equalsIgnoreCase("Hong"));
		
		//.indexOf('char') : 해당 캐릭터 (글자하나) 몇번째 인덱스에 있는지 숫자 반환
		System.out.println(string.indexOf('n'));
		//.indexOf("String") : 문자열이 param 이 들어갈 경우  문자열의 첫번째 글자 기준으로 반환됨
		//존재하지 않으면 -1반환됨
		System.out.println(fullname.indexOf("dong"));
		
		
		String string2 = "sdlkABfjwkABjsdlsABkalAB";
		//여러개의 "AB" (param)가 존재하는경우 제일 처음 발견되는 인덱스 반환
		System.out.println(string2.indexOf("AB")); 
		//.lastIndexOf(param) 제일 마지막 param의 인덱스 반환 
		System.out.println(string2.lastIndexOf("AB"));
		//.lenght() :문자열 길이 반환
		System.out.println(string2.length());
		
		//.replace(param1,param2) : 원본이 바뀌지않음(readonly영역이니까), 새로운 변수에 저장할 때 사용
		String string3 = string2.replace("AB","ab");
		string2.replace("AB", "ab");
		System.out.println(string2); //sdlkABfjwkABjflsABkalAB
		System.out.println(string3); //sdlkabfjwkabjflsabkalab
		
		String string4 = string2.replaceAll("sd","SD"); //SDlkABfjwkABjSDlsABkalAB
		System.out.println(string4);
		//.replaceFirst() 첫번째 sd만 SD로 바뀜
		String string5 = string2.replaceFirst("sd","SD");//SDlkABfjwkABjsdlsABkalAB
		System.out.println(string5);
		
		String animals = "cat#dog#bear";
		String[] animalList = animals.split("#");
		for(int i=0; i<animalList.length; i++)
		{
		System.out.print(animalList[i]);	
		}
		System.out.println();
		
		//.split("#",limit) :limit(숫자)을 주어 몇개까지만 자를 수 있다. 
		String[] animalList2 = animals.split("#",2);
		for(int i=0; i<animalList2.length; i++)
		{
		System.out.println(animalList2[i]);	
		}
		System.out.println();
		System.out.println(fullname2);
		System.out.println(fullname2.substring(4));
		System.out.println(fullname2.substring(4, 7));
		
		//대문자로
		System.out.println(name.toUpperCase());
		//소문자로
		System.out.println(name.toLowerCase());
	
		//.trim()
		String string7 = "   sdfsd  ";
		System.out.println(string7.length()); //10
		System.out.println(string7.trim());
		System.out.println(string7.trim().length()); //5
		
		//String.valueOf(param) : 여러 타입의 param 을 인자로 보내 문자열로 바꿈
		boolean b = true; 
		System.out.println(b+"");
		System.out.println(String.valueOf(b));
		
		int n = 10;
		System.out.println(n+"");
		System.out.println(String.valueOf(n));
	}
	
}
