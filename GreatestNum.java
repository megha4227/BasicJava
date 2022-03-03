package simplejavaprograms;

public class GreatestNum {
	public static void main(String[] args)
	{
		int num1=5; int num2=10; int num3=4;
		int greatest=num1>num2 ? (num1>num3 ? num1: num3) : (num2>num3 ? num2 :num3);
		System.out.println(greatest);
	}

}
