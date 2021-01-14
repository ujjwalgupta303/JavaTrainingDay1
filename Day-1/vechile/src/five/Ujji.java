package five;

import java.util.Scanner;

public class Ujji {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int y=s.nextInt();
		if (y % 400 == 0) 
		{
		      System.out.println("Leap year");
		}
		else if (y % 100 == 0) 
		{
			System.out.println("Not a leap year");
		}	
		else if (y % 4 == 0) 
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}
