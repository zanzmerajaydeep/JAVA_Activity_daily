package day_5;

import java.util.Scanner;

public class Custome_exception_example1 extends CustomeException {
	
	static String str;
	static int age;

	public static void main(String[] args) throws CustomeException {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter your name");
			str = sc.nextLine();
			
			System.out.println("Enter your age");
			 age = sc.nextInt();
			
			if(age<19)
			{
				throw new CustomeException();
				
			}
		}
		
		System.out.println("your name is : "+str+" and age is : "+age);
		
		
		

	}

}
