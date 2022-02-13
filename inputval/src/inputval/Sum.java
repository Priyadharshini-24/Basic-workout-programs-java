package inputval;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args)
	{
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	System.out.println("enter a value:");
	int b=input.nextInt();
	System.out.println("enter b value:");
	int c=a+b;
	System.out.println("Result is:"+c);
	input.close();
	
}
}
