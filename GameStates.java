
public class GameStates {
	public enum States
	{
		Start, PlayerOneWin, PlayerTwoWin, PlayerOneTurn, PlayerTwoTurn
	}
	
	private volatile int character;
	private States currentState;
	private volatile boolean waiting;
	private volatile boolean success;
	
	public GameStates()
	{
		currentState = States.Start;
	}
	
	public int getCharacter()
	{
		return character;
	}
	
	public void setCharacter(int character)
	{
		this.character = character;
	}
	
	public void setWaiting(boolean waiting)
	{
		this.waiting = waiting;
	}
	
	public boolean isWaiting()
	{
		return waiting;
	}
	
	public void setSuccess(boolean success)
	{
		this.success = success;
	}
	
	public boolean isSuccessful()
	{
		return success;
	}
	
	public void setPlayerOneWin()
	{
		currentState = States.PlayerOneWin;
	}
	
	public void setPlayerTwoWin()
	{
		currentState = States.PlayerTwoWin;
	}
	
	public void setPlayerOneTurn()
	{
		currentState = States.PlayerOneTurn;
	}
	
	public void setPlayerTwoTurn()
	{
		currentState = States.PlayerTwoTurn;
	}
	
	public int getTurn()
	{
		if (currentState == States.PlayerOneTurn)
		{
			return 1;
		}
		else if (currentState == States.PlayerTwoTurn)
		{
			return 2;
		}
		else
		{
			return -1;
		}
	}
}
