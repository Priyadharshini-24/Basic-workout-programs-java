package abstractmain;

public class Bankmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new CUB();
		Bank b1=new SBI();
		Bank b2=new BOI();
	b.name();
	System.out.println("SBI BANK interest..."+b1.interest());
	System.out.println("CUB BANK interest..."+b.interest());
	System.out.println("BOI BANK interest..."+b2.interest());
	}

}
