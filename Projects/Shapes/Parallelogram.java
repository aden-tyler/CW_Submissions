/**
 * This class establishes the variables of a Parallelogram
 */
public class Parallelogram {
	//data attributes
	private double side;
	private double base;
	private double height;
	/**
	 * This method converts the private doubles to doubles that can be accessed in the main class.
	 * @param s
	 * @param b
	 * @param h
	 */
	public Parallelogram (double s, double b, double h)
	{
		side = s;
		base = b;
		height = h;
	}
	/**
	 * This method returns the word Parallelogram
	 * @return
	 */
	public static String getShape()
	{
		return "Parallelogram";
	}
	/**
	 * This method returns the length of a parallelograms side
	 */
	public double getSide()
	{
		return side;
	}
	/**
	 * This method returns the length of a base of a parallelogram
	 * @return
	 */
	public double getBase()
	{
		return base;
	}
	/**
	 * This method returns the height of a parallelogram
	 * @return
	 */
	public double getHeight()
	{
		return height;
	}
	/**
	 * This method returns the area of a parallelogram
	 * @return
	 */
	public double getArea()
	{
		return height*base;
	}
	/**
	 * This method returns the perimeter of a parallelogram
	 * @return
	 */
	public double getPerimeter()
	{
		return 2*(base+side);
	}
}
