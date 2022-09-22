// Application:    Boone Program 2
// Name:           D'Kairi Boone
// GitHub User:    DKairi
// Date:           Sep 20, 2022
//Version:         1.0
//Description:     Printing and Variables
import java.util.Scanner;
public class BooneProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Activate Keyboard
		Scanner keyboard = new Scanner(System.in);
	    
		//Ask user for 3 numbers and store as variables
		System.out.print("Your favorite number? ");
		int number1 = keyboard.nextInt();
		System.out.print("Your second favorite number? ");
		int number2 = keyboard.nextInt();
		System.out.print("Your third favorite number? ");
		int number3 = keyboard.nextInt();
		
		//Make variable for total after math
		int total = 0;
		
		//Display a menu of 4 options
		System.out.println("Menu of Actions");
		System.out.println("1.) Multiply");
		System.out.println("2.) Divide");
		System.out.println("3.) Add");
		System.out.println("4.) Subtract");
		
		
		//Ask user for menu choice
		System.out.print("Menu Choice? ");
		int menuChoice = keyboard.nextInt();
		
		
		
		
		//Perform action based on menu response
		switch (menuChoice) {
		  case 1:
			  System.out.print("Your numbers multiplied ");
			  total = number1 * number2;
		    break;
		  case 2:
			  System.out.print("Your numbers divided ");
		    total = number1 / number2;
		    break;
		  case 3:
			  System.out.print("Your numbers added ");
		    total = number1 + number2;
		    break;
		  case 4:
			  System.out.print("Your numbers subtracted ");
		    total = number1 - number2;
		    break;
		  
		  
		}
		
		
		//Compare total to 3rd number
		if(total > number3) {
			System.out.print("are greater than your third number");
	
	} else
	
	{   System.out.print("are not greater than your third number");
	
	
	}
	
	}


	
}
