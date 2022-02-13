package javaprg05;
import java.util.Scanner;
public abstract class Largenoabs {
	abstract void getdetails();
	abstract void printdetails();
}
 class Largemain extends Largenoabs
{
	 int n1,n2,n3;
	void getdetails()
	{
	Scanner	s=new Scanner(System.in);
	System.out.println("Enter the first number:");
	n1=s.nextInt();
	System.out.println("Enter the Second number:");
	n2=s.nextInt();
	System.out.println("Enter the third number:");
	n3=s.nextInt();
	s.close();
	}
	void printdetails()
	{
		if(n1>=n2)
		{
			if(n1>=n3)
			    System.out.println(n1+" is the largest number");
			else
				System.out.println(n3+" is the largest number");
		}
		else
		{
		   if(n2>=n3)
			  System.out.println(n2+" is the largest number");
		   else
		      System.out.println(n3+" is the largest number");
		}
	}

	public static void main(String[] args) {
		Largenoabs l=new Largemain();
		l.getdetails();
		l.printdetails();
	}

}
