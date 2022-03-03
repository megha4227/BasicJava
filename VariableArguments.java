
public class VariableArguments {
	static int sum(int...arr)
	{
		int result=0;
		for(int a:arr)
		{
			result+=a;
		}
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println("The sum of 4 and 5 is "+sum(4, 5));
		System.out.println("The sum of 6,8 and 12 is "+sum(6, 7, 8));
		System.out.println("The sum of 22,10,4,6 is "+sum(22,10,4,6));
	}

}
