package array_fun;

import java.util.Scanner;

public class Matrix {

	Scanner s = new Scanner(System.in);

	private char[][] game = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };
	private char[][] newBoard = game;

	private boolean playerOne = true;
	private boolean gameOver = false;
	boolean win = false;
	boolean tie = false;
	boolean runAgain = true;

	public void run() {
		printBoard();
		turn();

		while (!gameOver) {
			printBoard();
			turn();
		}

	}

	public void runAgain() {
		printBoard();
		gameOver = false;
		playerOne = true;
		while (!gameOver) {
			turn();
			printBoard();

		}

	}

	private void turn() {

		int r, c;
		String answer;

		if (playerOne) {
			System.out.println("Player 1, place an X in row and column: ");
			answer = s.nextLine();
			r = Character.getNumericValue(answer.charAt(0));
			c = Character.getNumericValue(answer.charAt(1));
			game[r][c] = 'X';
			playerOne = false;
		} else if (!playerOne) {
			System.out.println("Player 2, place an O in row and column: ");
			answer = s.nextLine();
			r = Character.getNumericValue(answer.charAt(0));
			c = Character.getNumericValue(answer.charAt(1));
			game[r][c] = 'O';

			playerOne = true;

		}
	}

	private void printBoard() {
		System.out.printf(" %C | %C | %C \n", game[0][0], game[0][1], game[0][2]);
		System.out.println("-----------");
		System.out.printf(" %C | %C | %C \n", game[1][0], game[1][1], game[1][2]);
		System.out.println("-----------");
		System.out.printf(" %C | %C | %C \n", game[2][0], game[2][1], game[2][2]);
		System.out.print("\n");

		if (game[0][0] == game[0][1] && game[0][1] == game[0][2] && game[0][0] != '-')
			win = true;
		else if (game[1][0] == game[1][1] && game[1][1] == game[1][2] && game[1][0] != '-')
			win = true;
		else if (game[2][0] == game[2][1] && game[2][1] == game[2][2] && game[2][0] != '-')
			win = true;
		else if (game[0][0] == game[1][0] && game[1][0] == game[2][0] && game[1][0] != '-')
			win = true;
		else if (game[0][1] == game[1][1] && game[1][1] == game[2][1] && game[1][1] != '-')
			win = true;
		else if (game[0][2] == game[1][2] && game[1][2] == game[2][2] && game[1][2] != '-')
			win = true;
		else if (game[0][0] == game[1][1] && game[1][1] == game[2][2] && game[0][0] != '-')
			win = true;
		else if (game[0][2] == game[1][1] && game[1][1] == game[0][2] && game[0][2] != '-') {
			win = true;
		} else
			win = false;

		if (win == true) {
			System.out.println("Congrats you win!");
			gameOver = true;
			System.out.println("Do you want to play again?");
			Scanner keyboard = new Scanner(System.in);
			String response = keyboard.next();
			while (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("n")) {
				System.out.println("\nInvalid response. Try again.");
				response = keyboard.next();
			}
			if (response.equalsIgnoreCase("no")) {
				System.out.println("\nBye bye!");
			} else {
				System.out.println("\nGreat! Let's get started.");

				game[0][0] = '-';
				game[0][1] = '-';
				game[0][2] = '-';
				game[1][0] = '-';
				game[1][1] = '-';
				game[1][2] = '-';
				game[2][0] = '-';
				game[2][1] = '-';
				game[2][2] = '-';
				runAgain();
			}

			if (tie == true) {
				System.out.println("it's a tie! Cats Game.");
				gameOver = true;
				System.out.println("Do you want to play again?");
				Scanner keyboard1 = new Scanner(System.in);
				String response1 = keyboard1.next();
				while (!response1.equalsIgnoreCase("yes") && !response1.equalsIgnoreCase("n")) {
					System.out.println("\nInvalid response. Try again.");
					response1 = keyboard1.next();
				}
				if (response1.equalsIgnoreCase("no")) {
					System.out.println("\nBye bye!");
				} else {
					System.out.println("\nGreat! Let's get started.");

					game[0][0] = '-';
					game[0][1] = '-';
					game[0][2] = '-';
					game[1][0] = '-';
					game[1][1] = '-';
					game[1][2] = '-';
					game[2][0] = '-';
					game[2][1] = '-';
					game[2][2] = '-';
					runAgain();
				}

			}

		}
	}
}
