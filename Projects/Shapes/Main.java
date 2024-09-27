/** This class is the main, where all the final data of the shapes are computed and printed **/
public class Main {

	public static void main(String[] args) {
	
	
		//Accesses the Circle class, and creates new Circles, and gives them values that can be used to compute further data.
		Circle circOne = new Circle (3.0);
		Circle circTwo = new Circle (20.0);
		Circle circThree = new Circle (-4.0);
		String circShape = Circle.getShape();
		System.out.println(circShape);
		//Prints the radius, diameter, circumference, and area of three circles with different radius.	
		System.out.println("Radius of Circle One is " + circOne.getRadius());
		System.out.println("Diameter of Circle One is " + circOne.getDiameter());
		System.out.println("Circumference of Circle One is " + circOne.getCircumference());
		System.out.println("Area of Circle One is " + circOne.getArea());
		System.out.println(" ");
		
		System.out.println("Radius of Circle Three is " + circThree.getRadius());
		System.out.println("Diameter of Circle Three is " + circThree.getDiameter());
		System.out.println("Circumference of Circle Three is " + circThree.getCircumference());
		System.out.println("Area of Circle Three is " + circThree.getArea());
		System.out.println(" ");
		
		System.out.println("Area of Circle Two is " + circTwo.getArea());		
		System.out.println("Diameter of Circle Two is " + circTwo.getDiameter());
		System.out.println("Circumference of Circle Two is " + circTwo.getCircumference());
		System.out.println("Area of Circle Two is " + circTwo.getArea());
		System.out.println(" ");
		
		System.out.print(circOne.toString());
		//Accesses the Rectangle class, and creates new Rectangles, and gives them values that can be used to compute further data.
		Rectangle recOne = new Rectangle (3.0, 4.0);
		Rectangle recTwo = new Rectangle (8.0, 13.0);
		Rectangle recThree = new Rectangle (2.0, 4.0);
		String recShape = Rectangle.getShape();
		System.out.println(recShape);
		//Prints the length, width, area, and perimeter of three rectangles with different side lengths.
		System.out.println("Length of Rectangle One is " + recOne.getLength());
		System.out.println("Width of Rectangle One is " + recOne.getWidth());
		System.out.println("Area of Rectangle One is " + recOne.getArea());
		System.out.println("Perimeter of Rectangle One is " + recOne.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of Rectangle Two is " + recTwo.getLength());
		System.out.println("Width of Rectangle Two is " + recTwo.getLength());
		System.out.println("Area of Rectangle Two is " + recTwo.getArea());
		System.out.println("Perimeter of Rectangle Two is " + recTwo.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of Rectangle Three is " + recThree.getLength());
		System.out.println("Width of Rectangle Three is " + recThree.getWidth());
		System.out.println("Area of Rectangle Three is " + recThree.getArea());
		System.out.println("Perimeter of Rectangle Three is " + recThree.getPerimeter());
		System.out.println(" ");
	
		//Creates new Squares, and gives them values that can be used to compute further data.
		Square sqOne = new Square (4.0);
		Square sqTwo = new Square (13.0);
		Square sqThree = new Square (5.0);
		String sqShape = Square.getShape();
		System.out.println(sqShape);
		//Prints the length of a side, area, and perimeter of three squares with different lengths.		
		System.out.println("Length of sides of Square One is " + sqOne.getSides());
		System.out.println("Area of Square One is " + sqOne.getArea());
		System.out.println("Perimeter of Square One is " + sqOne.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of sides of Square Two is " + sqTwo.getSides());
		System.out.println("Area of Square Two is " + sqTwo.getArea());
		System.out.println("Perimeter of Square Two is " + sqTwo.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of sides of Square Three is " + sqThree.getSides());
		System.out.println("Area of Square Three is " + sqThree.getArea());
		System.out.println("Perimeter of Square Three is " + sqThree.getPerimeter());
		System.out.println(" ");
	
		//Accesses the Trapezoid class, and creates new Trapezoids, and gives them values that can be used to compute further data.
		Trapezoid trapOne = new Trapezoid (1.0, 1.0, 2.0, 4.0, 3.0);
		Trapezoid trapTwo = new Trapezoid (4.0, 2.0, 9.0, 10.0, 3.0);
		Trapezoid trapThree = new Trapezoid (3.0, 7.0, 7.0, 6.0, 4.0);
		String trapShape = Trapezoid.getShape();
		System.out.println(trapShape);
		//Prints the length of sides A, B, C, D, height, area, and perimeter of three trapezoids with different lengths.
		System.out.println("Length of Side A is " + trapOne.getSideA());
		System.out.println("Length of Side B is " + trapOne.getSideB());
		System.out.println("Length of Side C is " + trapOne.getSideC());
		System.out.println("Length of Side D is " + trapOne.getSideD());
		System.out.println("Height of Trapezoid One is " + trapOne.getHeight());
		System.out.println("Area of Trapezoid One is " + trapOne.getArea());
		System.out.println("Perimeter of Trapezoid One is " + trapOne.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of Side A is " + trapTwo.getSideA());
		System.out.println("Length of Side B is " + trapTwo.getSideB());
		System.out.println("Length of Side C is " + trapTwo.getSideC());
		System.out.println("Length of Side D is " + trapTwo.getSideD());
		System.out.println("Height of Trapezoid Two is " + trapTwo.getHeight());
		System.out.println("Area of Trapezoid Two is " + trapTwo.getArea());
		System.out.println("Perimeter of Trapezoid Two is " + trapTwo.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of Side A is " + trapThree.getSideA());
		System.out.println("Length of Side B is " + trapThree.getSideB());
		System.out.println("Length of Side C is " + trapThree.getSideC());
		System.out.println("Length of Side D is " + trapThree.getSideD());
		System.out.println("Height of Trapezoid Three is " + trapThree.getHeight());
		System.out.println("Area of Trapezoid Three is " + trapThree.getArea());
		System.out.println("Perimeter of Trapezoid Three is " + trapThree.getPerimeter());
		System.out.println(" ");
	
		//Accesses the Parallelogram class, and creates new Parallelograms, and gives them values that can be used to compute further data.
		Parallelogram paraOne = new Parallelogram (3.0, 6.0, 1.0);
		Parallelogram paraTwo = new Parallelogram (2.0, 5.0, 9.0);
		Parallelogram paraThree = new Parallelogram (3.0, 6.0, 1.0);
		String paraShape = Parallelogram.getShape();
		System.out.println(paraShape);
		//Prints the length of the side, base, height, area, and perimeter of three parallelograms with different values.		
		System.out.println("Length of side of Parallelogram One is " + paraOne.getSide());
		System.out.println("Length of base of Parallelogram One is " + paraOne.getBase());
		System.out.println("Height of Parallelogram One is " + paraOne.getHeight());
		System.out.println("Area of Parallelogram One is " + paraOne.getArea());
		System.out.println("Perimeter of Parallelogram One is " + paraOne.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of side of Parallelogram Two is " + paraTwo.getSide());
		System.out.println("Length of base of Parallelogram Two is " + paraTwo.getBase());
		System.out.println("Height of Parallelogram Two is " + paraTwo.getHeight());
		System.out.println("Area of Parallelogram Two is " + paraTwo.getArea());
		System.out.println("Perimeter of Parallelogram Two is " + paraTwo.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of side of Parallelogram Three is " + paraThree.getSide());
		System.out.println("Length of base of Parallelogram Three is " + paraThree.getBase());
		System.out.println("Height of Parallelogram Three is " + paraThree.getHeight());
		System.out.println("Area of Parallelogram Three is " + paraThree.getArea());
		System.out.println("Perimeter of Parallelogram Three is " + paraThree.getPerimeter());
		System.out.println(" ");
	
		//Accesses the Rhombus class, and creates new Rhombus's, and gives them values that can be used to compute further data.
		Rhombus rhomOne = new Rhombus (2.0, 4.0, 3.0);
		Rhombus rhomTwo = new Rhombus (1.0, 5.0, 2.0);
		Rhombus rhomThree = new Rhombus (5.0, 8.0, 1.0);
		String rhomShape = Rhombus.getShape();
		System.out.println(rhomShape);
		//Prints diagonal one and two, side, area, and perimeter of three rhombus' with different values.		
		System.out.println("Length of diagonal one of Rhombus One is " + rhomOne.getDiagonalOne());
		System.out.println("Length of diagonal two of Rhombus One is " + rhomOne.getDiagonalTwo());
		System.out.println("Length of side of Rhombus One is " + rhomOne.getSide());
		System.out.println("Area of Rhombus One is " + rhomOne.getArea());
		System.out.println("Perimeter of Rhombus One is " + rhomOne.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of diagonal one of Rhombus Two is " + rhomTwo.getDiagonalOne());
		System.out.println("Length of diagonal two of Rhombus Two is " + rhomTwo.getDiagonalTwo());
		System.out.println("Length of side of Rhombus Two is " + rhomOne.getSide());
		System.out.println("Area of Rhombus Two is " + rhomTwo.getArea());
		System.out.println("Perimeter of Rhombus Two is " + rhomTwo.getPerimeter());
		System.out.println(" ");
		
		System.out.println("Length of diagonal one of Rhombus Three is " + rhomThree.getDiagonalOne());
		System.out.println("Length of diagonal two of Rhombus Three is " + rhomThree.getDiagonalTwo());
		System.out.println("Length of side of Rhombus Three is " + rhomThree.getSide());
		System.out.println("Area of Rhombus Three is " + rhomThree.getArea());
		System.out.println("Perimeter of Rhombus Three is " + rhomThree.getPerimeter());
		System.out.println(" ");
	}
	
	
}
