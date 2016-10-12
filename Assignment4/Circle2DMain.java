/* 
 * IS 147 
 * 
 * Unit #4 – Programming Assignment 
 * 
 * Student Name: Zhengchao Yu  
 * 
 * Date: 12/10/2015 
 * 
 * This program creates a point inside the circle. 
 * Then creates a circle inside another circle. 
 * And another circle overlaps another circle.  
 */

public class Circle2DMain {
    
    public static void main(String[] args) {
	
	// -- Create c1, c2, c3 Circle2D objects
	Circle2D c1 = new Circle2D(2, 2, 5.5, "YELLOW");
	Circle2D c2 = new Circle2D(4, 5, 10.5, "BLUE");
	Circle2D c3 = new Circle2D(3, 5, 2.3, "BLUE");
	
	System.out.println(c1.color + " circle, c1's Area is " + c1.getArea());
	System.out.println(c1.color + " circle, c1's Perimeter is " + c1.getPerimeter());
	System.out.println(c1.color + " circle, c1 contains(3,3) where x=3 and y=3: " + c1.contains(3, 3));
	
	System.out.println(c1.color + " circle, c1 contains blue circle, c2: "+ c1.contains(c2));
	System.out.println(c1.color + " circle, c1 overlap blue circle, c3: "+ c1.overlaps(c3));
	
    }
    
}
