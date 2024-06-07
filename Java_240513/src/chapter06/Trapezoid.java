package chapter06;

import java.util.Scanner;


public class Trapezoid {
	
	double down;
	double up;
	double height;
	
	public double getArea() {
		return (up+down)/2*height;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Trapezoid t = new Trapezoid();
		System.out.print(">>");
		t.down = scan.nextDouble();
		t.up = scan.nextDouble();
		t.height = scan.nextDouble();
		
		System.out.println("사다리꼴의 면적은 " + t.getArea());
		scan.close();
	}
}
