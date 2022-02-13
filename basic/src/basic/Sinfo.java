package basic;

import java.util.Scanner;

public class Sinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Student Nmae:");
		String name = input.next();
		System.out.println("School Name:");
		String sname = input.next();
		System.out.println("mark 1:");
		int m1 = input.nextInt();
		System.out.println("mark 2:");
		int m2 = input.nextInt();
		System.out.println("mark 3:");
		int m3 = input.nextInt();
		float t=m1 + m2 + m3;
		float avg = t / 3;
		System.out.println("STUDENT NAME:" + name);
		System.out.println("SCHOOL NAME:" + sname);
		System.out.println("MARK 1:" + m1);
		System.out.println("MARK 2:" + m2);
		System.out.println("MARK 3:" + m3);
		System.out.println("TOTAL:" + t);
		System.out.println("AVERAGE:" + avg);
		input.close();
	}

}
