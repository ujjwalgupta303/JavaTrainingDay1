package cntwordsusingsplit;

import java.util.Scanner;

public class SplitClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);
	String s= sc.nextLine();
	String[] tmp = s.split("\\s+");
	
    int ans=tmp.length;
    System.out.println(ans);
	}
};
