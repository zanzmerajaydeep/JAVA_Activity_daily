package ex_4;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number of players");
		Scanner sc = new Scanner(System.in);
		int numberOfPlayers = sc.nextInt();
		sc.nextLine();
		ArrayList<Player> players = new ArrayList<Player>();
		for (int i = 1; i <= numberOfPlayers; i++) {

			String details = sc.nextLine();
			players.add(Player.createPlayer(details));
		}
		
		Map<String,Integer> map = Player.calculateNationalityCount(players);
		System.out.format("%-15s %s\n","Country","Count");
		
		for(Entry<String, Integer> entry : map.entrySet())
		{
			System.out.format("%-15s %s\n",entry.getKey(),entry.getValue());
			
		}

	}

}
