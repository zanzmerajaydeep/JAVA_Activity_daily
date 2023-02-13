package day_5;

import java.util.Scanner;

public class Exception_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) 
		{
			System.out.println("Enter number of over");
			int num = sc.nextInt();
			
			int[] over= new int[num];
			//System.out.println(over[0]);
			
			System.out.println("Enter the runs for each over");
			for(int i=0;i<num;i++ )
			{
				over[i]=sc.nextInt();
				
			}
			
			sc.nextLine();
			System.out.println("Enter the over number");
			int temp=sc.nextInt();
			System.out.println("Runs scored in this over : "+over[temp-1]);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}catch(Exception e)
		{
			System.out.println(e);	
		}	
	}

}
