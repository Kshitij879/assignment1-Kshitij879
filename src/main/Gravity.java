/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
		double time;
		double speed;
		double distance;
		double gravity = 9.8;
		Scanner scanner = new Scanner(System.in);
		time = scanner.nextDouble();
		speed = gravity*time;
		distance = 0.5*(gravity*time*time);
		System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the relase is " + distance);
		scanner.close();
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
