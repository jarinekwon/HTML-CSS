package chapter03;

import java.util.Scanner;

public class DivideByZeroHandling {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dividend;
		int divisor;
		
		
		while (true) {
			System.out.print("분자를 입력하시오: ");
			dividend = scan.nextInt();
			System.out.print("분모를 입력하시오: ");
			divisor = scan.nextInt();
		
				//불능일 때 정상적인 메세지로 처리
				try {
					System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
//					불능이 발생할 수 있는 실행문(오류 발생 가능성이 있는 실행문)
					break;
				} catch (Exception e) {
//					오류 발생 시 처리(try에서 발생 시)
					System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
				}
		}
		
		scan.close();
		
		
	}


}
