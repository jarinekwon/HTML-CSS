package chapter02;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner scan = new Scanner(System.in);
		
		
		int won = scan.nextInt();
		double dollar = (double)(won/1100);
		System.out.println(won + "원은 $" + dollar + "입니다.");
		
		scan.close();
	}
}
