/**
 * 
 */
package vw.codeforces.contests.cr392;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class UnfairPoll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		long k = in.nextLong();
		int x = in.nextInt(), y = in.nextInt();

		long min = k / (n * m);
		long max = min + 1;
		
		if((min % 2) == 0){
			
		}
	}

}
