package test;

public class Defaultvalue {
	
	int a;
	boolean b;
	byte c;
	short d;
	long e;
	float f;
	double g;
	char h;
	String s;
 int arr[]=new int[1]; 
	void print()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(s);
		System.out.println(arr[0]);
	}

	public static void main(String[] args) {
		Defaultvalue dv=new Defaultvalue();
		dv.print();

	}

}
