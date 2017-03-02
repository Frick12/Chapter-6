package youDoIt;


import java.util.Scanner;
public class DoorPrizeLoop 
{

	public static void main(String[] args) 
	{
		int choice;
		Scanner input = new Scanner(System.in);
	do{
		System.out.println("Choose what is behind Door #1, Door #2, or Door #3.");
		choice = input.nextInt();
		
			//door 1 comment line
			if (choice == 1)
			{
				System.out.println("A brand new car! ");
			}
			if (choice == 2)
			{	
				System.out.println("A brand new huffy bike! ");
			}
			if (choice == 3)
			{
				System.out.println("NOTHING YOU'RE A LOSER!!!!");
			}
			if (choice >= 4)
			{
				System.out.println("There are only 3 Doors...");
			}
		}while(choice >= 4);	
	}

}
