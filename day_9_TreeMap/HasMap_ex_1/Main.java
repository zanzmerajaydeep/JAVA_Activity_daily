package HasMap_ex_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static String name;
	static int count;
	static String arr;
	static HashMap<String, Player> hm = new HashMap<String, Player>();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
	    
		Main m = new Main();
		m.playerWickets("yes");
		sc.nextLine();
		System.out.println("Enter the player name to search");

	}

	public void playerWickets(String str) {
		Scanner sc = new Scanner(System.in);
		if (str.toLowerCase().equals("yes"))
		{
			//Scanner ss = new Scanner(System.in);
			System.out.println("Enter the player name");
			name = sc.nextLine();

			System.out.println("Enter wickets - seperated by \"|\" symbol.");
			arr = sc.nextLine();
			String[] a=arr.split("\\|");

			count = a.length;

			hm.put(name, new Player(name, count));
			
			System.out.println("Do you want to add another player (yes/no)");
			String ans= sc.nextLine();
			Main m = new Main();
			m.playerWickets(ans);

		}
		else if(str.toLowerCase().equals("no"))
		{
			
			Main m = new Main();
			m.searchPlayer("yes");
		    
		}else
		{
			System.out.println("invalid input");
			
		}
		

	}
	public void searchPlayer(String str)
	{
		if(str.toLowerCase().equals("yes")) {
		Player p = new Player();
		System.out.println("Enter the player name to search");
		String sname=sc.nextLine();
		if(hm.get(sname).equals(null))
		{
			System.out.println("No player found with the name :"+sname);
			
		}else {
		
		System.out.println("Player Name :"+sname+"");
		System.out.println("Wicket Count :"+hm.get(sname));
		}
		
		System.out.println("Do you want to search another player (yes/np");
		String ans= sc.nextLine();
		Main m = new Main();
		m.searchPlayer(ans);
		}else if (str.toLowerCase().equals("no"))
		{
			return;
		}else
		{
			System.out.println("invalid input");
			
		}
		
		
	}

}
