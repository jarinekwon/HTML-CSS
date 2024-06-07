package chapter03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		
		boolean mul = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요: ");
		int num = scan.nextInt();
		
		if (num%3 == 0) {
			System.out.println("3의 배수이다.");
			mul = true;
		}
		if (num%5 == 0) {
			System.out.println("5의 배수이다.");
			mul = true;
		}
		if (num%8 == 0) {
			System.out.println("8의 배수이다.");
			mul = true;
		}
		if (mul == false) {
			System.out.println("어느 배수도 아니다.");
		}
		scan.close();
	}
}
		
		
//		if (num%3 == 0) {
//			
//			if (num%5 == 0 && num%8 == 0) {
//				System.out.println("3의 배수이다.");
//				System.out.println("5의 배수이다.");
//				System.out.println("8의 배수이다.");
//				mul = true;
//				return;
//			}
//			if (num%8 == 0) {
//				System.out.println("3의 배수이다.");
//				System.out.println("8의 배수이다.");
//				mul = true;
//				return;
//			}
//			else if (num%5 == 0) {
//				System.out.println("3의 배수이다.");
//				System.out.println("5의 배수이다.");
//				mul = true;
//				return;
//			}	
//			System.out.println("3의 배수이다.");
//			mul = true;
//		}
//		else if (num%5 == 0) {
//				if (num%8 == 0) {
//					System.out.println("5의 배수이다.");
//					System.out.println("8의 배수이다.");
//					mul = true;
//					return;
//				}
//				System.out.println("5의 배수이다.");
//				mul = true;
//				}
//		else if (num%8 == 0) {
//			System.out.println("8의 배수이다.");
//		}
//		else if (!mul) {
//			System.out.println("어느 배수도 아니다.");
//		}
//		scan.close();
//	 }



