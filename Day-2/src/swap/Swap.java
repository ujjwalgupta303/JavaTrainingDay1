package swap;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
//		System.out.println(s);
		s1+=s2;
		s2=s1.substring(0, s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("After swapping:");
		System.out.println("s1 is: "+s1);
		System.out.println("s2 is: "+s2);
		
	}

}
