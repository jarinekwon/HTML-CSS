package chapter03;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		
		double sum = 0;
		int intArray[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요>>");
				
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		
		double n = intArray.length;
		
		System.out.println("평균은 " + (sum/n));
		
		scan.close();
	}
}
