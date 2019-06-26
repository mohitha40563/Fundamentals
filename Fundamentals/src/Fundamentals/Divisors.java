package Fundamentals;

public class Divisors {

	public static void main(String args[])
	{
		int c=0,i=0,f;
		
		while(c<=5)
		{
			f=0;
			if(i%2==0 && i%3==0 && i%5==0)
			{
				f=1;
				c++;
			}
		    if(f==1)
		    {
		    	System.out.println(i);
		    }	
			i++;
			
		}
	}
}
