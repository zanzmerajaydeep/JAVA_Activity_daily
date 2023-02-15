package day_7_CollectionFramework;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_SortPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<String>();
		
		System.out.println("Enter number of player");
		int n = sc.nextInt();
		
		System.out.println("Enter  "+n+" player name");
		for(int i=0; i<=n; i++)
		{
		      ts.add(sc.nextLine());	
		}
		
		System.out.println(ts);

	}

}
