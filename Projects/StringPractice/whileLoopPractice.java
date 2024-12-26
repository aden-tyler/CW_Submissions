import java.util.Scanner;

public class whileLoopPractice {
    /**
     * This is the main method that the code runs in.
     * @param args
     */
	public static void main(String[] args) {
        //Gives the scanner a name.
		Scanner nameInput = new Scanner(System.in);
		//The counter for the loop iterations.
		int count = 0; 
        //This boolean will check if the person has typed "stop" or not.
		boolean continueLoop = true;
		/**
		 * This while loop will continue as long as the user hasn't typed "stop".
		 */
        while (continueLoop) {
            System.out.print("Hi! Enter something you wanna say, and if you wanna stop, type stop: ");
            //This string reads the user input.
            String userInput = nameInput.nextLine(); 
            
            // This if statement will check if the user input "stop". 
            if (userInput.equalsIgnoreCase("stop")) 
            {
            	// This sets the boolean to false, stopping the loop.
            	continueLoop = false;  
                System.out.println("You stopped the iteration on loop " + count + ".");        
            } else {
               
            	// Adds 1 for each iteration of the loop.
            	count++; 
                System.out.println("You entered: " + userInput);
                System.out.println("loop iteration #" + count);
            }
        }
        // Closes the scanner.
        nameInput.close();
    }
}
