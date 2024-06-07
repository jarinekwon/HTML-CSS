package chapter13;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f1 = i -> i*4;
//		Function 인터페이스로 람다식 객체 구현
		System.out.println(f1.apply(3));

		Function<String, Integer> f2 = s -> s.length();
//		String -> 매개변수 타입, Integer -> 리턴 타입
		System.out.println(f2.apply("Hello"));
	}
}
