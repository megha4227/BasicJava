package ProgramsOnOverriding;
class A{
	public int a;
	public int method() {
		return 4;
	}
	public void method1() {
		System.out.println("This is class A method");
	}
}
 class B extends A{
	 public void method1()
	 {
	System.out.println("This is class B method");	 
	 }
	
}

public class Pgr1 {
	public static void main(String[] args)
	{
		A obj=new A();
		B obj1=new B();
		obj.method1();
		obj1.method1();
	
	}

}
