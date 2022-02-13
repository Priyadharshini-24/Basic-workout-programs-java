package javaprg04;
import java.util.Scanner;
public class Recursion {


	    public static void main(String[] args) {
	        int n;
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the limit:");
	        n=s.nextInt();
	        s.close();
	        //mulNum is a recursive method name
	        long fact = mulNum(n);
	        System.out.println("Factorial of " + n + " = " + fact);
	    }
	    public static long mulNum(int v)
	    {
	        if (v >= 1)
	            return v * mulNum(v - 1);
	        else
	            return 1;
	    }
	}


