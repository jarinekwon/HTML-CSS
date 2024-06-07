package chapter02;

//1. public class 찾아감
public class Square {
//	2. main 메소드 찾아감
	public static void main(String[] args) {
//	void -> 리턴 타입 (리턴(반환) 할 것이 없음)
		int n = 4;
//		square(); //메소드 호출부
//		square(4);
//		square -> 메소드명(호출부에서 파라미터가 있으면 오류)
//		3. 메소드 호출
//		square(n);
		int s = square(n);
		
		System.out.println("한 변의 길이가 " + n +"인 정사각형의 넓이 : " + s);
	}	
//	public static void square() { //메소드 정의부
//	public static void square(int n) { 
//	4. 메소드 호출됨
	public static int square(int length) {
//	int가 리턴 타입
//	public static void square(int length) {
//	int length -> int 타입의 매개변수(인자, 파라미터) => n -> length로 받음
//		return;
//		return ""; // 타입 불일치시 오류(String)
//		return 0; // 타입 불일치시 오류(int)
//		5. length를 제곱하여 반환
		return length * length;

	}
}
