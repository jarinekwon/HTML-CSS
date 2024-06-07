package chapter03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("매수 수량을 입력하시오>>");
		int buy = scan.nextInt();
		int tesla = 520;
		int dollar = buy * tesla;
		int h = dollar / 100;
		int t = (dollar % 100) / 10;
		
		
		if (t == 0) {
			System.out.println("100달러짜리 " + h + "매");
		}
		else if (h == 0) {
			System.out.print("10달러짜리 " + t + "매");
		}
		else if (h != 0) {
			System.out.println("100달러짜리 " + h + "매");
			System.out.print("10달러짜리 " + t + "매");
		}
		
		
		
		scan.close();
		
		
		
		
		
	}
}
