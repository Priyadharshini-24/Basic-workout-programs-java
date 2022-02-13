package javaprg06;
import java.util.Scanner;
public abstract class Swapabs {
	abstract void get();
	abstract void print();
}
class Swapmain extends Swapabs
{
	int n1,n2,t;
	void get()
	{
		 Scanner s=new Scanner(System.in);
	        System.out.println("--Before swap--");
	        System.out.println("First number = " );
	        n1=s.nextInt();
	        System.out.println("Second number = ");
	        n2=s.nextInt();
	        System.out.println("First number = "+n1 );
	        System.out.println("Second number = " + n2);
	        s.close();
	}
	 void print()
	 {
		  t = n1;
	        n1= n2;
	        n2=t;
	        System.out.println("--After swap--");
	        System.out.println("First number = " + n1);
	        System.out.println("Second number = " + n2);
	 }
	

	public static void main(String[] args) {
		
		Swapabs sb=new Swapmain();
		sb.get();
		sb.print();
	}

}
