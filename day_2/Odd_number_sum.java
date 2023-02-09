package test;

import java.util.Scanner;

public class Odd_number_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number : ");
	        int number=sc.nextInt();
	        if(number>32767 && number<0)
	        {
	            System.out.println("Invalid input");
	            return;
	        }

	        int temp=number;
	        int sum=0;
	        while(temp%10!=0)
	        {
	            int digit=temp%10;
	            if(digit%2!=0)
	                sum+=digit;
	            temp=temp/10;
	        }
	        System.out.println("The sum of digits of "+number +" is "+sum);

			

	}

}
