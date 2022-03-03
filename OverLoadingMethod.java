package Overloading;

class Casio {
	public void add(int i)
	{
		System.out.println(i);
	}
public void add(int i,int j)
{
	System.out.println(i+j);
}
public void add(int i,int j,int k) 
	{
	System.out.println(i+j+k);	
	}
}
public class OverLoadingMethod
{
	public static void main(String[] args)
	{
		Casio obj=new Casio();
		obj.add(10,5,7);
		obj.add(10,25);
		obj.add(50);
	}
}

