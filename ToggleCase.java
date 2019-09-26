package strings;

import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String toggle_string = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = s.nextLine();
		s.close();
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				toggle_string += Character.toLowerCase(str.charAt(i));
			}
			else if(Character.isLowerCase(str.charAt(i))) {
				toggle_string += Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(toggle_string);
	}

}
