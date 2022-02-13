
public class Statex {
	int idno;
	String name;
  static String cmpname="TCS";
	Statex(int i,String n)
	{
		idno=i;
		name=n;
		}

	void disply()
	{
		System.out.println("emp id:"+idno);
		System.out.println("emp name:"+name);
		System.out.println("campany name:"+cmpname);
		
	}

	public static void main(String[] args) {
		Statex s1=new Statex(202014,"preetha");
 Statex s2=new Statex(202015,"sheela");
 s1.disply();
 s2.disply();
 }

}
