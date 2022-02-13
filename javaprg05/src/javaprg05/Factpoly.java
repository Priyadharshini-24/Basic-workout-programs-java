package javaprg05;
import java.util.Scanner;
public class Factpoly {
	int n;
    long fact=1;
    void get()
    {
    	Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=s.nextInt();
        s.close();
    }
    void print()
    {
    	 for(int i = 1; i <= n; i++)
         {
            
             fact = fact*i;
         }
         System.out.println("Factorial of "+n +" is "+ fact);
    }

	public static void main(String[] args) {
		Factpoly f=new Factpoly();
	f.get();
	f.print();
	}

}
