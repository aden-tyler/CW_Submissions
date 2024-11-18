import java.util.Scanner;


public class Wordle {
	
	static String solution = new String ("basic");
	static Scanner inputAnswer = new Scanner(System.in);
	static String playersGuess;
	public static void main(String[] args) {
		
		
		//run the game
		playDaGame();


	}
	/**
	 * Runs the game, idk I got to decide how to comment so yeah it runs the game.
	 */
	private static void playDaGame()
	{
		//determine what the answer should be, coder gets to decide this LOWERCASE ONLY	
		System.out.println("Welcome to WORDLE! Please make a guess, all lowercase and no repeating letters :)");
		// allow user to give input
		playersGuess = new String (inputAnswer.nextLine().toLowerCase());
		//checks to see if it matches the solution
		compareToSoln();
		//If it does, then they get a cookie.
		System.out.println("Wow good job you won whatever here have a cookie 🍪");
		//Closes the Scanner once the solution is found.
		inputAnswer.close();
	}
	/**
	 * This method checks whether or not the user's input equals the solution.
	 */
	private static void compareToSoln()

	{
		// Checks if the input is not 5 characters, and has repeating letters.
		if (playersGuess.length() != 5 || hasRep(playersGuess))
		{
			System.out.println ("That doesn't work, yk cuz like I told you no repeating letters and all lower case? Try again.");
			playersGuess = inputAnswer.nextLine().toLowerCase();
			compareToSoln();
		}
		//If the input doesn't match, runs this.
		else if (!solution.equals(playersGuess))
		{
			//Prints out clues based on user input
			for (int length = 0; length < 5; length++)
			{
				//Prints a / if the word isn't in the solution
				if (solution.indexOf(playersGuess.charAt(length)) < 0)
				{
					System.out.print("/");
				}
				//Prints the character if they match.
				else if (playersGuess.charAt(length) == solution.charAt(length))
				{
					System.out.print(playersGuess.charAt(length));
				}
				//Prints a question mark if the character is in the word but not at the position guessed.
				else
				{
					System.out.print("?");
				}
			}
			// Lets the user know they're a failure and should try again.
			System.out.print(" WRONG! Try again doodoo");
		playersGuess = inputAnswer.nextLine().toLowerCase();
		
		compareToSoln();
		}
		
	}
	/**This boolean method
	 * Checks if there's a repetition in the input.
	 * @param input
	 * @return
	 */
	private static boolean hasRep(String input)
	{
		//Examines the given input
		for (int check1 = 0; check1 < input.length(); check1++)
		{
			//Examines the given input again
			for(int check2 = check1; check2 < input.length(); check2++)
			{
				//
				if (check1 == check2)
				{
					continue;
				}
				//Returns true if the examined characters match any of the other characters.
				else if (input.charAt(check1) == input.charAt(check2))
				{
					return true;
				}
			}
			
		}
		
		return false;
	}




}
