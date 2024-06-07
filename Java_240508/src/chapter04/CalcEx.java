package chapter04;

class Calc{ // default 접근지정자
	public static int abs(int a) {
//	static(클래스)맴버는 객체 생성없이 클래스 이름으로 사용가능
//	public int abs(int a) {
//	non-static(인스턴스)맴버는 객체 생성해야 사용됨
//	private static int abs(int a) {
//	private 접근지정자는 같은 클래스 안에서만 접근 가능
//	protected static int abs(int a) {
//	protected 접근지정자는 같은 패키지(chapter04) + 다른 패키지(상속)에서만 접근 가능
		return a>0?a:-a; // 절대값 반환, 삼항연산자/조건연산자
	}
	static int max(int a, int b) {
		return a>b?a:b; // 둘 중에 큰 수 변환
	}
	public static int min(int a, int b) {
		return a>b?b:a; // 둘 중에 작은 수 변환
	}
}

public class CalcEx { // public 접근지정자(제한자)
	public static void main(String[] args) {
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10, 8));
		System.out.println(Calc.min(-3, -8));
	}
}
