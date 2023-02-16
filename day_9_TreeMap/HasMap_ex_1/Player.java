package HasMap_ex_1;

public class Player {
	protected String bowlerName;
	protected int wicketCount;

	@Override
	public String toString() {
		return "" + wicketCount + "";
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String bowlerName, int wicketCount) {
		super();
		this.bowlerName = bowlerName;
		this.wicketCount = wicketCount;
	}

	public String getBowlerName() {
		return bowlerName;
	}

	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

	public int getWicketCount() {
		return wicketCount;
	}

	public void setWicketCount(int wicketCount) {
		this.wicketCount = wicketCount;
	}

}
