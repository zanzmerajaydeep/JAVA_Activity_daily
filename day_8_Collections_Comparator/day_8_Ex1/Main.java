package day_8_Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

//import day_7_CollectionFramework.Match;

public class Main {
	static String skill;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Player> al = new ArrayList<Player>();

		System.out.println("Please provide the number of players to be registered");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) 
		{
			System.out.println("Please enter player name");
			String name = sc.next();

			System.out.println("Please select the skill of the player");
			System.out.println("1.All Riunder");
			System.out.println("2.Batsman");
			System.out.println("3.Bowler");
			int num = sc.nextInt();
			
			if (num == 1) {
				skill = "All Rounder";
			} else if (num == 2) {
				skill = "Batsman";
			} else if (num == 3) {
				skill = "Bowler";
			} else {
				System.out.println("invalid input");
			}

			al.add(new Player(name, skill));

		}

		Comparator<Player> pc = new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				// TODO Auto-generated method stub
				int Skillcompare = o1.getSkill().compareTo(o2.getSkill());
				if (Skillcompare != 0) {
					return Skillcompare;
				}

				return o1.getName().compareTo(o2.getName());
			}
		};
		
		Collections.sort(al,pc);
		
		for(Player m : al)
		{
			System.out.println(m);
		}

		// Collections.sort);

	}

}
