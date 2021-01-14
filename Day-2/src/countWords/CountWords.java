package countWords;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int i=0;
		
		int cnt=1;
		while(i<s.length())
		{
			if(s.charAt(i)==' ')
			{
				cnt++;
				while(s.charAt(i)==' ')
					i++;
			}
			else
			i++;
		}
		System.out.println("Count of words = "+cnt);
	}

}
