package ex_3;

import java.time.LocalDate;

public class Player {
	
	private String name;
	private LocalDate date;
	private String skill;
	private int numberOfMatches;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;

	
	@Override
	public String toString() {
		return "Player name=" + name + ", date=" + date + ", skill=" + skill + ", numberOfMatches=" + numberOfMatches
				+ ", runs=" + runs + ", wickets=" + wickets + ", nationality=" + nationality + ", powerRating="
				+ powerRating ;
	}
	
	public Player(String name, LocalDate date, String skill, int numberOfMatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.date = date;
		this.skill = skill;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}
	
	public static Player createPlayer(String detail) {
		String name=detail.split(",")[0];
		String dateOfBirth=detail.split(",")[1];
		String skill=detail.split(",")[2];
		int numberOfMatches=Integer.parseInt( detail.split(",")[3]);
		int runs=Integer.parseInt(detail.split(",")[4]);
		int wickets=Integer.parseInt(detail.split(",")[5]);
		String nationality=detail.split(",")[6];
		double powerRating=Double.parseDouble(detail.split(",")[7]);
		return new Player(name, LocalDate.parse(dateOfBirth), skill, numberOfMatches, runs, wickets, nationality, powerRating);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	
}
