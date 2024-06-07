package chapter03;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int m = scan.nextInt();
		
		int ft = m / 50000;
		int tt = (m % 5) / 10000;
		int t = (m % 5) % 10000 / 1000;
		int fh = (m % 5) % 10000 % 1000 / 500;
		int h = (m % 5) % 10000 % 1000 % 500 / 100;
		int f = (m % 5) % 10000 % 1000 % 100 / 50;
		int ten = (m % 5) % 10000 % 1000 % 100 % 50 / 10;
		int o = (m % 5) % 10000 % 1000 % 100 % 50 % 10;
		
		if (ft == 0 && tt == 0 && t == 0 && fh == 0 && h == 0 && f == 0 && ten == 0) {
			System.out.println("일원 " + o + "개");
		}
		else if (ft == 0 && tt == 0 && t == 0 && fh == 0 && h == 0 && f == 0) {
			System.out.println("일원 " + o + "개");
			System.out.println("십원 " + ten + "개");
			
		}
		else if (ft == 0 && tt == 0 && t == 0 && fh == 0 && h == 0) {
			System.out.println("일원 " + o + "개");
			System.out.println("십원 " + ten + "개");
			System.out.println("오십원 " + f + "개");
			
		}
		else if (ft == 0 && tt == 0 && t == 0 && fh == 0) {
			System.out.println("일원 " + o + "개");
			System.out.println("십원 " + ten + "개");
			System.out.println("오십원 " + f + "개");
			System.out.println("백원 " + h + "개");
			
		}
		else if (ft == 0 && tt == 0 && t == 0) {
			System.out.println("일원 " + o + "개");
			System.out.println("십원 " + ten + "개");
			System.out.println("오십원 " + f + "개");
			System.out.println("백원 " + h + "개");
			System.out.println("오백원 " + fh + "개");
			
		}
		else if (ft == 0 && tt == 0) {
			System.out.println("일원 " + o + "개");
			System.out.println("십원 " + ten + "개");
			System.out.println("오십원 " + f + "개");
			System.out.println("백원 " + h + "개");
			System.out.println("오백원 " + fh + "개");
			System.out.println("천원 " + t + "개");
			
		}
		else if (ft == 0 ) {
			System.out.println("일원 " + o + "개");
			System.out.println("십원 " + ten + "개");
			System.out.println("오십원 " + f + "개");
			System.out.println("백원 " + h + "개");
			System.out.println("오백원 " + fh + "개");
			System.out.println("천원 " + t + "개");
			System.out.println("만원 " + tt + "개");
			
		}
		else {
			System.out.println("일원 " + o + "개");
			System.out.println("십원 " + ten + "개");
			System.out.println("오십원 " + f + "개");
			System.out.println("백원 " + h + "개");
			System.out.println("오백원 " + fh + "개");
			System.out.println("천원 " + t + "개");
			System.out.println("만원 " + tt + "개");
			System.out.println("오만원 " + tt + "개");
		}
		scan.close();
	}
	
}
