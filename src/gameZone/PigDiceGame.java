package gameZone;

public class PigDiceGame 
{
	private int value;
	private static final int HIGHEST_DIE_VALUE = 6;
	private static final int LOWEST_DIE_VALUE = 1;
	
	public static void main(String[] args)
	{
		
	}
	
	public void Die()
	{
		value = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}

	public int getValue()
	{
		return value;
	}
	
	public int getValue2()
	{
		return value;
	}
}
