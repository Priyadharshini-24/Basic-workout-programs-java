package basic;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("enter a:");
int a=input.nextInt();
System.out.println("enter b:");
int b=input.nextInt();
System.out.println("you entered a value...."+a);
System.out.println("you entered b value...."+b);
int c=a+b;
System.out.println("Result is..:"+c);
input.close();

	}

}
