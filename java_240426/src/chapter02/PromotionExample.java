package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue=10;
		//int byteValue=1000;
		int intValue = byteValue;
//		작은 타입을 큰 타입으로 받아 자동 변환
		System.out.println("intValue : "+intValue);
		
		char charValue='가';
		intValue=charValue;
//		변수에 유니코드가 저장
		System.out.println("intValue : "+intValue);
		
		intValue = 50;
		long longValue= intValue ;
//		작은 타입을 큰 타입으로 받아 자동변환
		System.out.println("longValue : "+longValue);
		
		longValue = 100;
		float floatValue= longValue ;
//		정수를 실수로 변환
		System.out.println("floatValue : "+floatValue);

		
		floatValue = 100.5F;
		double doubleValue= floatValue ;
//		정수를 실수로 변환
		System.out.println("doubleValue : "+doubleValue);
		
	}
}
