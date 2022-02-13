package javaprg04;
import java.util.Scanner;
public class Revpyramid {
	  public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	    int n;
  System.out.println("Enter the no rows:");
  n=s.nextInt();
  s.close();
	    for (int i =n; i >= 1; i--) {
	      for (int j = 1; j <= i;j++) {
	        System.out.print("* ");
	      }
	      System.out.println();
	    }
	  }


}
