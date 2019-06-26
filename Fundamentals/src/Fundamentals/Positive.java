package Fundamentals;

public class Positive {

	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if(a>0)
			System.out.println(args[0]+" is Positive number");
		else if (a<0)
			System.out.println(args[0]+" is Negative number");
		else
			System.out.println("Zero");
		
		}

}
