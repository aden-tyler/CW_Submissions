/**
 * This class establishes the variables of a Rhombus
 */
public class Rhombus {
	//data attributes
	private double diagonalone;
	private double diagonaltwo;
	private double side;
	/**
	 * This method converts the private doubles to doubles that can be accessed in the main class
	 * @param o
	 * @param t
	 * @param s
	 */
	public Rhombus (double o, double t, double s)
	{
		diagonalone = o;
		diagonaltwo = t;
		side = s;
	}
	/**
	 * This method returns the word Rhombus
	 * @return
	 */
	public static String getShape()
	{
		return "Rhombus";
	}
	/**
	 * This method returns the length of Diagonal One
	 * @return
	 */
	public double getDiagonalOne()
	{
		return diagonalone;
	}
	/**
	 * This method returns the length of Diagonal Two
	 * @return
	 */
	public double getDiagonalTwo()
	{
		return diagonaltwo;
	}
	/**
	 * This method returns the length of a side of a Rhombus
	 * @return
	 */
	public double getSide()
	{
		return side;
	}
	/**
	 * This method returns the area of a rhombus
	 * @return
	 */
	public double getArea()
	{
		return (diagonalone*diagonaltwo)/2;
	}
	/**
	 * This method returns the perimeter of a rhombus
	 * @return
	 */
	public double getPerimeter()
	{
		return 4*side;
	}


}
