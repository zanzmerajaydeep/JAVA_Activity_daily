package test;

import java.util.Scanner;

public class Number_is_pow_of_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	      System.out.print("Enter the number: ");
	      int number=sc.nextInt();
	      if(number<0)  
	        System.out.println("number is too small");
	      else if(number>32767)
	        System.out.print("number is too large");
	      else
	      {
	        while(number%2==0)
	            number=(number/2);
	        if(number==1)
	            System.out.print("Yes");
	        else
	            System.out.print("No");
	      }
		

	}

}




