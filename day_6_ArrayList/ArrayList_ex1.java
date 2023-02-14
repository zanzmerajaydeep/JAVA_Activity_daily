package day_6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<String> al = new ArrayList<String>();

		System.out.println("Enter the player Details");
		System.out.println("Enter the player name");
		al.add(sc.nextLine());

		System.out.println("Enter the player age");
		al.add(sc.nextLine());

		System.out.println("Enter the player Country name");
		al.add(sc.nextLine());
        
		System.out.println("the player Details");
		for (String i : al) {
			System.out.println(i);
		}

		System.out.println("Enter the player Skill");
		String str = sc.nextLine();
		System.out.println("Enter the position to add the skill");
		int p = (sc.nextInt()-1);
		
		al.remove(p);
		al.add(p, str);
		
		System.out.println("the player Details");
		for (String i : al) {
			System.out.println(i);
		}
		
		System.out.println("Enter the position to remove element");
		int p1 = (sc.nextInt()-1);
		
		al.remove(p1);
		
		System.out.println("the player Details");
		for (String i : al) {
			System.out.println(i);
		}
		

	}

}
