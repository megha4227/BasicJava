package simplejavaprograms;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your dishcode");
		int n=s.nextInt();
		if( n==1)
			System.out.println("You have ordered Masala Dosa");
		else if(n==3)
		System.out.println("You have ordered Paper Masala Dosa");
		else if(n==4)
			System.out.println("You have ordered Rava Dosa");
		else if(n==7)
			System.out.println("You have ordered Mysore Masala Dosa");
		switch(n)
		{
		case 1:
			System.out.println("Masala Dosa");
			break;
		case 2:
			System.out.println("Paper Masala Dosa");
			break;
		case 3:
			System.out.println("Rava Dosa");
			break;
		case 4:
			System.out.println("Mysore Masala Dosa");
			break;
		}
	}
}
