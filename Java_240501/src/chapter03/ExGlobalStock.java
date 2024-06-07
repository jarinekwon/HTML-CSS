package chapter03;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("매수 금액을 입력하세요: ");
			int b = scan.nextInt();
		System.out.print("매도 금액을 입력하세요: ");
			int s = scan.nextInt();
			
			double t = 0;
		
		if (s > b) {
			
			t = (s - b) * 0.22;
			System.out.println("양도세 = " + t);
		}
		else {
			System.out.println("양도세 = 0");
		} 
			
		
		
		scan.close();
		
		
	}
}
