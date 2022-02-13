package array;
import java.util.Scanner;
public class Swapno
 {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        float n1,n2;
        System.out.println("--Before swap--");
        System.out.println("First number = " );
        n1=s.nextFloat();
        System.out.println("First number = "+n1 );
        System.out.println("Second number = ");
        n2=s.nextFloat();
        s.close();
        float temp = n1;
        n1= n2;
        n2=temp;
        System.out.println("--After swap--");
        System.out.println("First number = " + n1);
        System.out.println("Second number = " + n2);
    }
}
