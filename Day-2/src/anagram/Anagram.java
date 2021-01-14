package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("s1 and s2 are not ANAGRAMS");
			return;
		}
		
		char[] temp1 = s1.toCharArray();
        Arrays.sort(temp1);
        String sortedString1 = new String(temp1);
//        System.out.println(sortedString1);
        
        char[] temp2 = s1.toCharArray();
        Arrays.sort(temp2);
        String sortedString2 = new String(temp2);
//        System.out.println(sortedString2);
        System.out.println(sortedString1);
        System.out.println(sortedString2);
        if(sortedString1.equals(sortedString2))
        	System.out.println("s1 and s2 are ANAGRAMS");
        else
        	System.out.println("s1 and s2 are not ANAGRAMS");

}
};
