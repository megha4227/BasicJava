package simplejavaprograms;
/*program keep on reducing the n number till 
 * you encounter a number divisible by 7*/

public class EncounterDivisible {
	public static void main(String[] args)
	{
		int n=20;
		while(true) {
			if(n%7==0) {
				break;
			}
			System.out.println(n);
			n--;
		}
			
	}

}
