package chapter02;

import java.util.Scanner;

public class Median2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int median = 0;
		
		if((a>b && a<c)||(a>c && a<b)) {
			median=a;
		}
		else if ((b>a && b<c)||(b>c && b<a)) {
			median=b;
		}
		else {
			median=c;
		}
		System.out.println("중간 값은 " + median);
		scan.close();
	}	
}
	
