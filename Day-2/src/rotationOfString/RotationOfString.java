package rotationOfString;

import java.util.*;

public class RotationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		
		String tmp=s1+s1;
//		System.out.println(tmp);
		if(tmp.contains(s2))
			System.out.println("s1 & s2 are rotation of each other");
		else
			System.out.println("Theay are not rotation of each other");
	}

}
