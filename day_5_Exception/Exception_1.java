package day_5;

import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the total runs score");
			int score = sc.nextInt();
			
			System.out.println("Enter the overs faced");
			int over = sc.nextInt();
			
			int rr = score/over;
			
			System.out.println("Current Run rate : "+rr);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		//ArithmeticException | NumberFormatException
		

	}

}
