package studio7;

public class Die {
	
	
	private int n;
	
	public Die() {
		n = 0;
	}
	
	public Die(int nu) {
		n = nu;
	}
	
	public int random() {
		int rand = (int) (Math.random() * (n)) + 1;
		return rand;
	}

	public static void main(String[] args) {
		Die die1 = new Die(6);
		Die die2 = new Die(20);
		
		System.out.println(die1.random());
		System.out.println(die2.random());

	}

}
