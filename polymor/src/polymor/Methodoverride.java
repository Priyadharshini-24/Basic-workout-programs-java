package polymor;

public class Methodoverride {
	void compile()
	{
		System.out.println("compiling.....");
	}
	void run()
	{
		System.out.println("running....");
	}
}
	class Method extends Methodoverride{
		void run()
		{
			System.out.println("running succesfully.....");
		}

	
}
