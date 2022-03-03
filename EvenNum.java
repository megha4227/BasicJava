package simplejavaprograms;
import java.util.Scanner;
public class EvenNum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		{
		System.out.println("Enter the n values");
		int n=sc.nextInt();
		System.out.println("Enter the even numbers between 1 and n:");
		int i=1;
		while(i<=n)
		{
		if(i%2==0)
		{
			System.out.println("Even numbers are:" +i);
		}
		i++;
		}
		}
	}

}
