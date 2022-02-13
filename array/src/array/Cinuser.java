package array;
import java.util.Scanner;
public class Cinuser {

	public static void main(String[] args) {
		int p,t,n;
		double r;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Principal Amount:");
	p=s.nextInt();
	System.out.println("Enter the Time Period:");
	t=s.nextInt();
	System.out.println("Enter the number of times interest applied per time period:");
	n=s.nextInt();
	System.out.println("Enter the Interest Rate:");
	r=s.nextDouble();
	double a=p * Math.pow(1+(r/n),n*t);
	double ci=a-p;
	System.out.println("Amount After "+t+" years: "+a);
	System.out.println("Compount Interest After "+t+" years: "+ci);
	s.close();
	}

}
