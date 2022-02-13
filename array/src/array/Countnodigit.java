package array;
import java.util.Scanner;
public class Countnodigit {
	 public static void main(String[] args) {

		    int  i= 0, n;
		    Scanner s=new Scanner(System.in);
		    System.out.println("Enter the number:");
		    n=s.nextInt();
		    s.close();
		    while (n != 0) {
		      
		      n =n/10;
		      i++;
		    }

		    System.out.println("Number of digits: " + i);
		  }
		}


