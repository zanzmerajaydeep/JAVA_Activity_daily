package day_2;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the team name: ");
	        String teamName = sc.nextLine();
	        System.out.println("Enter session: ");
	        String innigsName = sc.nextLine();
	        if((!innigsName.toLowerCase().equals("first")) && (!innigsName.toLowerCase().equals("second")))
	        {
	            System.out.println("Invalid input, session can be first or second only");
	            return;
	        }
	        System.out.println("Enter runs :");
	        int runs = sc.nextInt();

	        Innings innings = new Innings(teamName, innigsName.toLowerCase(), runs);

	        innings.displayInningsDetails();

	}

}
