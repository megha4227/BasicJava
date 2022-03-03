package simplejavaprograms;
import java.util.Scanner;
public class OddNum {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the n value");
	int n=s.nextInt();
	System.out.println("Print the odd numbers from 1 to n");
	int i=1;
	while(i<n)
	{
	if(i%2!=0)
	{
		System.out.println(i);
	}
	i++;
	}

}
}