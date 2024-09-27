/**
 * This class establishes the variables of a Square
 */
public class Square {
	//data attributes
	private double sides;
	/**
	 * This method converts the private double to a double that can be accessed in the main class
	 * @param s
	 */
	public Square (double s)
	{
		sides = s;
	}
	/** 
	 * This method returns the word Square
	 * @return
	 */
	public static String getShape()
	{
		return "Square";
	}
	/**
	 * This method returns the length of the sides of a square
	 * @return
	 */
	public double getSides()
	{
		return sides;
	}
	/**
	 * This method returns the area of a square
	 * @return
	 */
	public double getArea()
	{
		return sides*sides;
	}
	/**
	 * This method returns the perimeter of a square
	 * @return
	 */
	public double getPerimeter()
	{
		return sides*4;
	}

}
