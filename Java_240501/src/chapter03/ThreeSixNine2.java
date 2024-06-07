package chapter03;

import java.util.Scanner;

public class ThreeSixNine2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력하세요>>");
		int count=0, num = 0, a, b;
//		count : 3,6,9의 갯수
//		num : 입력받는 정수
//		a : 10의 자리
//		b : 1의 자리
		
		a = num / 10;
		b = num % 10;
		
		//3,6, 9일 때
		if (a%3 == 0) {
			count ++;
		}
		if (b%3 == 0 && b!=0) {
			count ++;
		}
		
		if (count ==2) {
			System.out.println("박수짝짝");
		}
		else if (count == 1) {
			System.out.println("박수짝");
		}
		else {
			System.out.println("박수없음");
		}
		
		scan.close();
		
	}
}
