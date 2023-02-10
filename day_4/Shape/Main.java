package shape;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Circle");
	        System.out.println("Square");
	        System.out.println("Enter the shape ");
	        String shape = sc.next();
	       
	        if ((!shape.equals("circle")) && (!shape.equals("square"))) {
	            System.out.println("Invalid input");
	            return;
	        }

	        switch (shape) {
	            case "circle":
	                Circle circle = new Circle();
	                System.out.println("Enter raidius of circle");
	                int radius = sc.nextInt();
	                if (radius < 0) {
	                    System.out.println("Invalid radius");
	                    return;
	                }
	                double circleArea = circle.calculateArea(radius);
	                System.out.println("The area of Circle is " + (double)Math.round(circleArea*100)/100);
	                break;
	            case "square":
	                Square square=new Square();
	                System.out.println("Enter length of square");
	                int length = sc.nextInt();
	                if (length < 0) {
	                    System.out.println("Invalid length");
	                    return;
	                }
	                double squareArea = square.calculateArea(length);
	                System.out.println("The area of square is " + (double)Math.round(squareArea*100)/100);
	                break;
	        }

	}

}
