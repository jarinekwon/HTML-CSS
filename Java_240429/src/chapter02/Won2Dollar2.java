package chapter02;

import java.util.Scanner;

public class Won2Dollar2 {
	public static void main(String[] args) {
		
//		int rate =1100;
		final int RATE = 1100;
//		환율 고정일 때 상수 사용(관습적으로 대문자)
		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int won = scan.nextInt();
		double dollar = won / RATE;
		System.out.println(won + "원은 $" + dollar + "입니다.");
		
		scan.close();
		
	}
}
