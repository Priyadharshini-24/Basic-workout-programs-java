package test;
import java.util.Scanner;
public class Xmarkarray {
	String sclname="SYED AMMAL HR SEC SCHOOL RAMANATHAPURAM",medium="TAMIL" ;
	String dofp="MAR2013";
	String stdname,tcn;
	int sc,bd,bm,by,regno;String tcndate="31/05/2013";
	int a[]=new int[6];
	void get()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Name of the Student:");
	stdname=s.nextLine();
	System.out.println("Enter TMR CODE NO:");
	tcn=s.nextLine();
	System.out.println("Enter the Marks in order:");
	for(int i=0;i<6;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Enter your Date of Birth like Day& month& year one by one");
	bd=s.nextInt();
	bm=s.nextInt();
	by=s.nextInt();
	System.out.println("Enter Student RegisterNo:");
	regno=s.nextInt();
	System.out.println("");
	}
	void print()
	{
		System.out.println("              SECONDARY SCHOOL LEAVING CERTIFICATE            ");
		System.out.println("");
		System.out.println("                        X STANDARD              ");
		System.out.println("");
		System.out.println("Candidate Name:"+stdname +"     "+"Passing Month and Year:"+dofp);
		System.out.println("");
		System.out.println("________________________________________________________________");
		System.out.println();
		System.out.println("SUBJECT.............. MAXMARKS......... MARKS OBTAINED");
		System.out.println("");
		if(a[0]>=35) 
			System.out.println("TAMIL                 100                "+a[0] +"    (P)");
		else
			System.out.println("TAMIL                 100                "+a[0] +"    (F)");
		if(a[1]>=35)
			System.out.println("ENGLISH               100                "+a[1] +"    (P)");
		else
			System.out.println("ENGLISH               100                "+a[1] +"    (F)");
		if(a[2]>=35)
			System.out.println("MATHEMATICS           100                "+a[2] +"    (P)");
		else
			System.out.println("MATHEMATICS           100                "+a[2] +"    (F)");
		System.out.println("");
			System.out.println("SCIENCE THEORY    "+a[3]);
			System.out.println("SCIENCE PRACTICAL "+a[4]);
			sc=a[3]+a[4];
			if(sc>=35)
				System.out.println("SCIENCE               100                "+sc +"    (P)");
			else
				System.out.println("SCIENCE               100                "+sc +"    (F)");
			if(a[5]>=35)
				System.out.println("SOCIAL SCIENCE        100                "+a[5] +"    (P)");
			else
				System.out.println("SOCIAL SCIENCE        100                "+a[5] +"    (F)");
			System.out.println("________________________________________________________________");
			System.out.println();
			int tot=a[0]+a[1]+a[2]+a[3]+a[4]+a[5];
			if(a[0]>=35 && a[1]>=35 && a[2]>=35 && sc>=35 && a[5]>=35)
				System.out.println("TOTAL                 500                "+tot +"  (PASS)");
			else
				System.out.println("TOTAL                 500                "+tot +"  (FAIL)");
			
			System.out.println("________________________________________________________________");
			System.out.println("");
			System.out.println("DATE OF BIRTH........REGISTER NO.......TMR CODE NO& DATE");
			System.out.println();
			System.out.println(bd+"/"+bm+"/"+by+"            "+regno+"           "+tcn+" "+tcndate);
			System.out.println("________________________________________________________________");
			System.out.println("");
			System.out.println("...............MEDIUM OF INSTRUCTION................");
			System.out.println("");
			System.out.println("                      "+medium+"                    ");
			System.out.println("________________________________________________________________");
			System.out.println();
			System.out.println("..................NAME OF THE SCHOOL................");
			System.out.println("");
			System.out.println("             "+sclname+"          ");
		
	}

	public static void main(String[] args) {
		Xmarkarray xm=new Xmarkarray();
		xm.get();
		xm.print();
	}

}
