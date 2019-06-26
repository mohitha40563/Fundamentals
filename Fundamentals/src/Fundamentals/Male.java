package Fundamentals;

public class Male {

	public static void main(String args[])
	{
		String g=args[0];
		int a=Integer.parseInt(args[1]);
		
	    if(g.equals("female"))
	    {
	    	if(a>1 && a<58)
	    		System.out.println("percentage of interest is 8.2%");
	    	else
	    		System.out.println("percentage of interest is 9.2%");
	    }
		
		
		if(g.equals("male"))
		{
		if(a>1 && a<58)
		System.out.println("precentage of intrest is 8.4 %");
		if(a>59 && a<100)
		System.out.println("precentage of intrest is 10.5%");
		}
	}
}
