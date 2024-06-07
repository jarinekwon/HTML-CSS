package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
//		char charValue = intValue;
//		int 타입을 char로 바로 저장하려고 하면 오류
		char charValue = (char)intValue;
//		char로 변환(casting)해서 저장
		System.out.println(charValue);
//		44032 유니코드에 해당하는 '가'문자가 저장
		
//		long longValue=500;
//		정수 작은타입에서 큰 타입으로 변환(자동변환=>육시적 변환)
		long longValue=5000000000L;
		intValue = (int)longValue ;
//		정수 큰타입에서 작은타입으로 변환(변환 안하면 오류)
		System.out.println(intValue);
//		long타입 숫자가 int로 변환할 때 잘려서 705032704로 저장
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
//		실수에서 정수로 변환(변환 안하면 오류)
		System.out.println(intValue);
		
	
		
		
				
	}
}
