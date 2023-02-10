package shape;

public  abstract class Shape {
	
	 private int value;
	    

	    public Shape()
	    {

	    }

	    abstract public double calculateArea(int value);

	    public void setValue(int value)
	    {
	        this.value=value;
	    }
	    public int getValue()
	    {
	        return this.value;
	    }

}
