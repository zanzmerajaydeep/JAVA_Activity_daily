import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPlayerSkill {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
		
		PlayerDAO p1 = new PlayerDAO();
		List<Player> pl = new ArrayList<Player>();
		
		pl = p1.getAllPlayers();
		
		System.out.printf("%-10s%-20s%-20s%s\n","Id","Name","Country","Skill");
		
		for(int i=0;i<pl.size();i++) {
			
			Player pl1 = pl.get(i);
			Long id = pl1.getPlayerId();
			String name = pl1.getName();
			String country = pl1.getCountry();
			Skill sk = pl1.getSkill();
			
			String skillname = sk.getSkillName();
			
			System.out.printf("%-10s%-20s%-20s%s\n",id,name,country,skillname);
		}
	}

}
