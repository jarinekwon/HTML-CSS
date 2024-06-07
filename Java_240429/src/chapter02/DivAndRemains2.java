package chapter02;

import java.util.Scanner;

public class DivAndRemains2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		
		int n = scan.nextInt();
		
		int ten = n/10;
		int one = n%10;
//		10의 자리 -> 나누기 10을 해서 몫
//		1의 자리 -> 나누기 10을 해서 나머지
		
		if (ten == one) {
			System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		scan.close();
	}
}
