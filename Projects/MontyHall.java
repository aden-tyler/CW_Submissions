import java.util.Scanner;
public class mainGameShow {
	static Scanner inputAnswer = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Monty Hall Show! Please select a door from 1 - 3");
		System.out.println("(1)    (2)    (3)");
		
		// This declares the int variables that allows values from methods to be stored
		int winDoor = pickWinningDoor();
		int selectedDoor = firstDoor();
		int wrongDoor = revealRandomDoor(winDoor, selectedDoor);
		int lastDoor = revealRemainingDoor(wrongDoor, selectedDoor);
		
		// Tells the user what door is wrong, and the selected door, and prompts them to switch.
		System.out.println("You've selected " + selectedDoor + ". " + "The door " + 
							wrongDoor + " was wrong, would you like to switch doors?");
		switchOrNah(winDoor, selectedDoor, lastDoor);
		
		
		// Tells user the correct door, and whether or not they won.
		System.out.println("The winning door was " + winDoor);
		inputAnswer.close();
	}
	/** Randomizes the winning door
	 * @return
	 */
	public static int pickWinningDoor()
	{
		return ((int)(Math.random()*3)+1);
	}
	
	/**Allows you to pick a door, and if you put in an invalid input it lets you know it doesn't work, and to try again.
	 * @return
	 */
	public static int firstDoor()
	{
		
		String myInput = new String (inputAnswer.next());
		//scanner here
		//string for scanner here
		if (myInput.equals("1") || myInput.equals("one"))
		{
			return 1;
		}
		else if (myInput.equals("2") || myInput.equals("two"))
		{
			return 2;
		}
		else if (myInput.equals("3") || myInput.equals("three"))
		{
			return 3;
		}
		else 
		{
		System.out.println ("That doesn't work, and as a result we had to kick a dog off a cliff."
							+ " Try again doodoohead");
		return firstDoor();
		}
	}
	/**
	 * Reveals a random door that is incorrect, making sure it doesn't reveal the win door or the selected door.
	 * @param winDoor
	 * @param selectedDoor
	 * @return
	 */
	public static int revealRandomDoor(int winDoor, int selectedDoor)
	{
		
		
		
		int randomNumber = ((int)(Math.random()*3)+1);
		if (randomNumber == winDoor || randomNumber == selectedDoor)
		{
			return revealRandomDoor(winDoor, selectedDoor);
		}
		else
		{
			return randomNumber;
		}
	}
	/**
	 * This method reveals the door remaining, whether the participant chose to switch or not.
	 * @param randomDoor
	 * @param selectedDoor
	 * @return
	 */
	public static int revealRemainingDoor(int randomDoor, int selectedDoor)
	{
		int randomNumber = ((int)(Math.random()*3)+1);
		if (randomNumber == randomDoor || randomNumber == selectedDoor)
		{
			return revealRandomDoor(randomDoor, selectedDoor);
		}
		else
		{
			return randomNumber;
		}
	}
               
	/**
	 * This method lets the participant choose whether to switch the door or not, and then reveals
	 * whether you were correct or not, using the remaining door and win door methods.3
	 *
	 * @param winDoor
	 * @param selectedDoor
	 * @param remainingDoor
	 */
	public static void switchOrNah(int winDoor, int selectedDoor, int remainingDoor)
	{
		String input = new String(inputAnswer.next());
		if (input.equals("yes")) 
		{
			if (remainingDoor == winDoor)
			{
				System.out.println( "YOU WINNNNN");
			}
			else 
			{
				System.out.println("YOU LOOSE YOU LSOER");
			}
		}
		else if (input.equals("no"))
		{
			if (selectedDoor == winDoor)
			{
				System.out.println ("you win. b***h");
			}
			else 
			{
				System.out.println("You lose. loser");
			}
		}
		else
		{
			System.out.println("That's not what I wanted.");
			switchOrNah(winDoor, selectedDoor, remainingDoor);
		}
	}




	
	
	
	
	
