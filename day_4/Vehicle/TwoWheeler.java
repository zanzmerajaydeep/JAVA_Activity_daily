package day_4;

public class TwoWheeler extends Vehicle {
	
	private Boolean kickStartAvailable=false;
	//private Boolean b;

	public TwoWheeler(String m, String vn, String ft, String fc, int cc,boolean an) {
		super(m, vn, ft, fc, cc);
		// TODO Auto-generated constructor stub
		this.kickStartAvailable = an;
	}
	
	
	public void displayDetailInfo()
	{
		System.out.println("---Details Information---");
		System.out.println("kickStartAvailable : "+this.kickStartAvailable+"");
		
		
	}


	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}


	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	

}
