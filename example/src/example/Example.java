package example;

public class Example {
	void cmmd()
	{ System.out.println("commend");
	
	}
}
class Example1 extends Example
{
	void cmmd()
	{
		System.out.println("special command");
	}
}
class Example2 extends Example1
{
	

	public static void main(String[] args) {
	Example e,e1;
	e=new Example();
	e1=new Example1();
	e.cmmd();
	e1.cmmd();

	}}

