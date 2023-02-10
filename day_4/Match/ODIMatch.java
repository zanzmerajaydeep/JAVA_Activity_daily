package Match;

public class ODIMatch extends Match {
	
	public ODIMatch() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		
		
		return (this.getTarget()-this.getCurrentScore())/(50 - this.getCurrentOver());
	}

	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		return (int) ((50 - this.getCurrentOver())*6);
		
		
	}

	@Override
	public void display(double reqRunrate, int balls) {
		// TODO Auto-generated method stub
		System.out.println("Need "+ (this.getTarget() - this.getCurrentScore()) + "runs in "+ balls);
		System.out.println("Require Runrate:"+ reqRunrate);
	}

}
