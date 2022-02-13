package array;

import java.util.Scanner;
public class Smallestno
{
    public static void main(String[] args) 
    {
        int n1, n2, n3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        n1 = scanner.nextInt();
        System.out.println("Enter Second Number:");
        n2 = scanner.nextInt();
        System.out.println("Enter Third Number:");
        n3 = scanner.nextInt();
        scanner.close();
        
        if(n1 <= n2) {
            if(n1 <= n3)
                System.out.println(n1 + " is the Smallest number.");
            else
                System.out.println(n3 + " is the Smallest number.");
        } else {
            if(n2 <= n3)
                System.out.println(n2 + " is the Smallest number.");
            else
                System.out.println(n3 + " is the Smallest number.");
        }
        
    }
}

