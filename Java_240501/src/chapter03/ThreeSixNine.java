package chapter03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("10~99 사이의 정수를 입력하세요>>");
		int n = scan.nextInt();
		
		int t = n/10;
		int o = n%10;
		
		if (n<10) {
			if (o%3==0 || o%6==0 || o%9==0) {
				System.out.println("박수짝");
			}
			else {
				System.out.println(n);
			}
		}
		else if (n>=10) {
				if ((t%3==0 || t%6==0 || t%9==0) && (o%3==0 || o%6==0 || o%9==0)) {
					System.out.println("박수짝짝");
				}
				else if (t%3==0 || t%6==0 || t%9==0) {
					System.out.println("박수짝");
				}
				else {
					System.out.println(n);
				}
		}
		
		scan.close();
	
		
	}
}
