package polymor;

public class Methodoverload {

	
	void math()
	{
		System.out.println("method overloading example");
	}
	void math(int tot)
	{
	System.out.println("Total");
	System.out.println(tot);
	}
	void math(int m1,int m2)
	{
		System.out.println("add two numbers");
		System.out.println(m1+m2);
	}
	void math(int m3,int m4,int m5)
	{
	System.out.println("add three numbers");	
	System.out.println(m3 +m4+m5);
	}
	public static void main(String[] args) {
		Methodoverload m=new Methodoverload();
		m.math();
		m.math(85,90);
		m.math(92,97,78);
		m.math(442);

	}
}
