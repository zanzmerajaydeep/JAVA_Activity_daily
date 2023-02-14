package day_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_comman_score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		ArrayList<String> s14 = new ArrayList<String>();
		ArrayList<String> s15 = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the players who were the top scorers of IPL season 14.");
			s14.add(sc.nextLine());
		}

		for (String s : s14) {
			System.out.println(s);

		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the players who were the top scorers of IPL season 15.");
			s15.add(sc.nextLine());
		}

		for (String s : s15) {
			System.out.println(s);

		}
		
		ArrayList<String> comman= new ArrayList();
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(s14.get(i).equals(s15.get(j)))
				{
					comman.add(s14.get(i));
				}
			}
			
			
		}
		
		for (String s : comman) {
			System.out.println("the comman player : ");
			System.out.println(s);

		}
		
		

	}

}
