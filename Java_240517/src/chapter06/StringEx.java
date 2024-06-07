package chapter06;

public class StringEx {
	public static void main(String[] args) {
		
		String a = new String(" C#"); // heap 메모리에 저장
		String b = new String(",C++ "); // heap 메모리에 저장
		
		System.out.println(a.length()); // C#의 길이는 3(스페이스 포함)
//		length() -> 문자열의 길이
		
		System.out.println(a.contains("#")); // #을 포함하고 있으므로 true
//		contains() -> 문자열 포함 여부
		System.out.println(a.contains("*")); // *을 포함하고 있지 않으므로 false
		
		a = a.concat(b);
//		concat() -> 문자열 연결
		System.out.println(a); // 새로운 문자열을 a가 가리킴 ( C#, C++ )
		
		a = a.trim();
//		trim() -> 문자열 앞뒤 공백 제거
		System.out.println(a); // 공백제거 (C#, C++)
		
		a = a.replace("C#", "JAVA");
//		replace() -> 문자열 대체
		System.out.println(a); // 문자열 대체 (JAVA, C++)
		
		String s[] = a.split(",");
//		split() -> 문자열을 분리
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + ":" + s[i]);
//		JAVA와 C++이 분리
		}
		
		a = a.substring(5);
//		substring() -> 인덱스 값으로 시작하는 문자열
		System.out.println(a); // JAVA, 생략
		
		char c = a.charAt(2);
//		charAt() -> 인덱스에 해당하는 문자
		System.out.println(c); // 2번째 인덱스에 위치한 + 출력
	}
}












