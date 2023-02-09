package test;

import java.util.Scanner;

public class Salary_calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	     System.out.print("Enter the salary: ");
	     int salary=sc.nextInt();



	   if(salary>8000)
	        System.out.println("Salary too large");
	   else if(salary<=0)
	        System.out.println("Salary is tooo small");
	   else{
	          System.out.print("Enter the number of extra shifts : ");
	          int shifts=sc.nextInt();
	          if(shifts<=0)
	               System.out.println("Shift is less than 0");
	          else{

	               double totalIncome=salary+salary*0.02*shifts;
	               double savings=totalIncome-(0.2*salary)-(0.3*salary);
	               System.out.print("Her saving is : "+ savings);

				   
	         }
	   }
	}

}
