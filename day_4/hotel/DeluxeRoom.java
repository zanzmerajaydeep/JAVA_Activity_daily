package hotel;

public class DeluxeRoom extends HotelRoom{
	
	private int ratePerSqFeet;
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=10;
		
		
	}


	
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}



	public int getRatePerSqFeet() {
		
		if(this.isHasWifi()==true)
	    {
			this.ratePerSqFeet=10+2;
			return ratePerSqFeet;
	    }
	    else
	    {
	    	return ratePerSqFeet;
	    	
	    }
		
	}



	

}
