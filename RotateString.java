package strings;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = s.nextLine();
		s.close();
		String RotateString = "";
	    int offset = 1;
	    int clock = str.length() - offset;
	    if(str.length()%2 ==0 ) {
	    	RotateString = str.substring(offset) + str.substring(0, offset);
	    	System.out.println("Clocwise Rotation");
	    }
	    else {
	    	RotateString = str.substring(clock) + str.substring(0, clock);
	    	System.out.println("Anti-Clocwise Rotation");
	    }
	    System.out.println(RotateString);
	}

}
