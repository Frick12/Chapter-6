package exercises;

import javax.swing.JOptionPane;
public class TestScoreStatistics 
{

	public static void main(String[] args) 
	{
		double gradeLOW = 0, gradeHIGH = 100, average, test = 0, highTest = 0, lowTest = 0, testAmount = 0, sum = 0;
		
		while(test != 999){
		test = Integer.parseInt(JOptionPane.showInputDialog("What is the test score? >> "));
		
		if(test > 100 || test < 0 && test < 999 || test > 999)
		{
			JOptionPane.showMessageDialog(null, "That number is not accepted. \nPlease enter a number from 0-100");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The test score is " + test);
		}
		if(test == 999) break;
		
		++testAmount;
		sum += test;
		if(test > highTest)
		{
			highTest = test;
		}
		if(test < lowTest)
		{
			lowTest = test;
		}
		}
		
		average = sum / testAmount;
		
		JOptionPane.showMessageDialog(null, "The average score is " + average + "\nThe highest score is " + highTest
				+ "\nThe lowest score is " + lowTest);
	}

}
