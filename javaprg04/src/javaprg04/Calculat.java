package javaprg04;
import java.util.Scanner;
public class Calculat {
	  public static void main(String[] args) {

		    Scanner s = new Scanner(System.in);
		    System.out.print("Enter two numbers: ");
		    double n1 = s.nextDouble();
		    double n2 = s.nextDouble();

		    System.out.println("Enter an operator (+, -, *, /): ");
		    char opt = s.next().charAt(0);
           s.close();
		    double result;

		    switch (opt) {
		      case '+':
		        result = n1 + n2;
		        break;

		      case '-':
		        result = n1 - n2;
		        break;

		      case '*':
		        result = n1 * n2;
		        break;

		      case '/':
		        result = n1 / n2;
		        break;

		      // operator doesn't match any case constant (+, -, *, /)
		      default:
		        System.out.println("Error! operator is not correct");
		        return;
		    }

		    System.out.println(n1 + " " + opt + " " + n2 + " = " + result);
		  }
		}

