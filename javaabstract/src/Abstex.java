 public abstract class Abstex {
	abstract void run();
 }
 class Honda extends Abstex
 {
	 void run()
	 {
		 System.out.println("running safely");
		
	 }
	 public static void main(String args[])
	 {
		Abstex obj=new Honda();
		obj.run();
	 }
 }


