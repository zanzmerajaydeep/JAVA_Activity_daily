package eX3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Team> teams=new ArrayList<Team>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of player");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the "+n+" name of team | player");
		for(int i=1;i<=n;i++)
		{	
			
			String team=sc.nextLine();
			String teamName=team.split("\\|")[0];
			String playerName=team.split("\\|")[1];
			Player player=new Player(playerName);
			teams.add(new Team(teamName,player));
		}
		
		Collections.sort(teams);
		
		for(int i=0;i<teams.size();i++) {
			ArrayList<Player> sameTeamPlayers=new ArrayList<Player>();
			String currentTeamName=teams.get(i).getName();
			System.out.println(currentTeamName);
			for(int j=0;j<teams.size();j++)
			{
				String teamName=teams.get(j).getName();
				String playerName=teams.get(j).getPlayer().getName();
				if(teamName.equals(currentTeamName))
				{
					sameTeamPlayers.add(new Player(playerName));
					i++;
				}
				
			}
			
			Collections.sort(sameTeamPlayers);
			for(Player player:sameTeamPlayers) {
				System.out.println("    --"+player.getName());
			}
		}

	}

}
