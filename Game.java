package guessNumber;

import java.util.Scanner;

public class Game {
	//Scanner object for reading input 
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		//Ask user to enter a range for the game
		System.out.print("Welcome to Guess Number Game. Enter a range");
		int m = scannerObject.nextInt();
		
		//Create random number generator within the range
		int number = (int)(Math.random()* m); 
		//Initialize variables of cost and guess
        int costOfGuess = 1;
        int remainingGuess = 1;

        //Loop continues until user has no more guesses 
		while (remainingGuess > 0) {
			//Prompts user to enter guess
			System.out.print("Enter your guess");
			int guess = scannerObject.nextInt();
			//Check if guess is equal to number and break out of loop
			if(guess ==number) {
				System.out.print("Yes, the number is"+ number);
				break;
			//if guess is greater than number, it will give user hints 
			}else if(guess > number) {
				System.out.print("Your guess is too high");
			}else {
				//If guess is less than number it will give user hints 
				System.out.print("Your guess is too low");
			}
			  //Asks user if they want to purchase guesses
			  System.out.print("\nDo you want to buy an additional guess? (1 for Yes, 2 for No): ");
              int purchase = scannerObject.nextInt();
              	//If user selects yes, they will be given one more guess
              	if (purchase == 1) {
                  remainingGuess = 1;
                  //Prints the cost of additional guess
                  System.out.println("You've purchased an additional guess for $" + costOfGuess + ".");
                  System.out.println("You now have " + remainingGuess + " guess.");
              }else {
            	  //If user selects No, the number will be given and loop will break
            	  System.out.println ("The number was " + number);
            	  break;
              }
		}
	}
}
		
