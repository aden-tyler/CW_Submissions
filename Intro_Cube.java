/* This code is designed to calculate the Surface Area and Volume of a cube, and
 * print out the results in a sentence. My name is Aden Tyler, I wrote this for 
 * my AP Comp Sci class on August 30th, 2024 at 1:00 PM. */
public class Intro_Cube {

	public static void main(String[] args) {


// Declare a side length as a double
		double side = 4.0;
		double surfacearea = (side*side*6.0);
		double volume = side*side*side;
//Calculate the surface area and volume
//Print its values as ints in a sentence
		System.out.println("The Surface Area of the cube is " + (int) surfacearea);
		System.out.print("The Volume of the cube is " + (int) volume);
	}

}
