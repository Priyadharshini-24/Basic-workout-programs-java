package javaprg04;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
	    int  n;
	    System.out.println("Enter the no u want to check:");
	    n=s.nextInt();
	    s.close();
	    boolean r=false;
	    for (int i = 2; i <= n / 2; i++) {
	    	if(n%i==0)
	    	{
	    	r=true;
	    	break;
	    }}
	      if (r=false) 
	      
	      System.out.println(n + " is  a prime number.");
	      
	    else
	    
	      System.out.println(n + " is not a prime number.");
	  }
	    }




