package two;
import java.util.Scanner;


public class Ujji {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int ans=num;
		while((num-1)>0)
		{
			ans*=(num-1);
			num--;
		}
		System.out.println(ans);
	}
}
