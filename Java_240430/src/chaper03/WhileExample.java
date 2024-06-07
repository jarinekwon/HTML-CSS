package chaper03;

import java.util.Scanner;

/*
 * 정수를 입력 받음
 * 입력받은 갯수와 평균 출력
 * 마지막에 -1을 입력 중단
 */
public class WhileExample {
	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while (n != -1) {
//			n이 -1이 아닐 때까지 반복
			sum += n;
//			sum = sum + n;
			
			count++;
//			입력받은 갯수를 증가
			n = scan.nextInt();
			
			//시작하자마자 -1 입력 시

			}
		// while문 밖에 적어야 함
		if (count == 0) {
			System.out.println("입력된 수가 없습니다.");
		}
		else {
			System.out.println("정수의 갯수는 " + count + "개 이며 ");
			System.out.println("평균은 " + (double)sum/count + "입니다.");
		
		scan.close();
		}
	}
}
