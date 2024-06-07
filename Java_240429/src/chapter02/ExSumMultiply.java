package chapter02;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		
		System.out.print("3자리수 정수 입력(100~999)>>");
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int hun = n / 100; // 100의 자리수
		int ten = (n % 100) / 10; // 10의 자리수
		int one = (n % 100) % 10; // 1의 자리수
		
		int sum = hun + ten;
		int multiply = ten * one;
		
		if(hun != 0) {
			System.out.println("100의 자리와 10의 자리의 합은 " + sum);
			System.out.println("10의 자리와 1의 자리의 곱은 " + multiply);
		}
		
		scan.close();
		
	}
}
