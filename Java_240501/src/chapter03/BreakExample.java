package chapter03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("exit을 입력하면 종료합니다.");
		
		
		while (true) {
//			true -> 무한 반복
			System.out.print(">>");
			String e = scan.next();
			
			if(e.equals("exit"))
				break;
		}
		System.out.println("종료합니다...");
		scan.close();
	}
}
