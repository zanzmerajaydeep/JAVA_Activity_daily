package HasMap_ex_2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static String name;
	static int count;
	static String arr;
	static HashMap<String, Wicket> hm = new HashMap<String, Wicket>();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Main m = new Main();
		m.bowlerWickets("yes");
//		sc.nextLine();
//		System.out.println("Enter the player name to search");

	}

	public void bowlerWickets(String str) {
		Scanner sc = new Scanner(System.in);
		if (str.toLowerCase().equals("yes")) {
			// Scanner ss = new Scanner(System.in);
			System.out.println("Enter the Bowler name");
			name = sc.nextLine();

			System.out.println("Enter wickets - seperated by \"|\" symbol.");
			arr = sc.nextLine();
			// String[] a=arr.split("\\|");

			// count = a.length;

			hm.put(name, new Wicket(name, new Bowler(arr)));

			System.out.println("Do you want to add another Bowler (yes/no)");
			String ans = sc.nextLine();
			Main m = new Main();
			m.bowlerWickets(ans);

		} else if (str.toLowerCase().equals("no")) {

			Main m = new Main();
			m.searchBowler("yes");

		} else {
			System.out.println("invalid input");

		}

	}

	public void searchBowler(String str) {
		if (str.toLowerCase().equals("yes")) {
			// Player p = new Player();
			System.out.println("Enter the player name to search");
			String sname = sc.nextLine();
			if (hm.get(sname).equals(null)) {
				System.out.println("No player found with the name :" + sname);

			} else {

				System.out.println("Player Name :" + sname + "");
				System.out.println("Wickets : ");
				Wicket arr = hm.get(sname);

				Bowler b= arr.getBowler();
				String[] ar = b.getBowler().split("\\|");

				for (int i = 0; i < ar.length; i++) {
					System.out.println(ar[i]);
				}
			}

			System.out.println("Do you want to search another player (yes/np");
			String ans = sc.nextLine();
			Main m = new Main();
			m.searchBowler(ans);
		} else if (str.toLowerCase().equals("no")) {
			return;
		} else {
			System.out.println("invalid input");

		}

	}

}
