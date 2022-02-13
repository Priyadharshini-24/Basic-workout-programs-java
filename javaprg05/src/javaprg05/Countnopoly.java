package javaprg05;
import java.util.Scanner;
public class Countnopoly {
	 int  i= 0, n;
	 void get()
	 {
		 Scanner s=new Scanner(System.in);
		    System.out.println("Enter the number:");
		    n=s.nextInt();
		    s.close();
	 }
	 void print()
	 {
		 while (n != 0) {
		      
		      n =n/10;
		      i++;
		    }

		    System.out.println("Number of digits: " + i);
		  }
	 

	public static void main(String[] args) {
	Countnopoly c=new Countnopoly();
	c.get();
	c.print();
	}

}
