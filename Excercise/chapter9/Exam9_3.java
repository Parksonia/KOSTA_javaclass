package chapter9;

public class Exam9_3 {

	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		String path = "";   // \의 라스트 인덱스를 찾아서 subString
		String fileName = "";
	
		int idx = fullPath.lastIndexOf("\\");
		path = fullPath.substring(0,idx);
		fileName = fullPath.substring(idx+1);
		
		
		
		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);

	}

}

//fullPath:c:\jdk1.5\work\PathSeparateTest.java
//path:c:\jdk1.5\work
//fileName:PathSeparateTest.java