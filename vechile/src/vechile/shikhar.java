package vechile;
import java.util.*; 

class Parent {
	int b=20;
	
}

class Ujji extends Parent {
	int c=190;
	public void fun()
	{
		System.out.println(c);
		System.out.println(super.b);
	}
}
 
public class shikhar {
	
	
	public static void main(String[] args)
	{
//		System.out.println("Example of SUPER keyword");
//		Ujji obj= new Ujji();
//		obj.fun();
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%2==0)
			System.out.println("It is even");
		else
			System.out.println("It is odd");
		
		if(num<0)
			System.out.println("It is negative");
		else
			System.out.println("It is positive");
	}
}
