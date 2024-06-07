package chaper03;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("코스피 지수를 입력하세요(1800~2500): ");
		int index = scan.nextInt();
		System.out.print("환율을 입력하세요(1100~1200): ");
		int rate = scan.nextInt();
		
		if (rate >= 1150) {
			if (index >= 2200) {
				System.out.print("상승장");
			}
			else if (index >= 2000) {
				System.out.print("횡보장");
			}
		}
		else if (rate < 1150) {
			if (index >= 2300) {
				System.out.print("상승장");
			}
			else if (index >= 2000) {
				System.out.print("횡보장");
			}
			else {
				System.out.print("하락장");
			}
		}
		
		scan.close();
	}
}
