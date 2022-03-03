package simplejavaprograms;

public class PrePostIncrement {
public static void main(String[] args)
{
	int val1=12;
	int val2=10;
	int res=++val1;
	System.out.println("preincrement"+val1);
	int res1=val1++;
	System.out.println("postincrement"+val1);
	int res3=++val2;
	System.out.println("preincrement"+val2);
	int res4=val2++;
	System.out.println("postincrement"+val2);
	int res5=--val1;
	System.out.println("predecrement"+val1);
	int res6=val1--;
	System.out.println("postdecrement"+val1);
	val1+=val2;
	System.out.println(val1);
}
}
