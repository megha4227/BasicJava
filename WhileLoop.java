package simplejavaprograms;

public class WhileLoop {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3) {
				continue;/*skips the iteration and goes next 3 gets skipped*/
		}
		System.out.println(i);
	}

}
}
