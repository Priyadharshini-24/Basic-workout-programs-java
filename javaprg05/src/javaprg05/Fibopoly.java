package javaprg05;
import java.util.Scanner;
public class Fibopoly {
	 int n, t1 = 0, t2 = 1,s;
	 void get()
	 {
		 Scanner s=new Scanner(System.in);
	        System.out.println("Enter the limit:");
	        n=s.nextInt();
	        s.close();
	 }
	 void print()
	 {
		 System.out.print("First " + n + " terms: ");
		 for(int i=1 ; i<=n ; i++)
		 {
			s=t1+t2;
			System.out.println(t1);
			t1=t2;
			t2=s;
		 }
	 }

	public static void main(String[] args) {
		Fibopoly f=new Fibopoly();
		f.get();
		f.print();
	}

}
