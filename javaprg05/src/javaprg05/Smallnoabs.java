package javaprg05;
import java.util.Scanner;
public abstract class Smallnoabs {
	   abstract void getdet();
	   abstract void printdet();
}
 class Main extends Smallnoabs
 {
 int n1, n2, n3;
	void getdet()
	{
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        n1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        n2 = scanner.nextInt();
        System.out.println("Enter Third Number:");
        n3 = scanner.nextInt();
        scanner.close();
	}
	void printdet()
	{
		if(n1<=n2)
		{
			if(n1<=n3)
				System.out.println(n1+" is the Smallest number");
			else
			    System.out.println(n3+" is the Smallest number");
		}
		else 
		{
			if(n2<=n3)
			    System.out.println(n2+" is the smallest number");
			else
				System.out.println(n3+" is the Smallest number");
		}}
	  
	public static void main(String[] args) {
		Smallnoabs m=new Main();
		m.getdet();
		m.printdet();
	}

}
