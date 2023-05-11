package Game;
import java.util.*;

public class game {
	public static void main(String Args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------------press 1 to start the game------");
		int ch = scanner.nextInt();
		int attempt =0;
		int score = 0;
		
		while(ch==1) {
			attempt++;
			System.out.println("This is your "+attempt+" attempt");
			// Get input from user
	        System.out.println("Enter a number: ");
	        int userInput = scanner.nextInt();

	        // Generate a random number
	        Random random = new Random();
	        int randomNumber = random.nextInt(100);
	        System.out.println(randomNumber);

	        // Compare the two numbers
	        if (userInput == randomNumber) {
	            System.out.println("Congratulations, you guessed the number!");
	            score += 10;
	        } else {
	        	if(userInput<randomNumber) {
	        		System.out.println("Sorry, the random number was greater than " + userInput);
	        		
	        	}
	        	else if(userInput>randomNumber){
	        		System.out.println("Sorry the random number was less than " + userInput);
	        	}  
	        }
	        if(attempt>=3) {
	        	System.out.println("Enter one to continue");
		        ch = scanner.nextInt();
			}
	        else {
	        	ch=0;
	        }
		}
		System.out.println("---------GameOver--------");
		System.out.println("Your Score is "+score);
	}
}
