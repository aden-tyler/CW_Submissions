/**
 * This class establishes the variables of a Rectangle
 */
public class Rectangle {
	//data attributes
	private double length;
	private double width;
	/**
	 * This method sets the private doubles equal to doubles that can be used in the main class
	 * @param L
	 * @param W
	 */
	public Rectangle (double L, double W) 
	{
		length = L;
		width = W;
	}
	/**
	 * This method does the same thing as the one above me, but with ints
	 * @param l
	 * @param w
	 */
	public Rectangle (int l, int w)
	{
		length = l;
		width = w;
	}
	/**
	 * This method overloads the method, enabling it to show square stats as well.
	 * @param s
	 */
	public Rectangle (int s)
	{
		length = s;
		width = s;
	}
	/**
	 * This method returns the word Rectangle
	 * @return
	 */
	public static String getShape()
	{
		return "Rectangle";
	}
	/**
	 * This method returns the length of a rectangle
	 * @return
	 */
	public double getLength() 
	{
		return length;
	}
	/**
	 * This method returns the width of a rectangle
	 * @return
	 */
	public double getWidth()
	{
		return width;
	}
	/**
	 * This method returns the perimeter of a rectangle
	 * @return
	 */
	public double getPerimeter()
	{
		return 2*(length+width);
	}
	/**
	 * This method returns the area of a rectangle
	 * @return
	 */
	public double getArea()
	{
		return length*width;
	}
}
