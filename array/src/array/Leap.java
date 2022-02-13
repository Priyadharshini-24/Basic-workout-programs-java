package array;
import java.util.Scanner;
public class Leap {
	    public static void main(String[] args) {

	    	int y;
	    	Scanner s = new Scanner(System.in);
	    	System.out.println("Enter any Year:");
	    	y = s.nextInt();
	    	s.close();
	        boolean isLeap = false;

	        if(y % 4 == 0)
	        {
	        
	                    isLeap = true;
	                
	        }

	        if(isLeap==true)
	            System.out.println(y + " is a Leap Year.");
	        else
	            System.out.println(y + " is not a Leap Year.");
	    }
	}



