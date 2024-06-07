package chapter13;

interface Myfunction4{
	
	int calc(int x, int y);
}

public class LambdaEx4 {
	public static void main(String[] args) {
		
		printMultiply(3, 4, (x, y) -> x*y); // 람다식(x, y) -> x*y을 매개변수로 전달
	}
	static void printMultiply(int x, int y, Myfunction4 f) {
//	메소드 매개변수로 인터페이스 객체를 받음
//	f로 (x, y) -> x*y 람다식 전달받음
//	Myfunction4 f = (x, y) -> x*y
		System.out.println(f.calc(x, y));
	}
}
