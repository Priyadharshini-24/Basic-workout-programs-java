package test;
import java.util.Scanner;
public class Mutibletable {
	public static void main(String[] args) {
	int n,l,r;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter which table u want: ");
	n=s.nextInt();
	System.out.println("enter the limit:");
	l=s.nextInt();
	s.close();
	for(int i=1;i<=l;i++)
	{
		r=i*n;
		System.out.println(i+"*"+n+"="+r);
	}
	}

}
