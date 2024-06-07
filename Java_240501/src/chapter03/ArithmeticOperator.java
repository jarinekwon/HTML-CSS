package chapter03;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		
		int ts = scan.nextInt();
		
		int h = ts / 3600;
		int m = (ts % (3600*h)) / 60;
		int s =  (ts % (3600*h)) % 60;	
//		= hour = time / 3600
//		  minute = (time / 60) % 60
//		  second = time % 60
		
		System.out.println(ts + "초는 " + h + "시간, " + m + "분, " + s + "초입니다.");
		
		scan.close();
	}
}
