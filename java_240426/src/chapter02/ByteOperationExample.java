package chapter02;

public class ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10+20;
//		연산식을 변수로 저장
		System.out.println(result1);
		byte x = 10;
		byte y = 20;
//		byte result2 = x=y; -> 오류
		byte result2 = (byte) (x+y);
//		연산되어서 int로 자동 변환되어서 byte로 casting 함
		System.out.println(result2);
		
	}
}
