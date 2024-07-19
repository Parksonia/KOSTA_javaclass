class Parent{
	
}
class Child  extends Parent{
	
	
}

public class InstanceOfTest {

	public static void main(String[] args) {

		Parent p1 = new Parent();
		Parent p2 = new Child();
		Child c = new Child();
		
//		System.out.println(p1 instanceof Parent); //당연
//		System.out.println(p2 instanceof Child); //당연
//		System.out.println(p2 instanceof Parent); //*** 중요
//		System.out.println(c instanceof Parent); // ***중요
//		System.out.println(c instanceof Child); // 당연

		Parent[] parents = new Parent[5];
		parents[0] = new Parent();
		parents[1] = new Child();
		parents[2] = new Parent();
		parents[3] = new Child();
		parents[4] = new Parent();
	
		int childCnt =0;
		for(int i=0; i<parents.length; i++) {
			if(parents[i] instanceof Child) childCnt++;
		}
		System.out.println(childCnt);
		int parentCnt =0;
		for(int i=0; i<parents.length; i++) {
			if(parents[i] instanceof Child == false) parentCnt++; 
			
		}
		System.out.println(parentCnt);
	}
	
}
