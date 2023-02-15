package day_8_Ex2;

public class Team {
	
	protected String name;
	protected long numberOfMatches;
	
	@Override
	public String toString() {
		return "" + name + " -- " + numberOfMatches + "";
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(String name, long numberOfMatches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

}
