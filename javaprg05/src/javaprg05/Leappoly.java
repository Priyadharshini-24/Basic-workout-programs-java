package javaprg05;
import java.util.Scanner;
public class Leappoly {
	int year;
	void get()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the year u want to check:");
		year=s.nextInt();
		s.close();
	}
	void print()
	{
		if(year%4==0)
		{
			System.out.println(year+" is a Leap year");
		}
		else
		{
			System.out.println(year+" is not a Leap year");
		}
	}
	public static void main(String[] args) {
	   Leappoly lp=new Leappoly();
	   lp.get();
	   lp.print();
   }

}
