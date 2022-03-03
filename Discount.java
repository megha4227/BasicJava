package simplejavaprograms;

public class Discount {
	public static void main(String[] args)
	{
		int val=6500;
		int finalVal=val<5000 ? val-100 :val-300;
		System.out.println(finalVal);
	}

}
