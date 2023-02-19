package ex_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Collection;
//import java.util.Collections

import ex_2.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Player p new Player();
		Scanner sc = new Scanner(System.in);
		ArrayList<Player> players = new ArrayList<Player>();
		System.out.println("Enter the number of player");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter "+i+" player details");
			String Details = sc.nextLine();
			players.add(Player.createPlayer(Details));
			
		}
		
		Comparator<Player> c = new Comparator<Player>(){

			
			@Override
			public int compare(Player o1, Player o2) {
				// TODO Auto-generated method stub
				if(o1.getNumberOfMatches()>o2.getNumberOfMatches())
				{
					return 1;
				}else if (o1.getNumberOfMatches()<o2.getNumberOfMatches())
				{
					return -1;
				}
				
				return 0;
			}};
		
		while(true)
		{
			System.out.println("Enter a type to sort:\r\n" + "1.Sort by number of matches played\r\n"
					+ "2.Sort by runs scored\r\n" + "3.Sort by power rating\r\n" + "");
			int choice=sc.nextInt();
			sc.nextLine();
			
			
			
			if(choice==1)
			{
				Collections.sort(players,c);
				break;
			}
			else if(choice==2)
			{
				Collections.sort(players,(p,q)->{
					if(p.getRuns()> q.getRuns()) return 1;
					if(p.getRuns()<q.getRuns()) return -1;
					return 0;
				});
				break;
			}else if (choice==3)
			{
				Collections.sort(players,(p,q)->{
					if(p.getPowerRating()> q.getPowerRating()) return 1;
					if(p.getPowerRating()<q.getPowerRating()) return -1;
					return 0;
			});
				break;
			}else
			{
				System.out.println("Invalid input");
				break;
			}
			
		}
		
		System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", "Name","Date of birth","Skill","No of matches","Runs","Wickets","Nationality","Rating");
		for (Player player : players)
			System.out.printf("%-15s%-15s%-10s%-15s%-10s%-10s%-15s%-10s\n", player.getName(),
					player.getDate().toString(), player.getSkill(),player.getNumberOfMatches(), player.getRuns(),
					player.getWickets(), player.getNationality(), player.getPowerRating());
	

		
		
		
		
		
		

	}

}
