package removeWhiteSpace;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println(s.replaceAll("\\s", ""));
	}

}
