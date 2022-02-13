package oopsbasic;

public class Sclinfo {
	void sclinfo()
	{
	
		String tname="meera";
		String sname="krishna school";
		System.out.println("Student teacher name:"+tname);
		System.out.println("Student school name:"+sname);
	
	}
	
}
 class Stud extends Sclinfo{
	 void stud()
	 {

	String stname="dia";
	int rollno=04;
	System.out.println("Student name:"+stname);
	System.out.println("Student roll no:"+rollno);
	 }
	
}
 class Exam extends Stud
{
	 void exam()
	 {
		int m1=96,m2=98,m3=88,tot;
		tot=m1+m2+m3;
		float per;
		per=tot/3;
		System.out.println("Student mark1:"+m1);
		System.out.println("Student mark2:"+m2);
		System.out.println("Student mark3:"+m3);
		System.out.println("total marks:"+tot);
		System.out.println("student percentage:"+per);
		
	}
}



	