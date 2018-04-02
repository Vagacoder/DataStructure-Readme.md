package ch08;

import java.io.*;

public class Maze {

	public static void main(String[] args) {

		traverseMaze();

	}


	public static boolean traverseMaze() {
		int direction; // Counts 1, 2, 3 for the three directions to explore.
		boolean found; // Will be set to true if we find the tapestry.
		System.out.println("Step forward & write your name on the ground.");
		found = inquire("Have you found the tapestry?");
		if (found) { // Pick up the tapestry and step back from whence you came.
			System.out.println("Pick up the tapestry and take a step backward.");
		} else { // Explore the three directions (not counting the one that you just came from).
					// Start
					// with the direction on your left, and then turn through each of the other
					// directions.
			System.out.println("Please turn left 90 degrees.");
			for (direction = 1; direction <= 3; direction++) {
				if (!found && !deadend())
					found = traverseMaze();
				System.out.println("Please turn right 90 degrees.");
			}
			// You’re now facing the direction from whence you came, so step forward and
			// turn
			// around. This will put you in the same spot when the method was activated.
			System.out.println("Please step forward, then turn 180 degrees.");
		}
		return found;
	}


	public static boolean inquire(String query)

	{
		char answer = 'N';
		do {
			System.out.println(query + " [Y or N]");
			try {
				do
					answer = (char) System.in.read();
				while (Character.isWhitespace(answer));
			} catch (IOException e) {
				System.err.println("Standard input error: " + e);
				System.exit(0);
			}
			answer = Character.toUpperCase(answer);
		} while ((answer != 'Y') && (answer != 'N'));
		return (answer == 'Y');
	}


	public static boolean deadend() {
		return inquire("Are you facing a wall?") || inquire("Is your name written in front of you?");
	}
}
