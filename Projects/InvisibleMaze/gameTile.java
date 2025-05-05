
public class gameTile {
private Player isPlayer;
boolean isRevealed;
boolean isWall;
public gameTile(boolean isWall, boolean isRevealed, Player isPlayer)
{
	this.isPlayer = isPlayer;
	this.isRevealed = isRevealed;
	this.isWall = isWall;
}
public boolean isRevealed()
{
	return isRevealed;
}
public void setRevealed(boolean isRevealed)
{
		this.isRevealed = isRevealed;
}
public boolean isWall()
{
	return isWall;
}
public Player getPlayer()
{
	return isPlayer;
}public void setPlayer (Player player)
{
	isPlayer = player;
}
public String toString()
{
	if (isPlayer != null)
	{
		return "T";
	}
	else if (isRevealed)
	{
			if (isWall)
			{
				return "W";
			}
			else
			{
				return "O";
			}
	}
	return " ";
}


}
