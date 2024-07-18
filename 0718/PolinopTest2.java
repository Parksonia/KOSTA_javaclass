class Derived2 extends Base{
	@Override
	void method() {
	System.out.println("Derived2 Method!");
	}
}

public class PolinopTest2 {
	static Base[] bases = new Base[100];
	static int baseCnt;

//	static Derived[] deriveds = new Derived[100];
//	static int derivedCnt;
//	
//	static Derived2[] deriveds2 = new Derived2[100];
//	static int derivedCnt2;
//	
	static void addBase (Base base) {
		bases[baseCnt++] = base;
	}
	
//	static void addDerived(Derived derived) {
//		deriveds[derivedCnt++] = derived;
//	}
//
//	static void addDerived2(Derived2 derived2) {
//		deriveds2[derivedCnt2++] = derived2;
//	}

	static void callAllMethod() {
		for(int i=0; i<baseCnt;i++) {
			bases[i].method();
		}
	}
	public static void main(String[] args) {
	
//		Base base1 = new Base(); 
//		Derived derived = new Derived();
//		Derived derived2 =new Derived();
//		Base base2 = new Base(); 

		
		addBase(new Base());
		addBase(new Derived());
		addBase(new Derived());
		addBase(new Base());
		addBase(new Derived2());
		
		callAllMethod();
		
		//addDerived(new Derived());
		//addDerived(new Derived());
	
//		Base base = new Derived();
//		Base[] blist = new Base[5];
//		blist[0] = new Derived();
//		blist[1] = new Base();
//		blist[2] = new Derived2();
	}

}
