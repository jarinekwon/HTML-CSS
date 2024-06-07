package chapter02;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		
		int number = scan.nextInt();
		
		if(number % 11 == 0) {
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		scan.close();
	}
}
