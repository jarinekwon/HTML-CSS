package chapter03;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		
		int intArray[] = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		
		int max = 0;
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();	
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		
		
		System.out.println("가장 큰 수는 " + max + "입니다.");
		scan.close();
	}
}
