
public class Skill {

	private Long skillId;
	private String skillName;
	public Skill(Long skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}
	
	public Skill() {
		// TODO Auto-generated constructor stub
	}
	public Long getSkillId() {
		return skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	@Override
	public String toString() {
		return skillName ;
	}

}
