package string;
import java.util.Scanner;
public class Strlength {
	public static void main(String[] args) {
		int i=0;
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String:");
		str=s.nextLine();
		char c[]=str.toCharArray();
		for(char ch:c)
		{
			i++;
		}
		s.close();
		
System.out.println("Length of String is:"+i);
}
}
