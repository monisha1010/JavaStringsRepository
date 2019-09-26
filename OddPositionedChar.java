package strings;

import java.util.Arrays;
import java.util.Scanner;

public class OddPositionedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter s String : ");
		String str = s.nextLine();
		s.close();
		String OddString = "";
		char[] c = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			c[i] = str.charAt(i);
		}
		Arrays.sort(c);
		str = "";
		for(int i=0; i<c.length; i++) {
			str = str + Character.toString(c[i]);
			if(i%2 != 0) {
				OddString = OddString + Character.toString(c[i]);
			}
		}
		System.out.println("Ordered String is : " + str);
		System.out.println("Odd Positioned String is : " + OddString);
	}

}
