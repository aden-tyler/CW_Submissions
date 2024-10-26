import java.util.Scanner;
public class mainGameShow {
	static Scanner inputAnswer = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Monty Hall Show! Please select a door from 1 - 3");
		System.out.println("(1)    (2)    (3)");
		
		//String myInput = new String (inputAnswer.next());
		int winDoor = pickWinningDoor();
		int selectedDoor = firstDoor();
		int wrongDoor = revealRandomDoor(winDoor, selectedDoor);
		int lastDoor = revealRemainingDoor(wrongDoor, selectedDoor);
		
		  
		System.out.println("You've selected " + selectedDoor + "." + "The door " + wrongDoor + " was wrong, would you like to switch doors or stay with the one you've selected?");
		switchOrNah(winDoor, selectedDoor, lastDoor);
		
		
		
		System.out.println("The winning door was " + winDoor);
		inputAnswer.close();
	}
	public static int pickWinningDoor()
	{
		return ((int)(Math.random()*3)+1);
	}
	
	
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
		System.out.println ("That doesn't work, and as a result we had to kick a dog off a cliff. Good job.");
		return -1;
		}
		//scanner.close();
		//return firstDoor();
	}
	
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
				System.out.println("YOU LOSE LOL");
			}
		}
		else if (input.equals("no"))
		{
			if (selectedDoor == winDoor)
			{
				System.out.println ("you win ig");
			}
			else 
			{
				System.out.println("You lose lmao");
			}
		}
		else
		{
			System.out.println("That's not what I wanted.");
			switchOrNah(winDoor, selectedDoor, remainingDoor);
		}
	}




	
	
	
	
	
	


}

