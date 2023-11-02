package studio7;

public class HockeyPlayer {

	private String name;
	private int number;
	private boolean rightHand;
	private boolean rightShoot;
	private int goals;
	private int assists;
	private int games;
	
	public HockeyPlayer(String n, int nu, boolean rH, boolean rS, int g, int a, int ga) {
		name = n;
		number = nu;
		rightHand = rH;
		rightShoot = rS;
		goals = g;
		assists = a;
		games = ga;
	}
	
	public void updateGoalsAssists(int g, int a) {
		goals += g;
		assists += a;
		games++;
	}
	
	public int getPoints() {
		return goals + assists;
	}
	
	public static void main(String[] args) {
		HockeyPlayer player1 = new HockeyPlayer("name", 12, true, true, 5, 4, 2);
		player1.updateGoalsAssists(5, 3);
		System.out.println("goals: " + player1.goals);
		System.out.println("assists: " + player1.assists);
		System.out.println("points: " + player1.getPoints());
		System.out.println("games: " + player1.games);
	}

}
