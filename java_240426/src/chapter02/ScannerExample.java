package chapter02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner scanner = new Scanner(System.in);
//		System.in -> 바이트 표준 입력 스트림, 매개변수(인자, 파라미터, arguement) => 다 같은 말
//		scanner -> 참조(reference) 변수
//		Scanner 객체를 생성하고, Scanner 클래스 타입의 scanner 참조변수가 가리킴
		String name = scanner.next();
		System.out.println("이름은 " + name);
//		scanner -> 객체
//		next () -> 문자열 입력 받는 메소드
//		입력 받을 때 스페이스나 탭으로 구분해서 토큰 단위로 받음
		
		String city = scanner.next();
		System.out.println("도시는 " + city);
		
		int age = scanner.nextInt();
		System.out.println("나이는 " + age +"살");
		
		double weight = scanner.nextDouble();
		System.out.println("몸무게는 " + weight+"kg");
		
		boolean single = scanner.nextBoolean();
		System.out.println("독신여부는 "+single+" 입니다.");
		
		scanner.close();
//		close() -> scanner 객체 종료(자원 반납)
//		=> 메모리를 더 사용할 수 있고, 안하면 garbage collector가 자동으로 정리
		
	}
}
