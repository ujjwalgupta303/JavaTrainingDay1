package eight;

import java.util.Scanner;

public class Ujji {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int ans=0;
		while(num>0)
		{
			ans+=(num%10);
			num/=10;
		}
		System.out.print(ans);
	}
}
