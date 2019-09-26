package strings;

import java.util.Scanner;

public class MaxMinCountString {

	static final int ASCII_SIZE = 256; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = s.nextLine();
		s.close();
		int l = str.length();
		int count[] = new int[ASCII_SIZE ]; 
        for (int i=0; i<l; i++) 
            count[str.charAt(i)]++; 
        int max = -1, min = 999;
        char maxCharacter = '\0', minCharacter = '\0';
        for (int i = 0; i < l; i++) { 
            if (max < count[str.charAt(i)]) { 
                max = count[str.charAt(i)]; 
                maxCharacter = str.charAt(i);
            } 
            if (min > count[str.charAt(i)]) { 
                min = count[str.charAt(i)]; 
                minCharacter = str.charAt(i);
            } 
        }
        System.out.println("Maximum occured Character : " + maxCharacter);
        System.out.println("Minimum occured Character : " + minCharacter);
	}

}
