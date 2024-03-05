import java.util.Random;
import java.util.Scanner;  

//Task Three
public class GuessANumber {
	private static int rnd_number;
    private static int attempts = 0;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
        Scanner scan = new Scanner(System.in);
        attempts++;

        if(scan.hasNextDouble()){
            
        double input = scan.nextDouble();
        
            if(input == rnd_number){
                
                System.out.println("You are correct! the number is indeed: "+rnd_number);
                System.out.println("You used: "+attempts+" attempt!");
            }else{
                if(input > rnd_number){
                    System.out.println("WRONG! Your guess was to high! Try again");
                    makeAGuess();
                }else{
                    
                    System.out.println("WRONG! Your guess was to low! Try again");
                    makeAGuess();
                }

            }
        }else{
            
            System.out.println("Please input a number, you dumbskull!");
            makeAGuess();
        }

		// Create a Scanner object   	 
    	// Read user input
    	
        //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }
   

}
