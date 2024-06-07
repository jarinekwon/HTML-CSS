package chapter02;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		
		System.out.print("정수를 입력하시오>>");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if(c == 0) {
			System.out.print("삼각형의 넓이는 " + (double)(a*b/2));
//			float triangle = (a*b/2); 미리 설정하고 넣어도 됨
		}
		else {
			System.out.print("사다리꼴의 넓이는" + (double)((a+b)*c/2));
//			float trapezium = ((a+b)*c/2); 미리 설정하고 넣어도 됨
		}
		
		scan.close();
		
	}
}