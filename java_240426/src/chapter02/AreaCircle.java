package chapter02;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
//	입력받기 위해서 Scanner 객체 생성
	double pi=3.14;
	
	System.out.print("반지름을 입력하세요>>");
//	바로 옆에 입력할거면 println 말고 print 사용
	
	double radius = scan.nextInt();
//	반지름을 정수로 입력 받음
	System.out.println("원의 면적은" + pi*radius*radius + "입니다.");

	}

}
