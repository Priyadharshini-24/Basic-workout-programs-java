package array;
import java.util.Scanner;
public class Leap1 {
	public static void main (String args[])
	{
		int year;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the year u want to check:");
		year=s.nextInt();
		s.close();
		if(year%4==0)
		{
			System.out.println(year+" is a Leap year");
		}
		else
		{
			System.out.println(year+" is not a Leap year");
		}
		
	}
	

}
