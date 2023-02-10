package day_4;

public class FourWheeler extends Vehicle{
	
	private String audioSystem;
	private String numberOfDoors;

	
	public FourWheeler(String m, String vn, String ft, String fc, int cc , String as, String nd) {
		super(m, vn, ft, fc, cc);
		// TODO Auto-generated constructor stub
		this.audioSystem=as;
		this.numberOfDoors=nd;
	}
	
	public void displayDetailInfo()
	{
		System.out.println("---Details Information---");
		System.out.println("audioSystem : "+this.getAudioSystem()+"");
		System.out.println("number od doors : "+this.getNumberOfDoors()+"");
		
		
	}

	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public String getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(String numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	

}
