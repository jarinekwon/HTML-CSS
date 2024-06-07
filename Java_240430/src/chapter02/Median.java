package chapter02;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int a3 = scan.nextInt();

		if(a1>a2 && a2>a3) {
			System.out.println("중간 값은 " + a2);
		}
		else if (a3>a2 && a2>a1) {
			System.out.println("중간 값은 " + a2);
		}
		else if (a2>a1 && a1>a3) {
			System.out.println("중간 값은 " + a1);
		}
		else if (a3>a1 && a1>a2) {
			System.out.println("중간 값은 " + a1);
		}
		else if (a1>a3 && a3>a2) {
			System.out.println("중간 값은 " + a3);
		}
		else if (a2>a3 && a3>a1) {
			System.out.println("중간 값은 " + a3);
		}
		else {
			System.out.print("값이 중복됩니다.");
		}
		
		scan.close();
	}
}