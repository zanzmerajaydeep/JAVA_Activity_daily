package day_2;

public class Customer {

	
		
		private String name;
	    private String address;
	    private String mobile;

	    public Customer(String name, String address, String mobile)
	    {
	        this.name=name;
	        this.address=address;
	        this.mobile=mobile;
	    }

	    public void setName(String name)
	    {
	        this.name=name;
	    }
	    public void setAddress(String address)
	    {
	        this.address=address;
	    }
	    public void setMobile(String mobile)
	    {
	        this.mobile=mobile;
	    }

	    public String getName()
	    {
	        return this.name;
	    }


	    public String getMobile()
	    {
	        return this.mobile;
	    }

	    public String getAddress()
	    {
	        return this.address;
	    }


	

}
