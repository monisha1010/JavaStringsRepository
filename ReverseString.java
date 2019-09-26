package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter two String: ");
		String s1 = s.nextLine();
		s.close();
		String s2 = s.nextLine();
		String reverseString = "";
		if (s1.equals(s2)) {
			for(int i = s1.length()-1; i >= 0; i--) {
				reverseString += s1.charAt(i); 
			}
			System.out.println("Reverse String is : " + reverseString);
		}
		else {
			System.out.println("Reverse Not Supported");
		}		
	}
	
}
