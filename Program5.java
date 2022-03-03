package Overloading;
class A
{
	public void num(int a) {
		System.out.println(20*a);
		
	}
	public void num(int a,int b) {
	System.out.println(3*a+b);	
	}
	public void num(int a,int b,int c)
	{
		System.out.println(11*a+b+c);
	}
}
public class Program5 {
	public static void main(String[] args)
	{
		A obj=new A();
		obj.num(12);
		obj.num(20,10);
		obj.num(22,6,12);
	}

}
