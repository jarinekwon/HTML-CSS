package chapter02;

import java.util.Scanner;

class Aaa{}
class Baa{}
//class 여러개 사용해도 무관
public class ExCalculation {
//public class Caa{} -> 자바 파일 안에 두 개 이상 public 클래스 존재 시 오류
//1.JVM이 수많은 class에서 public class를 찾아감
	public static void aaa() {}
	public static void bbb() {}
	public static void main(String[] args) {
//	2.JVM이 수많은 method에서 main method를 찾아감
		System.out.print("두 개의 실수 입력>>");
		Scanner scan = new Scanner(System.in);
		
		double a1 = scan.nextDouble();
		double a2 = scan.nextDouble();
//		float 써도 실수 받음
		
		System.out.println("두 수의 덧셈은 " + (a1+a2));
		System.out.println("두 수의 뺼셈은 " + (a1-a2));
		System.out.println("두 수의 곱셈은 " + (a1*a2));
		System.out.println("두 수의 나눗셈은 " + (a1/a2));
		
		scan.close();
		
	}
}
