package Overloading;
class Value
{
	public Value(double a)
	{
		System.out.println(4*a);
	}
	public Value(double a, double b)
	{
		System.out.println(5*a*b);
	}
}
public class Program3 {
	public static void main(String[] args)
	{
		new Value(20.5);
		new Value(10,5.6);
	}

}
