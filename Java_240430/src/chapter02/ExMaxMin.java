package chapter02;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max=0;
		int min=0;
		
		//최대값 구하기
		if (a>b && a>c) {
			max=a;
		}
		else if (b>a && b>c) {
			max=b;
		}
		else {
			max=c;
		}
		//최소값 구하기
		if (b>a && c>a) {
			min=a;
		}
		else if (a>b && c>b) {
			min=b;
		}
		else {
			min=c;
		}
		
		System.out.println("최대값은 " + max);
		System.out.println("최소값은 " + min);

		scan.close();
	}
}
