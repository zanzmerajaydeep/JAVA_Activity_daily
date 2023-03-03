
public class Player {
	
	private Long playerId;
	private String name;
	private String country;
	private Skill skill;
	public Player(Long playerId, String name, String country, Skill skill) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return playerId +" "+ name +" "+ country +" "+ skill ;
}

}
