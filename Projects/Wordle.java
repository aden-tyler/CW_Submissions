import java.util.Scanner;


public class Wordle {
	
	static String soln = new String ("basic");
	static Scanner inputAnswer = new Scanner(System.in);
	static String playersGuess;
	public static void main(String[] args) {
		
		//determine what the answer should be, coder gets to decide this LOWERCASE ONLY	
		//run the game
		playDaGame();


	}
	
	private static void playDaGame()
	{
		System.out.println("Welcome to WORDLE! Please make a guess, all lowercase and no repeating letters :)");
		
		playersGuess = new String (inputAnswer.nextLine().toLowerCase());
		
		didTheyWin();
		
		System.out.println("Wow good job you won whatever here have a cookie 🍪");
		
		inputAnswer.close();
	}
	
	private static void didTheyWin()

	{
		
		if (playersGuess.length() != 5 || hasRep(playersGuess))
		{
			System.out.println ("That doesn't work, yk cuz like I told you no repeating letters and all lower case? Try again.");
			playersGuess = inputAnswer.nextLine().toLowerCase();
			didTheyWin();
		}
		else if (!soln.equals(playersGuess))
		{
			for (int length = 0; length < 5; length++)
			{
				if (soln.indexOf(playersGuess.charAt(length)) < 0)
				{
					System.out.print("/");
				}
				else if (playersGuess.charAt(length) == soln.charAt(length))
				{
					System.out.print(playersGuess.charAt(length));
				}
				else
				{
					System.out.print("?");
				}
			}
		System.out.println(" WRONG! Try again doodoo");
		playersGuess = inputAnswer.nextLine().toLowerCase();
		}
		
	}
	private static boolean hasRep(String input)
	{
		for (int length = 0; length < input.length(); length++)
		{
			for(int j = length; j < input.length(); j++)
			{
				if (length == j)
				{
					continue;
				}
				else if (input.charAt(length) == input.charAt(j))
				{
					return true;
				}
			}
			
		}
		
		return false;
	}




}
