package chapter09;

import java.util.Scanner;

public class RandomArray2 {
	public static boolean exists(int a[], int to, int r){
//	난수의 중복을 체크하는 메소드
		for (int i = 0; i < to; i++) {
			if (a[i] == r) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 몇 개?");
		int n = scan.nextInt();
		int intArray[] = new int[n];
		
		for (int i = 0; i < intArray.length; i++) {
			int r = (int)(Math.random()*100 +1); // 1~100 사이 난수 발생
			if (exists(intArray, i, r)) {
				i--;
				continue;
			} 
			intArray[i] = r;
			System.out.print(intArray[i] + " ");
				if ((i+1)%10 == 0) {
					System.out.println(); // 10번째 마다 엔터
			}
			scan.close();
			
		}
	}
}
