package hotel;

public class HotelRoom {
	
	private String hotelName;
	private int numberOfSqFeet;
	private boolean hasTV;
	private boolean hasWifi;
	
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	
	public void calculateTariff(int nsf, int rpsf)
	{
		int num;
		num=nsf*rpsf;
		System.out.println("rate is :-"+num);
		
	}
	
	public int getRatePerSqFeet()
	{
	    int num=0;
		return num;
		
	}
	
	
	
	

	

}
