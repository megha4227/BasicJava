package Overloading;

public class Program4 {
	public static void main(String[] args)
	{
	new Abc(5);
	new Abc(6,3);
	}

}
class Abc
{
	public Abc(int a)
	{
		System.out.println(2*a);
	}
	public Abc(int a,int b)
	{
		System.out.println(4*a*b);
	}
}
