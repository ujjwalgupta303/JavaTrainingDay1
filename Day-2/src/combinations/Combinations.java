package combinations;

import java.util.Scanner;

public class Combinations {
	static void fun(String prefix, String s)
	  {
	    int N = s.length();

	    System.out.println(prefix);

	    for (int i = 0 ; i < N ; i++)
	      fun(prefix + s.charAt(i), s.substring(i+1));
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		fun("",s);
	}

}
