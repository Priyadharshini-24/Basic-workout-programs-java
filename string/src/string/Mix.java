package string;
import java.util.Scanner;
public class Mix {

	public static void main(String[] args)throws Exception
	{
	int i=0;
	String n,rev="";
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	n=s.nextLine();
	char c[]=n.toCharArray();
	for(char ch:c)
	{
		i++;
	}
	System.out.println("String length is:"+i);
	int l=n.length();
	for(int j=l-1;j>=0;j--)
	{
		rev=rev+n.charAt(j);
	}
	
	System.out.println("Reverse String is:"+rev);
	s.close();
	}

}
