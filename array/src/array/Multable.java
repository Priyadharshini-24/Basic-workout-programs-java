package array;
import java.util.Scanner;
public class Multable 
 {

    public static void main(String[] args) {

        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        n=s.nextInt();
        s.close();
        System.out.println("The Table is:");
        for(int i = 1; i <= 10; i++)
        {
        	
            System.out.printf("%d * %d = %d \n",i,n, i*n);
        }
    }
}
