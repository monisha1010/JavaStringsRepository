package strings;

import java.util.Arrays;
import java.util.Scanner;

public class DictionaryOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = s.nextLine();
		s.close();
		String[] split_String = str.split(" ");
		Arrays.sort(split_String);
		System.out.println("Strings in Alphabetical Order : ");
		for(int i=0; i<split_String.length; i++) {
			System.out.println(split_String[i]);
		}
	}
}
