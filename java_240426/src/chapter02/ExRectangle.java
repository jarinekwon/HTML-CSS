package chapter02;

import java.util.Scanner;

public class ExRectangle {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로, 세로 길이를 입력하세요>>");
		
		int width = scan.nextInt();
		int height = scan.nextInt();
		
		System.out.println("사각형의 면적은 " + width*height + "입니다.");

	}
}
