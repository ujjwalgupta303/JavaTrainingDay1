package palindrome;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
//		StringBuffer tmp = new StringBuffer(s);
//		tmp.reverse();
//		String tempString=tmp.toString();
//		if(tempString==s)
//		{
//			System.out.println("Its a palindrome");
//		}
//		else
//		{
//			System.out.println("Its not a palindrome");
//		}
		
		
		
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				System.out.println("Not a Palindrome");
				return;
			}
		}
		System.out.println("Its a Palindrome");
		sc.close();
	}
}
