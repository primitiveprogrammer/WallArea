/**
 * 
 */
package edu.gsu.csc1301.wallarea;

/**
 * @author Copeland
 *
 */
// Import the Scanner class
import java.util.Scanner;
public class WallArea 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Declare a scanner
		Scanner in = new Scanner(System.in);
		// Prompt for and read the width and height
		// and the number of windows
		System.out.print("Wall width: ");
			double wallWidth = in.nextDouble();
		System.out.print("Wall height: ");
			double wallHeight = in.nextDouble();
		System.out.print("Number of windows: ");
			int numberOfWindows = in.nextInt();
		// Compute the area of the wall without the windows
			double area = wallWidth * wallHeight - numberOfWindows * (2 * 3);
		System.out.println("Area: " + area);
		
		in.close();
	}
}