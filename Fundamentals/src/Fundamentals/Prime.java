package Fundamentals;

public class Prime {

	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int c=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			System.out.println(args[0]+" is prime number");
		else
			System.out.println(args[0]+" is not prime number");
	}
}

