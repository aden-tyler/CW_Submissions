import java.util.Scanner;

// This class sets up the values and classes that will be used in the main method.
class Circle 
{
	//Stores the radius of the circle.
	double radius;
	//constructor.
	public Circle (double r)
	{
		this.radius = r;
	}
	//adds a value to the radius.
	public void addToRadius(double r)
	{
		this.radius += r;
	}
	//grabs the radius.
	public double getRadius()
	{
		return radius;
	}
}


public class shapeForLoopPractice {
   
	public static void main(String[] args) {
    	
		Scanner userInput = new Scanner(System.in);
		//Gives the circle an original number (3.0).
		Circle circOne = new Circle (3.0);
    	//Gives us the original number for later comparison.
    	double originalNumber = circOne.getRadius();
    	
        //This for loop prompts the user five times.
    	for (int i = 0; i <= 5; i++)
        {
        	System.out.println("Enter a double value for iteration # " + i + ": ");
        	//This while loop will validate input is a double.
        	while (!userInput.hasNextDouble()) { 
                System.out.println("Invalid input. Please enter a valid double value.");
                // Makes the user enter a valid input.
                userInput.next();        
        }
        	double uInput = userInput.nextDouble();
        	//Adds the input to the attribute of the Circle.
        	circOne.addToRadius(uInput);
    }
    //Prints out the original radius and the final radius.	
    System.out.println("Your original radius was " + originalNumber + ".");
    System.out.println("Your final attribute value is " + circOne.radius);
 // Closes the scanner.
    userInput.close(); 
    }
}
