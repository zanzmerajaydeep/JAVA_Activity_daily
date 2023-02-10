package Match;

import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Match Format");
		System.out.println("1.ODI");
		System.out.println("2.T20");
		System.out.println("3.Test");

		Scanner s = new Scanner(System.in);

		int type = s.nextInt();

		System.out.println("Enter the Current score:");

		int score = s.nextInt();
		
		System.out.println("Enter the Current over:");

		int over = s.nextInt();

		System.out.println("Enter the Target Score");

		int targetScore = s.nextInt();

		System.out.println("Requirements:");

		switch (type) {
		case 1://odi
			ODIMatch om = new ODIMatch();
			om.setCurrentOver(over);
			om.setCurrentScore(score);
			om.setTarget(targetScore);
			om.display(om.calculateRunRate(), om.calculateBalls());
			break;
		case 2://Test
			TestMatch tm = new TestMatch();
			tm.setCurrentOver(over);
			tm.setCurrentScore(score);
			tm.setTarget(targetScore);
			tm.display(tm.calculateRunRate(), tm.calculateBalls());
			break;
		case 3://T20
			T20Match t20m = new T20Match();
			t20m.setCurrentOver(over);
			t20m.setCurrentScore(score);
			t20m.setTarget(targetScore);
			t20m.display(t20m.calculateRunRate(), t20m.calculateBalls());
			break;
		default:
			System.out.println("Invalid");
			
			
		}

	}

}
