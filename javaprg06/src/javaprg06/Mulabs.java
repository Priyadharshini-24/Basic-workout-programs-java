package javaprg06;
import java.util.Scanner;
public abstract class Mulabs {
	abstract void get();
	abstract void print();
}
class Mulmain extends Mulabs
{
	int n,l;
	void get()
	{
		 Scanner s=new Scanner(System.in);
	        System.out.println("enter the number:");
	        n=s.nextInt();
	        System.out.println("enter the limit:");
	        l=s.nextInt();
	        s.close();
		
	}
	void print()
	{
		 System.out.println("The Table is:");
	        for(int i = 1; i <=l; i++)
	        {
	        	
	            System.out.printf("%d * %d = %d \n",i,n, i*n);
	        }
		
	}

	public static void main(String[] args) {
		
		Mulabs mb=new Mulmain();
		mb.get();
		mb.print();

	}

}
