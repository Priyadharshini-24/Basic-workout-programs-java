package array;
import java.util.Scanner;
public class Palindrom
{
	   public static void main(String args[])
	   {
	      String rev="";
	      Scanner s = new Scanner(System.in);

	      System.out.println("Enter a string to check if it is a palindrome:");
	      String n = s.nextLine();

	      int l = n.length();

	      for ( int i = l - 1 ; i >= 0 ; i-- )
	         rev = rev + n.charAt(i);

	      if (n.equals(rev))
	         System.out.println("Input string is a palindrome.");
	      else
	         System.out.println("Input string is not a palindrome.");

	   s.close();
	   }}


