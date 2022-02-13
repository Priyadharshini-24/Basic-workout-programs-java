package array;
import java.util.Scanner;
public class Revarray 
{
	   public static void main(String args[])
	   {
		int count, i=0, j=0, temp;
		int num[] = new int[100];
		Scanner s=new Scanner(System.in);
		System.out.print("How many elements you want to enter: ");
		count = s.nextInt();
		for(i=0; i<count; i++)
		{
		    System.out.print("Enter Array Element"+(i+1)+": ");
		    num[i] = s.nextInt();
		}
		j = i - 1;     
		i = 0;         
		while(i<j)
		{
	  	   temp = num[i];
		   num[i] = num[j];
		   num[j] = temp;
		   i++;
		   j--;
		}

		System.out.print("Reversed array: ");
		for(i=0; i<count; i++)
		{
		   System.out.print(num[i]+ "  ");
		} 
		s.close();
	   }
	}


