package javaprg04;
import java.util.Scanner;
public class Power {
   public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
        int b,p;
        System.out.println("Enter base no:");
        b=s.nextInt();
        System.out.println("Enter power of the no:");
        p=s.nextInt();
        s.close();
        long r = 1;

        while (p != 0)
        {
            r =r* b;
            p--;
        }

        System.out.println("Answer = " + r);
    }
}


