/**
 * This class establishes the variables of a Circle
 */
public class Circle {
	//data attributes
	private final double pi = 3.1415;
	private double radius;
	//constructor
	public Circle (double r)
	{
		radius = r;
	}
	public void setRadius(double r)
	{
		this.radius = r;
	}
	public double getPi() {
		return pi;
	}
	/** 
	 * This method returns the word circle
	 * @return
	 */
	public static String getShape()
	{
		return "Circle ";	
	}
	/** 
	 * This method returns the radius of a circle
	 * @return
	 */
	public double getRadius()
	{
		return radius;
	}
	/** 
	 * This method returns the diameter of a circle
	 * @return
	 */
	public double getDiameter() 
	{
		return radius*2;
	}
	/** 
	 * This method returns the circumference of a circle
	 * @return
	 */
	public double getCircumference() 
	{
		return 2*pi*radius;
	}
	/**
	 * This method returns the area of a circle
	 * @return
	 */
	public double getArea()
	{
		return pi*radius*radius;
	}
	/** 
	 * This turns everything about the circle object into a String
	 * (aka. it turns what was a 5 hour project into a 1 hour project )
	 */
	public String toString()
	{
		return "This is a circle with radius" + radius + "and an area of " + getArea() + "and a circumference of " + getCircumference() + ".";
	}
}
