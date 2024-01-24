package guessNumber;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        // Ask the user to enter a value for m
        System.out.print("Welcome to Guess Number Game. Enter a value for m: ");
        int m = scannerObject.nextInt();

        // Calculate the range based on the user input
        int range = (int) Math.pow(10, m);

        // Generate a random number within the specified range
        int number = (int) (Math.random() * range);
        //The user gets 5 chances 
        int initialGuesses = 5;
        //will change in the game
        int remainingGuesses = initialGuesses;
        //User can keep guessing as long as the guess chances is greater than 0 
        while (remainingGuesses > 0) {
        	//User prompted to enter the guess
            System.out.print("Enter your guess: ");
            int guess = scannerObject.nextInt();
            //Guesses are deducted in loop
            remainingGuesses--;
            
          //Check if guess is equal to number and break out of loop
            if (guess == number) {
                System.out.print("Yes, the number is " + number);
                break;
            // //if guess is greater than number, it will give user hints
            } else if (guess > number) {
                System.out.print("Your guess is too high");
            //If guess is less than number it will give user hints
            } else {
                System.out.print("Your guess is too low");
            }
            //Tell user how many guesses they have left 
            System.out.println("\nRemaining guesses are " + remainingGuesses);

            // Check if the user wants to buy more guesses
            if (remainingGuesses > 0) {
                System.out.print("Do you want to buy more guesses? (1 for Yes, 2 for No): ");
                int purchase = scannerObject.nextInt();
                ////If user selects yes, they will get to choose how many they want to purchase 
                if (purchase == 1) {
                    System.out.print("Enter the number of additional guesses you want to buy: ");
                    int addedGuesses = scannerObject.nextInt();
                    //Remaining Guesses is added to added guesses
                    remainingGuesses += addedGuesses;
                    //Tells the user how many they have purchased 
                    System.out.println("You've purchased " + addedGuesses + " additional guesses");
                } else {
                	//if the guesses reaches 0, the correct number will print and it will break
                    if (remainingGuesses == 0) {
                        System.out.println("No more guesses. The number was " + number);
                        break;
                    } else {
                    	//if not it will continue in the loop
                        System.out.println("Continuing with remaining guesses.");
                    }
                }
            } else {
                System.out.println("Out of guesses. The number was " + number);
                break;
            }
        }
    }
}	
