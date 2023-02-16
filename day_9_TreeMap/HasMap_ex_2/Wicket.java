package HasMap_ex_2;

public class Wicket {
	protected String playerName;
	private Bowler bowler;
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Bowler getBowler() {
		return bowler;
	}
	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}
	public Wicket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wicket(String playerName, Bowler bowler) {
		super();
		this.playerName = playerName;
		this.bowler = bowler;
	}
	@Override
	public String toString() {
		return "" + bowler + "/n";
	}
	
}