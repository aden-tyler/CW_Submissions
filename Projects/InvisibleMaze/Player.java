import java.util.Scanner;

public class Player {

	
int rPos;
int cPos;
public Player (int rPos, int cPos)
{
	this.rPos = rPos;
	this.cPos = cPos;
}
public int[] getPos()
{
	int[] pos = {rPos, cPos};
	return pos;
}

public void setX(int newX)
{
	rPos = newX;
}
public int getX()
{
	return rPos;
}

public void setY(int newY)
{
	cPos = newY;
}
public int getY()
{
	return cPos;
}

public void checkDirection(Maze maze, Scanner scanner)
{
	switch (chooseDirection(scanner))
	{
	case "up":
		moveUp(maze);
		break;
	
	case "down":
		moveDown(maze);
		break;
		
	case "left":
		moveLeft(maze);
		break;
	
	case "right":
		moveRight(maze);
		break;
	}
}
public void moveRight(Maze maze)
{
	int posX = getX();
	int posY = getY();
	gameTile[][] board = maze.getMaze();
	
	if (posX + 1 < board[posY].length) // checked for error protection
	{
		if (board[posY][posX + 1].isWall()) // checks if the tile right of the player is a wall
		{
			System.out.println("You hit a wall.");
			
			/* changes the value of isRevealed for the tile to true allows it to be printed */
			board[posY][posX + 1].setRevealed(true);
			
		}
		else
		{
			board[posY][posX].setPlayer(null); // gets rid of the player on the previous tile
			
			/* moves the player by moving the instance of this class to the tile to the right */
			board[posY][posX + 1].setPlayer(this);
			
			board[posY][posX].setRevealed(true); // reveals path
			
			setX(getX() + 1); // increments collided count
		}
	}
}

/**
 * MOVE
 * moves the player left
 * @param maze
 */
public void moveLeft(Maze maze)
{
	int posX = getX();
	int posY = getY();
	gameTile[][] board = maze.getMaze();
	
	if (posX - 1 > -1) // checked for error protection
	{
		if (board[posY][posX - 1].isWall()) // checks if the tile left of the player is a wall
		{
			System.out.println("You hit a wall.");
			
			/* changes the value of isRevealed for the tile to true allows it to be printed */
			board[posY][posX - 1].setRevealed(true);
			
		}
		else
		{
			board[posY][posX].setPlayer(null); // gets rid of the player on the previous tile
			
			/* moves the player by moving the instance of this class to the tile to the left */
			board[posY][posX - 1].setPlayer(this);
			
			board[posY][posX].setRevealed(true); // reveals path
			
			setX(getX() - 1); // increments collided count
		}
	}
}

/**
 * MOVE
 * moves the player down
 * @param maze
 */
public void moveDown(Maze maze)
{
	int posX = getX();
	int posY = getY();
	gameTile[][] board = maze.getMaze();
	
	if (posY + 1 < board.length) // checked for error protection
	{
		if (board[posY + 1][posX].isWall()) // checks if the tile below the player is a wall
		{
			System.out.println("You hit a wall.");
			
			/* changes the value of isRevealed for the tile to true, allows it to be printed */
			board[posY + 1][posX].setRevealed(true);
			
		}
		else
		{
			board[posY][posX].setPlayer(null); // gets rid of the player on the previous tile
			
			/* moves the player by moving the instance of this class to the tile below */
			board[posY + 1][posX].setPlayer(this);
			
			board[posY][posX].setRevealed(true); // reveals path
			
			setY(getY() + 1); // increments posY
		}
	}
}

/**
 * MOVE
 * moves the player up
 * @param maze
 */
public void moveUp(Maze maze)
{
	int posX = getX();
	int posY = getY();
	gameTile[][] board = maze.getMaze();
	
	if (posY - 1 > -1) // checked for error protection
	{
		if (board[posY - 1][posX].isWall()) // checks if the tile above the player is a wall
		{
			System.out.println("You hit a wall.");
			
			/* changes the value of isRevealed for the tile to true, allows it to be printed */
			board[posY - 1][posX].setRevealed(true);
			
		}
		else
		{
			board[posY][posX].setPlayer(null); // gets rid of the player on the previous tile
			
			/* moves the player by moving the instance of this class to the tile above */
			board[posY - 1][posX].setPlayer(this);
			
			board[posY][posX].setRevealed(true); // reveals path
			
			setY(getY() - 1); // decrements posY
		}
	}
}

/**
 * allows player to choose direction
 * @return up, down, left, or right
 */
public String chooseDirection(Scanner scanner)
{
	String direction = scanner.nextLine().toLowerCase(); // stores player input
	
	/* loops until player types up, down, left, or right */
	while (!direction.equals("up") && !direction.equals("down") && !direction.equals("left") && !direction.equals("right"))
	{
		System.out.println("Please choose a valid direction");
		direction = scanner.nextLine().toLowerCase();
	}
	
	return direction;
}


}
