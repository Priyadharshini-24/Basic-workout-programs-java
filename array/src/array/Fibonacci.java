package array;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {

        int n, t1 = 0, t2 = 1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit:");
        n=s.nextInt();
        s.close();
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; i++)
        {
        	
            int sum = t1 + t2;
            System.out.println(t1);
            t1 = t2;
            t2 = sum;
            
        }
    }
}
