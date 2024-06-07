package chapter02;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		
		final double DOLLARRATE = 1200;
		final double EURORATE = 1500;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		
			
		int won = scan.nextInt();
		double dollar = won / DOLLARRATE;
		double euro = won / EURORATE;
		System.out.println(won + "원은 $" + dollar + "입니다.");
		System.out.println(won + "원은 E" + euro + "입니다.");
		
		scan.close();
	}
}
