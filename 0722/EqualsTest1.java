class Complex { // 3+5i
	int real;
	int imaginary;
	
	public Complex(int r, int i) {
		real = r;
		imaginary = i;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Complex)) return false; // Object나 다른 타입이 올 수 있으니 걸러주는 작업
		Complex complex = (Complex)obj; // 걸러진 obj 인자를 down-casting하여 Complex  담음 
		return real == complex.real && imaginary == complex.imaginary; // 둘다 같아야  true 
	}
	@Override
	public int hashCode() {
		return real*real+imaginary*imaginary*imaginary;
	}
}

public class EqualsTest1 {

	public static void main(String[] args) {
		Complex c1 = new Complex(3, 5);
		Complex c2 = new Complex(3, 5);
		Complex c3 = new Complex(5, 5);
		Complex c4 = new Complex(3, 3);
		
		System.out.println(c1.equals(c2)); // true
		System.out.println(c1.equals(c3)); // false
		System.out.println(c1.equals(c4)); // false
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		
	}

}
