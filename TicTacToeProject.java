import java.util.Scanner;
//This class allows Tic Tac Toe to be played through the use of 2D arrays.
public class TicTacToe {
	//These create variables that will be used later in order to run the game
	static Scanner myReader = new Scanner (System.in);
	static boolean playerWon = false;
	static String [][]grid = new String [3][3];
	static String one = "1";
	static String two = "2";
	static String three = "3";
	static String four = "4";
	static String five = "5";
	static String six = "6";
	static String seven = "7";
	static String eight = "8";
	static String nine = "9";
	
	static boolean on = false;
	static boolean tw = false;
	static boolean thr = false;
	static boolean fou = false;
	static boolean fiv = false;
	static boolean si = false;
	static boolean seve = false;
	static boolean eigh = false;
	static boolean nin = false;
	
	static int player1Counter = 0;
	static int player2Counter = 0;
	public static void main(String[] args) {
		// This is the introduction of the game
		System.out.println("Hi! Welcome to TicTacToe with 2D Arrays!");
		System.out.println("[1] [2] [3] \n[4] [5] [6] \n[7] [8] [9]");
		System.out.println("Player One will be X, while Player Two will be O.");
		System.out.println("To input where you'll place your piece, just put the number of where you want to place it.");
		//This runs the game, checking if either player has won after placing down their respective pieces.
		while (playerWon == false)
		{
			if(playerWon == false)
			{
				player1Input(grid);
				System.out.println("[" + one + "]" + "[" + two + "]" + "[" + three + "]" + "\n"
						+ "[" + four + "]"+ "[" + five + "]" + "[" +six + "]" + "\n" + "[" + seven + "]" + "[" + eight +"]" + "[" + nine + "]");
				player1Counter++;
			}
			if (player1Counter>=3)
			{
				checkWhoWon(grid);
			}
			if (playerWon == false)
			{
				player2Input(grid);
				System.out.println("[" + one + "]" + "[" + two + "]" + "[" + three + "]" + "\n"
						+ "[" + four + "]"+ "[" + five + "]" + "[" +six + "]" + "\n" + "[" + seven + "]" + "[" + eight +"]" + "[" + nine + "]");
				player2Counter++;
			}
			if (player2Counter >= 3)
			{
				checkWhoWon(grid);
			}
		}
	
	}
	/**
	 * This method is used to make player one input their commands.
	 * @param grid
	 * @return
	 */
	public static String player1Input(String[][]grid)
	{
		System.out.print("Player 1 please place your X. \n");
		String userInput = new String (myReader.next());
		String x = "X";
		//The following if statements help to show where the X is placed by the user.
		if (userInput.equals ("1") && on == false)
		{
				on = true;
				grid[0][0]=x;
				return one=grid[0][0];
		}
			else if (userInput.equals("2") && tw==false)
			{
				tw = true;
				grid[0][1]=x;
				return two=grid[0][1];
			}
			else if (userInput.equals("3") && thr ==false) 
			{
				thr = true;
				grid[0][2]=x;
				return three=grid[0][2];
			}
			else if (userInput.equals("4") && fou == false)
			{
				fou = true;
				grid[1][0]=x;
				return four=grid[1][0];
			}
			else if (userInput.equals("5") && fiv == false)
			{
				fiv = true;
				grid[1][1]=x;
				return five=grid[1][1];
			}
			else if (userInput.equals("6") && si == false)
			{
				si = true;
				grid[1][2]=x;
				return six=grid[1][2];
			}
			else if (userInput.equals("7") && seve == false)
			{
				seve = true;
				grid[2][0]=x;
				return seven=grid[2][0];
			}
			else if (userInput.equals("8") && eigh == false)
			{
				eigh = true;
				grid[2][1]=x;
				return eight=grid[2][1];
			}
			else if (userInput.equals("9") && nin == false)
			{
				nin = true;
				grid[2][2]=x;
				return nine=grid[2][2];
			}
			else
			{
				return "Invalid Input, Player 1 forfeits their turn";
			}
		}
	/**
	 * This method is used to help player 2 input their commands.
	 * @param grid
	 * @return
	 */
	public static String player2Input(String[][]grid)
	{
		System.out.print("Player 2 please place your O. \n");
		String userInput = new String (myReader.next());
		
		String o = "O";
		//The following if statements helpto show where the O is placed by the user.
		if (userInput.equals ("1") && on == false)
		{
				on = true;
				grid[0][0]=o;
				return one=grid[0][0];
		}
			else if (userInput.equals("2") && tw==false)
			{
				tw = true;
				grid[0][1]=o;
				return two=grid[0][1];
			}
			else if (userInput.equals("3") && thr ==false) 
			{
				thr = true;
				grid[0][2]=o;
				return three=grid[0][2];
			}
			else if (userInput.equals("4") && fou == false)
			{
				fou = true;
				grid[1][0]=o;
				return four=grid[1][0];
			}
			else if (userInput.equals("5") && fiv == false)
			{
				fiv = true;
				grid[1][1]=o;
				return five=grid[1][1];
			}
			else if (userInput.equals("6") && si == false)
			{
				si = true;
				grid[1][2]=o;
				return six=grid[1][2];
			}
			else if (userInput.equals("7") && seve == false)
			{
				seve = true;
				grid[2][0]=o;
				return seven=grid[2][0];
			}
			else if (userInput.equals("8") && eigh == false)
			{
				eigh = true;
				grid[2][1]=o;
				return eight=grid[2][1];
			}
			else if (userInput.equals("9") && nin == false)
			{
				nin = true;
				grid[2][2]=o;
				return nine=grid[2][2];
			}
			else
			{
				return "Invalid Input, Player 2 forfeits their turn";
			}	
	}
	/**
	 * This method checks who won, and displays a short line of text, while also changing the playerWon variable to true.
	 * @param grid
	 */
		public static void checkWhoWon(String [][] grid)
		{
			if (grid[0][0] == grid[0][1] && grid[0][1] == grid[0][2])
			{
				System.out.print("wow you win!");
				playerWon = true;;
			}
			else if (grid[1][0] == grid[1][1] && grid[1][1] == grid[1][2])
			{
				System.out.print("wow you win!");
				playerWon=true;
			}
			else if (grid[2][0] == grid[2][1] && grid[2][1] == grid[2][2])
			{
				System.out.print("wow you win!");
				playerWon=true;
			}
			else if (grid[0][0] == grid[1][0] && grid[1][0] == grid[2][0])
			{
				System.out.print("wow you win!");
				playerWon=true;
			}
			else if (grid[0][1] == grid[1][1] && grid[1][1] == grid[2][1])
			{
				System.out.print("wow you win!");
				playerWon=true;
			}
			else if (grid[0][2] == grid[1][2] && grid[1][2] == grid[2][2])
			{
				System.out.print("wow you win!");
				playerWon=true;
			}
			else if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2])
			{
				System.out.print("wow you win!");
				playerWon=true;
			}
			else if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0])
			{
				System.out.print("wow you win!");
				playerWon=true;
			}
			else
			{
				System.out.print("Draw");
			}
			
		}





}
