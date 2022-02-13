package array;
import java.util.Scanner;
public class Alphacheck {
	    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
	        char ch;
	        System.out.println("Enter Any Character:");
	        ch=s.next().charAt(0);
	        s.close();

	        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
	            System.out.println(ch + " is vowel");
	        else
	            System.out.println(ch + " is consonant");

	    }
	}


