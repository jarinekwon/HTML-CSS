package chapter03;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		
		int intArray[] = new int [10];
		
		Scanner scan = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
		int sum = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		System.out.println("합계는 " + sum);
		scan.close();
	}
}
