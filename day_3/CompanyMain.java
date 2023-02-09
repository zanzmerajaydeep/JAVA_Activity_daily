package day_2;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the Company name :");
        String name=sc.nextLine();
        System.out.println("Enter the employees: ");
        String employees=sc.nextLine().toLowerCase();
        System.out.println("Enter the team lead: ");
        String teamlead=sc.nextLine().toLowerCase();

        Company company;
        for(String employee:employees.split(","))
        {
            if(employee.equals(teamlead)) 
            { 
                company=new Company(name, employees, teamlead);
                company.displayCompanyDetails();
                return;
            }        
        }
        System.out.println("Invalid input");

	}

}
