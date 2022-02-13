package abstractmain;

public abstract class Bank {
	abstract int interest();
	void name() {System.out.println("BANK interest details");}
}
class SBI extends Bank
{
	int interest()
	{ return 3;
	}
	
}
class CUB extends Bank
{
	int interest()
	{  return 2;
}
}
class BOI extends Bank
{
	int interest()
	{ return 5;
}
}