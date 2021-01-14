package seven;

public class Ujji {
	static void fun(int num)
	{
		if(num>10)
			return;
		System.out.println(num);
		fun(num+1);
	}
	public static void main(String[] args)
	{
		fun(1);
	}
}
