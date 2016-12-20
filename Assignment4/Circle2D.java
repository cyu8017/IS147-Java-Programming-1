/* 
 * IS 147 
 * 
 * Unit #4 – Programming Assignment 
 * 
 * Student Name: Zhengchao Yu  
 * 
 * Date: 12/10/2015 
 * 
 * This program creates a point inside the circle, 
 * a circle in another circle, 
 * and a circle overlaps another circle.   
 */

public class Circle2D {
    double currentX;
    double currentY;
    String color;
    double radius;
    
    // A no-arg constructor that creates a default circle with 
    //(0, 0) for (x, y) and 1 for radius and YELLOW for color.
    
    public Circle2D() {
	currentX = 0;
	currentY = 0;
	color = "Yellow";
	radius = 1;
    }
    
    // A constructor that creates a circle with the specified x, y, radius, and color
    public Circle2D(double x, double y, double newRadius, String newColor) {
	currentX = x;
	currentY = y;
	color = newColor;
	radius = newRadius;
    }
    
    // The following methods return x and y; 
    public double getX() {
	return currentX;
    }
    
    public double getY() {
	return currentY;
    }
    
    // This method returns the color of the circle in String.
    public String getColor() {
	return color;
    }
    
    // This methed returns the radius. 
    public double getRadius() {
	return radius;
    }
    
    // A method that returns the area of the circle. 
    public double getArea() {
	return (Math.PI * radius * radius);
    }
    
    // A method that returns the perimeter of the circle 
    public double getPerimeter() {
	return (Math.PI * 2 * radius);
    }
    
    // Returns true if the specified curcle is inside the circle 
    public boolean contains(double x, double y) {
	
	if(Math.pow((x - currentX),2) - Math.pow((y - currentY), 2) < Math.pow(radius,2)) {
	    return true;
	}
	
	return false;
    }
    
    // Returns true if the specified point (x, y) is inside this circle.
    public boolean contains(Circle2D circle) {
	if(distance(currentX, currentY, circle.currentX, circle.currentY) < Math.abs((radius - circle.radius)))
	    return true;
	
	return false;
	}
    
    // Overlaps Circle 2D circle that returns true if the specified circle overlaps with this circle. 
    public boolean overlaps(Circle2D circle) {
	
	if(distance(currentX, currentY, circle.currentX, circle.currentY) < (radius + circle.radius))
	    return true;
	
	return false;
    }
    
    // A Static method distance that returns the distance d between the points (x1, y1) and (x2, y2). 
    public static double distance(double x1, double y1, double x2, double y2) {
	
	return Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
    }
}
