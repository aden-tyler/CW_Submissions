import java.util.Scanner;
public class InvisibleMazeGame {
	static Scanner myReader = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame();
	}
	static void playGame()
	{
		Scanner scanner = new Scanner(System.in); // input
		
		Player player = new Player(0,0); // player object
		Maze maze = new Maze(new char[][] {
			{'8', '|', '|', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
			{' ', '|', ' ', ' ', ' ', '|', '|', ' ', '|', '|'},
			{' ', ' ', ' ', '|', ' ', ' ', ' ', '|', ' ', '|'},
			{' ', '|', '|', ' ', ' ', '|', ' ', '|', ' ', '|'},
			{' ', '|', ' ', ' ', '|', ' ', ' ', ' ', ' ', ' '}}, player); // maze object with Tile map passed into it
		
		while (player.getY() != 4 || player.getX() != 9) // loops until player hit win
		{
			maze.printMaze();
		}
		System.out.println("YOU WIN!");
		
		scanner.close();
	}
	

}
