package strings;

import java.util.Scanner;

public class CountCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String T = s.nextLine();
		s.close();
		int countUpper = 0, countLower = 0;
		for(int i=0; i<T.length(); i++) {
			if(T.charAt(i) >= 'a' && T.charAt(i) <= 'z') {
				countLower++;
			}
			else if(T.charAt(i) >= 'A' && T.charAt(i) <= 'Z') {
				countUpper++;
			}
		}
		if(countUpper == countLower) {
			System.out.println("Equally Distributed");
		}
	}
}
