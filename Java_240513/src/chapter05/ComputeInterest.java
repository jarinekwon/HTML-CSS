package chapter05;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		
		int principal;
		double rate;
		double balance;
		int years = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원금을 입력하세요: ");
		principal = scan.nextInt();
		System.out.print("연이율을 입력하세요: ");
		rate = scan.nextDouble();
		balance = principal;
		System.out.println("연도수\t원리금");
		
		do {
			years++;
			balance = balance * (1.0 + rate / 100.0);
			System.out.println(years + "\t"  + balance);
		} while (balance <= 2 * principal);
		System.out.println("\n필요한 연도수=" + years);
		
		scan.close();
	}
}
