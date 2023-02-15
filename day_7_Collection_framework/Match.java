package day_7_CollectionFramework;

import java.time.LocalDate;
import java.util.Objects;

public class Match implements Comparable<Match> {

	private LocalDate matchDate;
	private String teamOne;
	private String teamTwo;

	@Override
	public String toString() {
		return "Match matchDate=" + matchDate + ", teamOne=" + teamOne + ", teamTwo=" + teamTwo;
	}

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(LocalDate matchDate, String teamOne, String teamTwo) {
		super();
		this.matchDate = matchDate;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matchDate, teamOne, teamTwo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Match other = (Match) obj;
		return Objects.equals(matchDate, other.matchDate) && Objects.equals(teamOne, other.teamOne)
				&& Objects.equals(teamTwo, other.teamTwo);
	}

	public LocalDate getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(LocalDate matchDate) {
		this.matchDate = matchDate;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	@Override
	public int compareTo(Match n) {
		// TODO Auto-generated method stub

		return this.matchDate.compareTo(n.getMatchDate());
	}

}
