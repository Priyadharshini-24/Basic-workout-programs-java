package array;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
    	int n;
        long fact=1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=s.nextInt();
        s.close();
        for(int i = 1; i <= n; i++)
        {
           
            fact = fact*i;
        }
        System.out.printf("Factorial of %d = %d", n, fact);
    }
}