package Fundamentals;

public class Colour
{
	public static void main(String args[])
	{
		char c=args[0].charAt(0);
		switch(c)
		{
		case 'R' : System.out.println("RED");
		            break;
		case 'G' : System.out.println("GREEN");
                    break;

		case 'O' : System.out.println("ORANGE");
	
		            break;

		case 'Y' : System.out.println("YELLOW");
		            break;
		case 'W' : System.out.println("WHITE");
                    break;
        default: System.out.println("invalid - please enter vaild colour");
                 break;
		}
	}

}
