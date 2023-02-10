package day_4;

public class Vehicle {
	
	private String make;
	private String vehicleNumber;
	private String fuelType;
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(String fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	private String fuelCapacity;
	private int cc;
	
	public Vehicle(String m,String vn, String ft, String fc, int cc)
	{
		this.make=m;
		this.vehicleNumber=vn;
		this.fuelType=ft;
		this.fuelCapacity=fc;
		this.cc=cc;
		
	}
	
	public void basicInfo ()
	{
		System.out.println("***"+this.getMake()+"***");
		System.out.println("-----Basic Infomation-----");
		System.out.println("Vehicle Number : "+this.getVehicleNumber()+" ");
		System.out.println("Fuel Capacity : "+this.getFuelCapacity()+"");
		System.out.println("Fuel Type : "+this.getFuelType()+"");
		System.out.println("CC : "+this.getCc()+"");
		
	}
	
	public void detailsInfomation ()
	{
		
		
	}

	

}
