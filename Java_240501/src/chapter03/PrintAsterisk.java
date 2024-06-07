package chapter03;

import java.util.Scanner;

public class PrintAsterisk {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오>>");
		int n = scan.nextInt();
		
//		구구단 -> 2중 for (행과 열 출력)
//		* 갯수를 행과 열 출력 -> 2중 for 사용
//		for (int i = 1; 1 < n; i++) {
		for (int i = n; i > 0; i--) {
//		감소시키는 로직을 위해서 역으로 진행
			for (int j = 0; j < i; j++) {
//				하나씩 줄이기 위해서 i값 사용
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
		
		
	}
}
