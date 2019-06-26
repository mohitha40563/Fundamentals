package Fundamentals;

public class Commandarg {
	
	public static void main(String args[])
	{
		if(args.length==0)
			System.out.println("No value");
		else
		{
			for(String i :args)
				System.out.println(i+",");
		}
	}

}
