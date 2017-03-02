package gameZone;

import javax.swing.JOptionPane;
public class Quiz
{

	public static void main(String[] args) 
	{
		int answer1 = 1, answer2 = 3, answer3 = 1, answer4 = 2, answer5 = 4;
		int userAnswer1, userAnswer2, userAnswer3, userAnswer4, userAnswer5, testYes;
		testYes = Integer.parseInt(JOptionPane.showInputDialog("Would you like to take a quiz over the NFL? \n(1)Yes or (2)No"));
		
		if(testYes == 1)
		{
		do {
		userAnswer1 = Integer.parseInt(JOptionPane.showInputDialog("Who won 2016-17 NFL MVP? \n(1)Matt Ryan \n(2)Tom Brady "
				+ "\n(3)Aaron Rodgers \n(4)Derek Carr"));
		}while(userAnswer1 != 1);
		
		do { 
		userAnswer2 = Integer.parseInt(JOptionPane.showInputDialog("Who won 2016-17 NFL Rookie of the Year? \n(1)Jordan Howard \n(2)Carson Wentz "
				+ "\n(3)Dak Prescott \n(4)Ezekiel Elliot"));
		}while(userAnswer2 != 3);
		
		do {
		userAnswer3 = Integer.parseInt(JOptionPane.showInputDialog("Who led the NFL in total QB Sacks in 2016-17? \n(1)Vic Beasley \n(2)Lorenzo Alexander "
				+ "\n(3)Von Miller \n(4)Danielle Hunter"));
		}while(userAnswer3 != 1);
		
		do {
		userAnswer4 = Integer.parseInt(JOptionPane.showInputDialog("Who led the NFL in total Recieving Yards in 2016-17? \n(1)Julio Jones \n(2)T.Y. Hilton "
				+ "\n(3)Antonio Brown \n(4)Odell Beckham Jr."));
		}while(userAnswer4 != 2);
		
		do {
		userAnswer5 = Integer.parseInt(JOptionPane.showInputDialog("Who led the NFL in total Rushing Yards in 2016-17? \n(1)DeMarco Murray \n(2)Jay Ajayi "
				+ "\n(3)Jordan Howard \n(4)Ezekiel Elliot"));
		}while(userAnswer5 != 4);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Okay.");
		}
		if(testYes == 1)
			
			JOptionPane.showMessageDialog(null, "You got them all correct!");
		
		
		
		
	}

}
