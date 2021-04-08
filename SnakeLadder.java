package javapractice;

import java.util.Random;

public class SnakeLadder {
	public static void main(String args[]) {
		System.out.println("Welcome to snake and ladder game!");

		int playerStartPoint = 0;
		System.out.println("player position is :" + playerStartPoint);
		Random rand = new Random();
		int diceRoll = (rand.nextInt(6)) + 1;
		System.out.println("dice value = " +diceRoll);

	}
}
