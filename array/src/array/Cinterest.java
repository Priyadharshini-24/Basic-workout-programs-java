package array;

public class Cinterest {

	    public void calculate(int p, int t, double r, int n) {
	        double a = p * Math.pow(1 + (r / n), n * t);
	        double cinterest = a - p;
	        System.out.println("Compound Interest after " + t + " years: "+cinterest);
	        System.out.println("Amount after " + t + " years: "+a);
	    }
	    public static void main(String args[]) {
	    	Cinterest obj = new Cinterest();
	    	obj.calculate(2000, 5, .08, 12);
	    }
	}


