package studio7;

public class Complex {
	
	
	private double a;
	private double bi;
	
	public Complex(double a1, double bi1) {
		a = a1;
		bi = bi1;
	}
	
	public Complex Sum(Complex complex2) {
		return new Complex(a + complex2.a, bi + complex2.bi);
	}
	
	public Complex Product(Complex complex2) {
		return new Complex(a * complex2.a - bi * complex2.bi, a * complex2.bi + bi * complex2.a);
	}
	
	public String toString() {
		return "" + a + "," + bi + "i";
	}
	
	public static void main(String[] args) {
		Complex complex1 = new Complex(1, 5);
		Complex complex2 = new Complex(2, 10);
		
		System.out.println(complex1.Sum(complex2).toString());
		System.out.println(complex1.Product(complex2).toString());

	}
	

}
