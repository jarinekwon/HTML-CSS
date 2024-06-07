package chapter03;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("구매 금액을 입력하세요: ");
		int p = scan.nextInt();
		int b = 0;
		
		if (p >= 300000) {
			b = p - 30000;
			System.out.println("구매금액 = " + p);
			System.out.println("청구금액 = " + b);
		}
		else if (p >= 100000) {
			b = p - 5000;
			System.out.println("구매금액 = " + p);
			System.out.println("청구금액 = " + b);
		}
		else {
			b = p;
			System.out.println("구매금액 = " + p);
			System.out.println("청구금액 = " + b);
		}
		scan.close();
	}
}
