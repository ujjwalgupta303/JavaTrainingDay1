package reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		StringBuffer tmp = new StringBuffer(s);
		tmp.reverse();
		System.out.println(tmp);
	}

}
