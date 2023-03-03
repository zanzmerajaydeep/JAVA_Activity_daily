import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {
	
public List<Player> getAllPlayers() throws Exception {
		
		List<Player> p1 = new ArrayList<Player>();
		Connection c = MyConfig.getConnection();
		PreparedStatement ps = c.prepareStatement("select * from Player order by name");
		ResultSet rs = ps.executeQuery();
		Skill sk = new Skill();
		SkillDAO skdao = new SkillDAO();
		while(rs.next()) {
			sk = skdao.getSkillByID(rs.getLong(1));
			p1.add(new Player(rs.getLong(1),rs.getString(2),rs.getString(3),sk));
			
		}
		c.close();
		return p1;
		
	}

}
