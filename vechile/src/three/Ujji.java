package three;

import java.util.Scanner;

public class Ujji {
	static int findFac(int num)
	{
		if(num==0)
			return 1;
		return num*findFac(num-1);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int ans=findFac(num);
		System.out.println(ans);
	}
}
