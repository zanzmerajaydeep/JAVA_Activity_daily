package day_8_Ex1;

public class Player {
	protected String name;
	protected String skill;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public Player(String name, String skill) {
		super();
		this.name = name;
		this.skill = skill;
	}
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Main [name=" + name + ", skill=" + skill + "]";
	}

}
