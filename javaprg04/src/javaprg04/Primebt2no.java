package javaprg04;
import java.util.Scanner;
public class Primebt2no {
    public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
        int l, h;
        System.out.println("Enter ur lower limit:");
        l=s.nextInt();
        System.out.println("Enter ur higher limit:");
        h=s.nextInt();
        s.close();
        while (l < h) {
            boolean r = false;

            for(int i = 2; i <= l/2; i++) {
               
                if(l % i == 0) {
                    r = true;
                    break;
                }
            }

            if (!r && l != 0 && l != 1)
                System.out.print(l + " ");

            l++;
        }
    }



}
