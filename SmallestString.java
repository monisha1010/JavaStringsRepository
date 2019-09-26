package strings;

import java.util.Scanner;

public class SmallestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String smallest_string;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = s.nextLine();
		s.close();
		String[] split_String = str.split(" ");
		int l = split_String[0].length();
		smallest_string = split_String[0];
		for(int i=1; i < split_String.length; i++) {
			if(split_String[i].length() < l) {
				smallest_string = split_String[i];
			}
		}
		System.out.println("Smallest String is : " + smallest_string);
	}

}
