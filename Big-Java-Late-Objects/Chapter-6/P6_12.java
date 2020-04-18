

/**
 * P6.12 A run is a sequence of adjacent repeated values. Write a program that generates a
 * sequence of 20 random die tosses in an array and that prints the die values, marking
 * the runs by including them in parentheses, like this:
 * 1 2 (5 5) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1
 * Use the following pseudocode:
 * Set a boolean variable inRun to false.
 * For each valid index i in the array
 * If inRun
 * If values[i] is different from the preceding value
 * Print ).
 * inRun = false.
 * If not inRun
 * If values[i] is the same as the following value
 * Print (.
 * inRun = true.
 * Print values[i].
 * @author Lyle
 *
 */
public class P6_12 {

	public static void main(String[] args) {
		
	}

}
