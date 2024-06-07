package chapter03;

/*
 * main 메소드 매개변수 이용
 */
public class Calc {
	public static void main(String[] args) {
//		args -> main 메소드 매개변수
		
		double sum = 0.0;
		
		for (int i = 0; i < args.length; i++) {
//			main 메소드 매개변수 크기만큼 반복
			sum += Double.parseDouble(args[i]);
//			args 강제 타입 변화(String -> double)
//			Double -> Wrapper 클래스
//			parseDouble() -> 실수로 변환하는 메소드
			
		}
		System.out.println("합계 : " + sum);
		
	}
}



//run-run configurations-arguments