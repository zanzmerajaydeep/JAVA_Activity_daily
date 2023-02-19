package ex_5;

import java.util.ArrayList;
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
		
		String highestPlayerFromCountries=Player.highestCount(players);
		System.out.println("The nationality with maximum players: "+highestPlayerFromCountries);

	}

}
