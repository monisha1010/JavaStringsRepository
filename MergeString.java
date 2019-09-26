package strings;

import java.util.Scanner;

public class MergeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		s.close();
		String str = "";
		if(str1.length()>str2.length()) {
			for(int i=0; i<str1.length(); i++) {
				if(i<str2.length()) {
					str = str + Character.toString(str1.charAt(i)) + Character.toString(str2.charAt(i));
				}
				else {
					str = str + Character.toString(str1.charAt(i));
				}
			}
		} else {
			for(int i=0; i<str2.length(); i++) {
				if(i<str1.length()) {
					str = str + Character.toString(str1.charAt(i)) + Character.toString(str2.charAt(i));
				}
				else {
					str = str + Character.toString(str2.charAt(i));
				}
			}
		}
		System.out.println("Merged String is : " + str);
	}

}
