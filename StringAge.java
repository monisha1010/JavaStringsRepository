package strings;

import java.util.Scanner;

public class StringAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = s.nextLine();
		s.close();
		int l = str.length();
		int index = (int) Character.toUpperCase((str.charAt(l-1))) - 64;
		int age= l + index;
		System.out.println("Age of String is : " + age);
	}

}
