package test;
import java.util.Scanner;
public class Marksheet {
void details()
{
String sclname="SYED AMMAL HR SEC SCHOOL RAMANATHAPURAM",medium="TAMIL" ;
String dofp="MAR2013";
String stdname,tcn;
int t,e,m,sct,scp,sc,ss,bd,bm,by,regno;String tcndate="31/05/2013";
Scanner s=new Scanner(System.in);
System.out.println("Enter Name of the Student:");
stdname=s.nextLine();
System.out.println("Enter TMR CODE NO:");
tcn=s.nextLine();
System.out.println("Enter the mark of Tamil:");
t=s.nextInt();
System.out.println("Enter the mark of English:");
e=s.nextInt();
System.out.println("Enter the mark of Maths:");
m=s.nextInt();
System.out.println("Enter the mark of Science theory:");
sct=s.nextInt();
System.out.println("Enter the mark of Science practical:");
scp=s.nextInt();
System.out.println("Enter the mark of Social:");
ss=s.nextInt();
System.out.println("Enter your Date of Birth like Day& month& year one by one");
bd=s.nextInt();
bm=s.nextInt();
by=s.nextInt();
System.out.println("Enter Student RegisterNo:");
regno=s.nextInt();
System.out.println("");

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
	if(t>=35) 
		System.out.println("TAMIL                 100                "+t +"    (P)");
	else
		System.out.println("TAMIL                 100                "+t +"    (F)");
	if(e>=35)
		System.out.println("ENGLISH               100                "+e +"    (P)");
	else
		System.out.println("ENGLISH               100                "+e +"    (F)");
	if(m>=35)
		System.out.println("MATHEMATICS           100                "+m +"    (P)");
	else
		System.out.println("MATHEMATICS           100                "+m +"    (F)");
	System.out.println("");
		System.out.println("SCIENCE THEORY    "+sct);
		System.out.println("SCIENCE PRACTICAL "+scp);
		sc=sct+scp;
		if(sc>=35)
			System.out.println("SCIENCE               100                "+sc +"    (P)");
		else
			System.out.println("SCIENCE               100                "+sc +"    (F)");
		if(ss>=35)
			System.out.println("SOCIAL SCIENCE        100                "+ss +"    (P)");
		else
			System.out.println("SOCIAL SCIENCE        100                "+ss +"    (F)");
		System.out.println("________________________________________________________________");
		System.out.println();
		int tot=t+e+m+sc+ss;
		if(t>=35 && e>=35 && m>=35 && sc>=35 && ss>=35)
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

public static void main(String[] args)
{
Marksheet ms=new Marksheet();
ms.details();
}
}
