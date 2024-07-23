
public class StringBuilderTest {

	public static void main(String[] args) {
		
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("abcdefg");
		System.out.println(sBuilder);
		sBuilder.deleteCharAt(1);
		System.out.println(sBuilder);
		sBuilder.delete(2, 3);
		System.out.println(sBuilder);
	}

}
