package day_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_swap_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<String> teams = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the teams name");
			teams.add(sc.nextLine());
		}

		for (String s : teams) {
			System.out.println(s);

		}

		System.out.println("Enter the position to swap");
		int a = sc.nextInt();
		a=(a-1);

		String temp = "";
		temp = teams.get(a);

		teams.remove(a);
		a +=1;
		teams.add(a, teams.get(a));
		
       
		teams.remove(a);
		teams.add(a,temp);

		for (String s : teams) {
			System.out.println(s);

		}

	}

}
