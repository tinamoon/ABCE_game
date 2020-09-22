package TinaMoon;

import java.util.Scanner;
import java.util.Random;

public class Game {

	public static void main(String args[]) {
		//variables for total rounds, computer wins and user wins
		int rounds = 0;
		int computerWins = 0;
		int userWins = 0; 
		 
		//prints out rules
		System.out.println("RULES: A beats B, C | B beats C | C beats D| D beats A | Tie -> COMPUTER WINS");
		Scanner sc = new Scanner(System.in);

		//asking for user input for playing 'Y'  and  'N' 
		for (;;) {
			System.out.println("Please type 'Y' to play or 'N' to end the program");
			String user = sc.next();

			//user can pick player A,B,C,D
			if (user.equals("Y")) {
			System.out.println("Please insert one of: A, B, C, D to play. Hit END to cancel at any time and see total scores");
			user = sc.next();
			}
			
			//to exit the game 
			else if (user.equals("N")|| user.equals("END")) {
			System.out.println("system off..."); 
			break;
			}
			
			//computer random letter in array
			Random rn = new Random();
			int rnValue = rn.nextInt(4);
			String arr[] = { "A", "B", "C", "D" };
			String computer = arr[rnValue];

			//this will run though if user enters A
			if (user.equals("A")) {
				if (computer.equals("B") || computer.equals("C")){
				System.out.println("YOU WON!");
			userWins++;
			rounds++;}
			else {
				System.out.println("COMPUTER WON!");
			computerWins++;
			rounds++;
				}
			}
			
			//this will run though if the user enters B
			if (user.equals("B")) {
				if (computer.equals("C")){
				System.out.println("YOU WON!");
			userWins++;
			rounds++;}
			else {
				System.out.println("COMPUTER WON!");
			computerWins++;
			rounds++;
				}
			}
			
			//this will run though if the user enters C
			if (user.equals("C")) {
				if (computer.equals("D")){
				System.out.println("YOU WON!");
			userWins++;
			rounds++;}
			else {
				System.out.println("COMPUTER WON!");
			computerWins++;
			rounds++;
				}
			}
			
			//this will run though if the user enters D
			if (user.equals("D")) {
				if (computer.equals("A")){
				System.out.println("YOU WON!");
			userWins++;
			rounds++;}
			else {
				System.out.println("COMPUTER WON!");
			computerWins++;
			rounds++;
				}
			}
		
		//this will print out total 
		System.out.println("TOTAL:" + "You Wins:" + userWins + "Computer Wins:" + computerWins
				+ "Total Rounds:" + rounds);
		
		}
	}
}