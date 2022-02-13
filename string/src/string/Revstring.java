package string;
import java.util.Scanner;
public class Revstring {

	public static void main(String[] args) {
		String n,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		n=s.nextLine();
		int l=n.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+n.charAt(i);
		}
      System.out.println("Reverse String is:"+rev);
      s.close();
	}

}
