package day_7_CollectionFramework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
       //ArrayList<Match> ts = new ArrayList<Match>();
		TreeSet<Match> ts=new TreeSet<Match>();
		
		
		System.out.println("Enter number of Match");
		int n = sc.nextInt();
		
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter the date match in formate of  yyyy/mm/dd");
			String str = sc.next();
		    LocalDate d = LocalDate.parse(str);
		    
		    System.out.println("Enter the teamOne");
		    String t1 =sc.nextLine();
		    
		    sc.nextLine();
		    System.out.println("Enter the teamTwo");
		    String t2 =sc.nextLine();
		    
		    ts.add(new Match(d,t1,t2));
		     
		}
		
		//Collections.descendingSet(ts);
		
		ts.descendingSet();
		
		for(Match m : ts)
		{
			System.out.println(m);
		}
		
		//System.out.println(ts);
	}

}
