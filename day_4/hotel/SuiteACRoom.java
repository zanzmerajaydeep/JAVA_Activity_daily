package hotel;

public class SuiteACRoom extends HotelRoom {
	
	private int ratePerSqFeet;

	public int getRatePerSqFeet() {
		
		if(this.isHasWifi()==true)
	    {
			this.ratePerSqFeet+=2;
			return ratePerSqFeet;
	    }
	    else
	    {
	    	return ratePerSqFeet;
	    	
	    }
		
		
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		this.ratePerSqFeet=15;
	}

	

}
