package javaprg05;
import java.util.Scanner;
public class Oddpoly {
	int n;
	void get()
	{
		 Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	         n = s.nextInt();
	       s.close();
	}
	void checkprint()
	{
		if(n % 2 == 0)
            System.out.println(n + " is an even number");
        else
            System.out.println(n + " is an odd number");
	}
	public static void main(String[] args) {
		Oddpoly o=new Oddpoly();
		o.get();
		o.checkprint();
	}

}
