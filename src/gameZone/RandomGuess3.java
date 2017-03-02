package gameZone;

import java.util.Random;
import javax.swing.JOptionPane;
public class RandomGuess3 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		
		final int LOW = 1;
		final int HIGH = 10;
		int tries = 0;
		int input = 0;
		String msg = null;
		
		int result = r.nextInt(9) + LOW;
		do
	{
		input = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess a number between 1 and 10"));
	
		if (input == result)
		{
			msg = "You Win!!";
		}
		if (input < result)
		{
			msg = "You were too low";
		}
		if(input > result)
		{
			msg = "You were too high.";
		}
		++tries;
		JOptionPane.showMessageDialog(null, msg);
	}while(tries < 3 && input != result);
		JOptionPane.showMessageDialog(null, "The number was " + result + ".");
		if(tries <= 3 && tries >= 2)
		{
			JOptionPane.showMessageDialog(null, "It took you " + tries + " tries.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "It took you " + tries + " try.");
		}
	
	}
		

}
