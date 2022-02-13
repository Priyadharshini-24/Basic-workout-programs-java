package array;

import java.util.Scanner;
public class Largeno {
	    public static void main(String[] args) {
	    	Scanner s=new Scanner (System.in);
	        double n1, n2,n3;
            System.out.println("Enter Number1:");
            n1=s.nextDouble();
            System.out.println("Enter Number2:");
            n2=s.nextDouble();
            System.out.println("Enter Number3");
            n3=s.nextDouble();
            s.close();
	        if( n1 >= n2 && n1 >= n3)
	            System.out.println(n1 + " is the largest number.");

	        else if (n2 >= n1 && n2 >= n3)
	            System.out.println(n2 + " is the largest number.");

	        else
	            System.out.println(n3 + " is the largest number.");
	    }
	}


