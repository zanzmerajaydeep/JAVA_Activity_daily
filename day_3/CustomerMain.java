package day_2;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Details: ");
        String details[]=sc.nextLine().split(",");
        if(details.length!=3)
        {
            System.out.println("Invalid input");
            return;
        }
        Customer customer=new Customer(details[0], details[1], details[2]);

         System.out.println("Customer details: ");
            System.out.println("Name: "+customer.getName());
            System.out.println("Address: "+customer.getAddress());
            System.out.println("Mobile: "+customer.getMobile());

	}

}
