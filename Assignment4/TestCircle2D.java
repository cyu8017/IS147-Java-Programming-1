/* 
 * IS 147 
 * 
 * Unit #4 - Programming Assignment 
 * 
 * Zhengchao Yu 
 * 
 * 11/17/2015
 * 
 * This program conducts unit-testing for all the methods that are required in 
 * Circle2D program assignment. 
 * 
 * NOTE: Unit testing is a software development process in which the smallest 
 * testable parts of an application, called units, are individually and
 * independently scrutinized for proper operation. 
 */

public class TestCircle2D {
    
    public static void main(String[] args) 
    {
	// -- Create c1, c2, c3 Circle2D objects
	Circle2D c1 = new Circle2D(2, 2, 5.5, "YELLOW");
	Circle2D c2 = new Circle2D(4, 5, 10.5, "BLUE");
	Circle2D c3 = new Circle2D(3, 5, 2.3, "BLUE");
	
	// -- Test case for the circle with Circle2D(2, 2, 5.5, "YELLOW");
	System.out.println("Test result for c1's getArea() method is " +
			   (c1.getArea() == 95.03317777109125 ? "Passed" : "Failed"));
	System.out.println("Test result for c1's getPerimeter() method is " +
			   (c1.getPerimeter() == 34.55751918948772 ? "Passed" : "Failed"));
	System.out.println("Test result for c1's contains() method with (3, 3) " +
			   "where x=3 and y=3 is " + 
			   (c1.contains(3, 3) == true ? "Passed" : "Failed"));
	System.out.println("Test result for c1 contains c2 is " +
			   (c1.contains(c2) == false ? "Passed" : "Failed"));
	System.out.println("Test result for c1 contains c3 is " +
			   (c1.contains(c3) == true ? "Passed" : "Failed"));
	System.out.println("Test result for c1 overlaps c2 is " +
			   (c1.overlaps(c2) == true ? "Passed" : "Failed"));
	System.out.println("Test result for c1 overlaps c3 is " +
			   (c1.overlaps(c3) == true ? "Passed" : "Failed"));
	System.out.println("Test result for c1's getColor() method is " +
			   (c1.getColor().equals("YELLOW") ? "Passed" : "Failed"));
	
	// -- Test case for the circle with Circle2D(4, 5, 10.5, "BLUE");
	System.out.println("Test result for c2's getArea() method is " +
			   (c2.getArea() == 346.3605900582747 ? "Passed" : "Failed"));
	System.out.println("Test result for c2's getPerimeter() method is " +
			   (c2.getPerimeter() == 65.97344572538566 ? "Passed" : "Failed"));
	System.out.println("Test result for c2's contains() method with (2, 20) " +
			   "where x=2 and y=20 is " + 
			   (c2.contains(2, 20) == false ? "Passed" : "Failed"));
	System.out.println("Test result for c2 contains c1 is " +
			   (c2.contains(c1) == true ? "Passed" : "Failed"));
	System.out.println("Test result for c2 contains c3 is " +
			   (c2.contains(c3) == true ? "Passed" : "Failed"));
	System.out.println("Test result for c2 overlaps c1 is " +
			   (c2.overlaps(c1) == true ? "Passed" : "Failed"));
	System.out.println("Test result for c2 overlaps c3 is " +
			   (c2.overlaps(c3) == true ? "Passed" : "Failed"));
	System.out.println("Test result for c2's getColor() method is " +
			   (c2.getColor().equals("BLUE") ? "Passed" : "Failed"));
	
	// -- Test case for the Circle2D's distance() method
	System.out.println("Test result for Circle2D's distance() method is " +
			   (Circle2D.distance(2, 2, 4, 4) == 2.8284271247461903 ? 
			    "Passed" : "Failed"));
	
	// -- Test case for the main() method
	try {
	    Circle2DMain.main(null);
	    System.out.println("Test result for Circle2DMain's main() method is Passed");
	}
	catch(Exception ex) {
	    System.out.println("Test result for Circle2DMain's main() method is Failed");
	}
	
    }
    
}
