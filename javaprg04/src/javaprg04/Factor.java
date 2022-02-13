package javaprg04;
import java.util.Scanner;
public class Factor {
	
	  public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	    int n;
       System.out.println("Enter the limit:");
       n=s.nextInt();
       s.close();
	    System.out.print("Factors of " + n + " are: ");
	    
	    for (int i = 1; i <= n; i++) {
	    
	      if (n % i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	  }
	}



