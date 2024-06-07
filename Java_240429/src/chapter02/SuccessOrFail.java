package chapter02;

import java.util.Scanner;

/*
 * 정수를 입력받아서 80정 이상이면 합격
 */
public class SuccessOrFail {
	public static void main(String[] args) {
		
		System.out.print("점수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		
		int score = scan.nextInt();
		if(score >= 80) {
			System.out.println("측하합니다!");
			System.out.println("합격입니다.");
		}
//		중괄호 빼도 실행 가능
		else{
			System.out.println("불합격입니다.");
		}
		
		scan.close();
	}	
}
