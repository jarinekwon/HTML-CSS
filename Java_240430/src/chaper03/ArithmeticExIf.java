package chaper03;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");
		int a = scan.nextInt();
		String s = scan.next();
		int b = scan.nextInt();
		
		if(s.equals("+")) {
			System.out.print(a + s + b + "의 계산 결과는 " + (a+b));
		}
		else if (s.equals("-")) {
			System.out.print(a + s + b + "의 계산 결과는 " + (a-b));
		}
		else if (s.equals("*")) {
			System.out.print(a + s + b + "의 계산 결과는 " + (a*b));
		}
		else if (s.equals("/")) {
			if (b != 0) {
				System.out.print(a + s + b + "의 계산 결과는 " + (a/b));
			}
			else {
				System.out.print("0으로 나눌 수 없습니다.");
			}	
		}
		scan.close();
	}	
}

