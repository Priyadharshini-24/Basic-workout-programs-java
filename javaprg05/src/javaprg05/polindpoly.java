package javaprg05;
import java.util.Scanner;
public class polindpoly {
	String rev="";
	String n;
	void get()
	{
	      Scanner s = new Scanner(System.in);
	      System.out.println("Enter a string to check if it is a palindrome:");
	       n = s.nextLine();
	      s.close();
	}
	void condition()
	{
		 int l = n.length();

	      for ( int i = l - 1 ; i >= 0 ; i-- )
	         rev = rev + n.charAt(i);
	}
	void print()
	{
		 if (n.equals(rev))
	         System.out.println("Input string is a palindrome.");
	      else
	         System.out.println("Input string is not a palindrome.");
	}

	public static void main(String[] args) {
		polindpoly p=new polindpoly();
		p.get();
		p.condition();
		p.print();
	}

}
