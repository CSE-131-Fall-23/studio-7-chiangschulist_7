package studio7;

public class Fraction {
	private int denom;
	private int num;
	
	public Fraction() {
		num = 1;
		denom = 1;
	}
	
	public Fraction(int n, int d) {
		num = n;
		denom = d;
	}
	
	public Fraction sum(Fraction frac2) {
		int num1 = num * frac2.denom;
		int num2 = frac2.num * denom;
		int denom2 = denom * frac2.denom;
		return new Fraction(num1 + num2, denom2).simplify();
	}
	
	public Fraction product(Fraction frac2) {
		return new Fraction(num * frac2.num, denom * frac2.denom).simplify();
	}
	
	public Fraction reciprocal() {
		return new Fraction(denom, num);
	}
	
	public Fraction simplify() {
		int gcd = gcd(num, denom);
		return new Fraction(num / gcd, denom / gcd);
	}
	
	public int gcd(int a, int b) { return b==0 ? a : gcd(b, a%b); }
	
	
	
	public static void main(String[] args) {
		Fraction frac1 = new Fraction(1, 2);
		Fraction frac2 = new Fraction(1, 3);
		Fraction frac3 = new Fraction(4, 10);
		System.out.println("sum: " + frac1.sum(frac2).num + "/" + frac1.sum(frac2).denom);
		System.out.println("product: " + frac1.product(frac2).num + "/" + frac1.product(frac2).denom);
		System.out.println("reciprocal: " + frac1.reciprocal().num + "/" + frac1.reciprocal().denom);
		System.out.println("simplify: " + frac3.simplify().num + "/" + frac3.simplify().denom);

	}

}
