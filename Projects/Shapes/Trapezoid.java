/**
 * This class establishes the variables of a Trapezoid
 */
public class Trapezoid {
	//data attributes
	private double sidea;
	private double sideb;
	private double sidec;
	private double sided;
	private double height;
	/**
	 * This class converts the private doubles to ones that can be accessed in the main class
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param h
	 */
	public Trapezoid (double a, double b, double c, double d, double h)
	{
		sidea = a;
		sideb = b;
		sidec = c;
		sided = d;
		height = h;
	}
	/**
	 * This returns the word Trapezoid
	 * @return
	 */
	public static String getShape()
	{
		return "Trapezoid";
	}
	/**
	 * This returns the length of Side A
	 * @return
	 */
	public double getSideA()
	{
		return sidea;
	}
	/**
	 * This returns the length of Side B
	 * @return
	 */
	public double getSideB()
	{
		return sideb;
	}
	/**
	 * This returns the length of Side C
	 * @return
	 */
	public double getSideC()
	{
		return sidec;
	}
	/**
	 * This returns the length of Side D
	 * @return
	 */
	public double getSideD()
	{
		return sided;
	}
	/**
	 * This returns the height of a trapezoid
	 * @return
	 */
	public double getHeight()
	{
		return height;
	}
	/**
	 * This returns the area of a trapezoid
	 * @return
	 */
	public double getArea() 
	{
		return ((sidea+sideb)/2)*height;
	}
	/**
	 * This returns the perimeter of a trapezoid
	 * @return
	 */
	public double getPerimeter()
	{
		return sidea+sideb+sidec+sided;
	}

}
