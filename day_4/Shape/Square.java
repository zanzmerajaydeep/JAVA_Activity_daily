package shape;

public class Square extends Shape {
	
	 public double calculateArea(int value)
	    {
	        super.setValue(value);
	        return (this.getValue()*this.getValue());
	    }

}
