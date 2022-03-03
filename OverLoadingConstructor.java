package Overloading;
public class OverLoadingConstructor {
	int num1;
	int num2;
	String operation;

	public OverLoadingConstructor()
	{
		num1=0;num2=0;
		operation="nothing";
		System.out.println("no value to print");
	}
	public OverLoadingConstructor(int i)
	{
		num1=i;
		num2=0;
		operation="nothing";
		System.out.println(i);
	}
	public OverLoadingConstructor(int i, int j)
	{
		num1=i;
		num2=j;
		operation="nothing";
		System.out.println(i+j);
	}
	public OverLoadingConstructor(int i, int j,String op)
	{
	num1=i;
	num2=j;
	operation=op;
	System.out.println(op+ " Operation: "+i+j);
	}


	public static void main(String[] args)
	{
		new OverLoadingConstructor( 4,5,"Add");
		new OverLoadingConstructor(3,22);
		new OverLoadingConstructor(55);
		new OverLoadingConstructor();
	}
}


