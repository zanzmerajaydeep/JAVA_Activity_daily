package day_2;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
         employee em = new employee();

         System.out.println("Enter the name: ");
         String name=sc.nextLine();
         em.setName(name);

         System.out.println("Enter Address: ");
         String address=sc.nextLine();
         em.setAddress(address);

         System.out.println("Enter mobile: ");
         String mobile=sc.nextLine();
         em.setMobile(mobile);

         System.out.println("Employee details: ");
         em.displayEmployeeDetails();

	}

}
