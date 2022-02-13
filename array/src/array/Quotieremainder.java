package array;
import java.util.Scanner;
public class Quotieremainder {
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
		    int  dend, dvsor,q,r;
		    System.out.println("Enter Divident:");
            dend=s.nextInt();
            System.out.println("Enter Divisor:");
            dvsor=s.nextInt();
            s.close();
		     q = dend / dvsor;
		     r = dend % dvsor;

		    System.out.println("Quotient = " + q);
		    System.out.println("Remainder = " + r);
		  }
		}

