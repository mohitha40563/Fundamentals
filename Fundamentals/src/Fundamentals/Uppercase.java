package Fundamentals;

import java.util.Scanner;

public class Uppercase
{
	
	public static void main(String args[])
	{
		int i,l;
		char s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter string");
		String str=sc.nextLine();
		
		l=str.length();
		
		for(i=0;i<l;i++)
		{
			s=str.charAt(i);
			
			if(Character.isUpperCase(s))
				System.out.print(Character.toLowerCase(s));	
		
			else
				System.out.print(Character.toUpperCase(s));
			
		}
	}

}
