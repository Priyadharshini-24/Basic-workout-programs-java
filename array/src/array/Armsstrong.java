package array;

public class Armsstrong {
public static void main(String[] args)
{
 int n = 153; 
 int t, d, dcSum = 0;
 t = n;
 while (t != 0)
{
System.out.println("Current No is "+t);
    d =t % 10;
   System.out.println("Current Digit is "+d);
		            
 dcSum = dcSum + d*d*d;
 System.out.println("Current digitCubeSum is "+dcSum);
  t=t/ 10;
     }
 if(dcSum == n)
 {
	 System.out.println("");
 System.out.println(n + " is an Armstrong Number");
 }
 else
 {
 System.out.println(n + " is not an Armstrong Number");	 
 }
}
}
	 
	

