package chapter02;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		
		System.out.print("정수 3개를 입력하시오>>");
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a<b+c && b<a+c && c<a+b) {
//		삼각형 조건 중에 가장 긴 변의 길이가 두 변의 길이 합보다 작아야 한다는 조건도 있으므로
//		elseif를 쓰지 않고 &&로 엮어서 모두 성립하는지를 확인
//		안되는 케이스를 먼저 넣어도 상관 없음
			System.out.print("삼각형이 됩니다.");
		}
		else {
			System.out.print("삼각형이 될 수 없습니다.");
		}
		
	scan.close();
	}
}
