package HasMap_ex_2;

public class Bowler {
	
	@Override
	public String toString() {
		return "" + Bowler + "";
	}

	protected String Bowler;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(String bowler) {
		super();
		Bowler = bowler;
	}

	public String getBowler() {
		return Bowler;
	}

	public void setBowler(String bowler) {
		Bowler = bowler;
	}

}
