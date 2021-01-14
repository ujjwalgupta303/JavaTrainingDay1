package six;

import java.util.Scanner;

public class Ujji {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num<0)
			System.out.println("It is negative");
		else
			System.out.println("It is positive");
	}
}
