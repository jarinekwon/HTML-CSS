package chapter02;

public class RandomNumber {
	public static void main(String[] args) {
		
		int n = rollDie();
		System.out.println("주사위의 눈 : " + n);
	}
	public static int rollDie() {
//	매개변수가 없는 메소드(주사위의 숫자 구하기 = 1~6)
//		Math.random();
//		random() -> 0 이상 1 미만 난수 발생(실수)
		double x = 6 * Math.random();
//		0~5 난수 발생(실수)
		int temp = (int)x;
		return temp+1;
//		1~6 난수 발생(실수)
	}
}
