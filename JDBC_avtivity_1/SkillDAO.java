import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SkillDAO {
	
	public Skill getSkillByID(Long id) throws Exception {
		Skill skill = new Skill();
		
		Connection c = MyConfig.getConnection();
		PreparedStatement ps = c.prepareStatement("select * from skill where skillId=?");
		ps.setLong(1, id);
		skill.setSkillId(id);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			skill.setSkillName(rs.getString(2));
		}
		c.close();
		return skill;
	}
	

}
