package chapter02;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		
		System.out.print("2개의 정수 입력>>");
		Scanner scan = new Scanner(System.in);
		
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		
		System.out.println("두 수의 합은 " + (a1+a2));
		System.out.println("두 수의 곱은 " + (a1*a2));
		
		scan.close();
	
	}
}
