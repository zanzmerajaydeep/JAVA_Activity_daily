package Match;

abstract public class Match {
	
	private int currentScore;
	private float currentOver;
	private int target;
	
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	public Match() {
		// TODO Auto-generated constructor stub
	}
	
	abstract public float calculateRunRate();
	abstract public int calculateBalls();
	abstract public void display(double reqRunrate, int balls);
	
	

}
