package chapter03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 5개 입력하세요.");
		for (int i = 0; i < 5; i++) {
			int a = scan.nextInt();
			if (a<0) {
				continue; // continue는 명령으로 넘어가지 않는 스킵같은 역할
//			continue를 쓰지 않으면
//			if (a>0) {
//				sum += a
//			} 바로 가도 됨
			}
		sum += a;
		}		
		System.out.println("양수의 합은 " + sum);
		scan.close();
	}		
}

