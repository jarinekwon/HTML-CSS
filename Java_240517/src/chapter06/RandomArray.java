package chapter06;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇 개?");
		int n = scan.nextInt();
		int intArray[] = new int[n];
		
		for (int i = 0; i < intArray.length; i++) {
			int r = (int)(Math.random()*100 +1); // 1~100 사이
			intArray[i] = r;
			if (i == 0) {
				System.out.print(intArray[i] + " "); // 0일 때는 엔터 안침
			}
			else {
				if (i%10 == 0) {
					System.out.println(); // 10번째 마다 엔터
				}
			}
			System.out.print(intArray[i] + " ");
		}
		
	}
}
