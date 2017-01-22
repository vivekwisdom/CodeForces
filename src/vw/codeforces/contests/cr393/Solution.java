/**
 * 
 */
package vw.codeforces.contests.cr393;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class Solution {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int d = in.nextInt();
		in.close();
		int c = 7 - d;
		if (m == 2) {
			int month = 28 - c;
			int res = month / 7;
			if (c < (month % 7)) {
				res += 2;
			} else {
				res += 1;
			}
			System.out.println(res);
		} else if (m == 4 || m == 6 || m == 9 || m == 11) {
			int month = 30 - c;
			int res = month / 7;
			if (c < (month % 7)) {
				res += 2;
			} else {
				res += 1;
			}
			System.out.println(res);
		} else {
			int month = 31;
			int res = month / 7;
			if (c < (month % 7)) {
				res += 2;
			} else {
				res += 1;
			}
			System.out.println(res);
		}
	}

}
