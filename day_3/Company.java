package day_2;

public class Company {

	
		
		private String name;
	    private String employees;
	    private String teamlead;

	    public Company(String name, String employees, String teamlead)
	    {
	        this.name=name;
	        this.employees=employees;
	        this.teamlead=teamlead;
	    }

	    public void setName(String name)
	    {
	        this.name=name;
	    }
	    public void setEmployees(String employees)
	    {
	        this.employees=employees;
	    }
	    public void setTeamlead(String teamlead)
	    {
	        this.teamlead=teamlead;
	    }

	    public String getName()
	    {
	        return this.name;
	    }


	    public String getTeamlead()
	    {
	        return this.teamlead;
	    }

	    public String getEmployees()
	    {
	        return this.employees;
	    }

	    public void displayCompanyDetails() {
	        System.out.println("Name: " + this.name);
	        System.out.println("Employees : " + this.employees);
	        System.out.println("Lead "+ this.teamlead);

	    }

	

}
