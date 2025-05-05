
public class Maze {
	/* class attibutes */
	private gameTile[][] maze; // board
	
	/**
	 * CONSTRUCTOR
	 * @param maze
	 */
	public Maze(char[][] board, Player player)
	{
		this.maze = fillMaze(player, board);
	}

	/**
	 * GETTER
	 * @return the maze
	 */
	public gameTile[][] getMaze()
	{
		return maze;
	}

	/**
	 * SETTER
	 * @param maze
	 */
	public void setMaze(gameTile[][] maze)
	{
		this.maze = maze;
	}
	
	/**
	 * PRINT
	 */
	public void printMaze()
	{
		// prints each element one by one row by row and surrounds it in brackets
		for (gameTile[] row : maze)
		{
			System.out.print("[");
			for (gameTile tile : row)
			{
				System.out.print(tile);
			}
			System.out.println("]");
		}
	}
	
	/**
	 * fills the 2D Tile array with Tile objects to generate walls and path
	 * @param player
  	 * @param board
	 * @return the updated 2D Tile array
	 */
	public gameTile[][] fillMaze(Player player, char[][] board)
	{
		maze = new gameTile[board.length][board[0].length];
		
		// goes row by row
		for (int i = 0; i < maze.length; i++)
		{
			for (int j = 0; j < maze[i].length; j++)
			{
				if (board[i][j] == ' ')
				{
					maze[i][j] = new gameTile(false, false, null);
				}
				if (board[i][j] == '|')
				{
					maze[i][j] = new gameTile(true, false, null);
				}
				if (board[i][j] == '8')
				{
					maze[i][j] = new gameTile(false, false, player);
				}
			}
		}
		printMaze();
		
		return maze;
	}
}
