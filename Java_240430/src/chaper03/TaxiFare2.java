package chaper03;

import java.util.Scanner;

public class TaxiFare2 {
	public static void main(String[] args) {
		
		int fare;
		int income = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("요금을 입력하세요: ");
			fare = scan.nextInt();
			income += fare;
		
			
		}
		System.out.println("총 수입 : " + income);
		scan.close();
	}
}
