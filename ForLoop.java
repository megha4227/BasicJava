package simplejavaprograms;
/*find all possible pairs of numbers from 1 to n*/
public class ForLoop {
	public static void main(String[] args)
	{
	int n=3;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.println(i+" "+j);
		}
	}
	}

}
