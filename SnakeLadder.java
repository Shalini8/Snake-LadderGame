package javapractice;

import java.util.Random;

public class snakeUC2 {
	public static void main(String args[]) {
		// adding welcome note
		System.out.println("Welcome to snake and ladder game!");

		// giving a start point to player
		int playerStartPoint = 0;
		System.out.println("player position is :" + playerStartPoint);


		// generating random number for dice to roll 1-6
		Random rand = new Random();
		int diceRoll = (rand.nextInt(6)) + 1;
		System.out.println("dice value = " +diceRoll);


		// generating random numbers for play 0-2
		Random ran = new Random();
		int playCheck = ran.nextInt(3);

		int playerPosition = 0;

		// writing a switch case for play check
		switch (playCheck) {
		case 0:
			playerPosition = playerPosition;
			System.out.println("Sorry no luck! You can't play.");
			break;

		case 1:
			playerPosition = diceRoll;
			System.out.println("Hurray you got ladder! You are moved by " + diceRoll + " positions.");
			break;

		case 2:
			playerPosition = playerPosition - diceRoll;
			System.out.println("Hissss ! You are bitten by snake");
			break;

		default:
			System.out.println("Invalid Option");

		}
		System.out.println("Player position: " + playerPosition);
	}

}
