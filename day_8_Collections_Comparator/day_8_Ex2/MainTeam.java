package day_8_Ex2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//import day_7_CollectionFramework.Match;

public class MainTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		ArrayList<Team> al = new ArrayList<Team>();

		System.out.println("Enter number of Team");
		int n = sc.nextInt();

		for (int i = 1; i <=n; i++) {
			System.out.println("Enter the Team "+i+"  Details");
			System.out.println("Enter the Name");
			String str = sc.next();
			
			sc.nextLine();
			System.out.println("Enter the Number of Matchs");
			long t1 = sc.nextLong();

			al.add(new Team(str, t1));

		}

		Collections.sort(al, new TeamComparator());

		for (Team t : al) {
			System.out.println(t);

		}

	}

}
