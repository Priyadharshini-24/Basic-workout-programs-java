package array;
import java.util.Scanner;
public class Posneg {
	
	    public static void main(String[] args) {

	        double n;
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter the Number:");
	        n=s.nextDouble();
	        s.close();
	        if (n < 0)
	            System.out.println(n + " is a negative number.");
	        else if ( n >0)
	            System.out.println(n + " is a positive number.");
	        else
	            System.out.println(n + " is 0.");
	    }
	}


