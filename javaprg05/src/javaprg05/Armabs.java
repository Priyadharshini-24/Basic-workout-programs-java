package javaprg05;
import java.util.Scanner;
public abstract class Armabs {
	abstract void get();
	abstract void print();
	abstract void check();
}
class Absmain extends Armabs
{
	int n,t,d,dcSum = 0;
	 void get()
	 {
		 Scanner s=new Scanner(System.in);
				 System.out.println("Enter the no u want to check:");
				 n=s.nextInt();
				 s.close();
				 t = n;
	 }
	 void print()
	 {
		 System.out.println("current no is:"+t);
		 while(t!=0)
		 {
			 
			 d=t%10;
			 System.out.println("current digit is"+d);
			 dcSum = dcSum+d*d*d;
			 System.out.println("Current digitCubeSum is "+dcSum);
			  t=t/ 10;
		 }
	 }
	 void check()
	 {
		 if(dcSum==n)
		 {
			 System.out.println("");
		  System.out.println(n +" is an armstrong number.");
		 }
		 else
		 {
			 System.out.println(n +" is not an armstrong number.");
		 }
	 }
	 public static void main(String args[])
	 {
		Armabs ab=new Absmain();
		ab.get();
		ab.print();
		ab.check();
	 }
	 
}
