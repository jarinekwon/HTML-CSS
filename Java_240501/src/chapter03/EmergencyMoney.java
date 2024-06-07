package chapter03;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		
		final int hundred = 120000;
//		상수로 100달러 원화 계산
		final int ten = 12000;
//		상수로 10달러 원화 계산
		int res, money = 0, num;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가구 수를 입력하시오>>");
		num = scan.nextInt();
		
		if (num == 1) {
			money = 400000;
		}
		else if (num == 2) {
			money = 600000;
		}
		else if (num == 3) {
			money = 800000;
		}
		else if (num >= 4) {
			money = 1000000;
		}
		
		res = money / hundred;
		
		if (res > 0) {
//			100달러가 1장 이상이면
			System.out.println("100달러짜리 " + res + "매");
		}
		
		money = money / hundred;
		res = money / ten;
		
		if (res > 0) {
//			10달러가 1장 이상이면
			System.out.println("10달러짜리 " + res + "매");	
		}
		scan.close();
	}
}

//		int family = scan.nextInt();
//		int won = 0;
//		
//		if (family >= 4) {
//			won = 1000000;
//			int dollar = won/1200;
//			int h = dollar / 100;
//			int t = (dollar % 100) / 10;
//			
//			if (t == 0) {
//				System.out.println("100달러짜리 " + h + "매");
//			}
//			else if (h == 0) {
//				System.out.print("10달러짜리 " + t + "매");
//			}
//			else if (h != 0) {
//				System.out.println("100달러짜리 " + h + "매");
//				System.out.print("10달러짜리 " + t + "매");
//			}
//		}
//		else if (family == 3) {
//			won = 800000;
//			int dollar = won/1200;
//			int h = dollar / 100;
//			int t = (dollar % 100) / 10;
//			if (t == 0) {
//				System.out.println("100달러짜리 " + h + "매");
//			}
//			else if (h == 0) {
//				System.out.print("10달러짜리 " + t + "매");
//			}
//			else if (h != 0) {
//				System.out.println("100달러짜리 " + h + "매");
//				System.out.print("10달러짜리 " + t + "매");
//			}
//		}
//		else if (family == 2) {
//			won = 600000;
//			int dollar = won/1200;
//			int h = dollar / 100;
//			int t = (dollar % 100) / 10;
//			if (t == 0) {
//				System.out.println("100달러짜리 " + h + "매");
//			}
//			else if (h == 0) {
//				System.out.print("10달러짜리 " + t + "매");
//			}
//			else if (h != 0) {
//				System.out.println("100달러짜리 " + h + "매");
//				System.out.print("10달러짜리 " + t + "매");
//			}
//		}
//		else if (family == 1) {
//			won = 400000;
//			int dollar = won/1200;
//			int h = dollar / 100;
//			int t = (dollar % 100) / 10;
//			if (t == 0) {
//				System.out.println("100달러짜리 " + h + "매");
//			}
//			else if (h == 0) {
//				System.out.print("10달러짜리 " + t + "매");
//			}
//			else if (h != 0) {
//				System.out.println("100달러짜리 " + h + "매");
//				System.out.print("10달러짜리 " + t + "매");
//			}
//		}
//		scan.close();
//	}
//}
	
		
	

