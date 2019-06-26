package Fundamentals;

public class Palindrome {
	
	public static void main(String args[])
	{
		int r,s=0,t;
		int n=Integer.parseInt(args[0]);
		
		t=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
			
		}
		if(t==s)
			System.out.println(args[0]+" is palindrome");
		else
			System.out.println(args[0]+" is not palindrome");
	}

}
