package chapter06;

public class StringBufferEx {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");
//		append() -> 문자열을 연결(추가되면서 수정)
		System.out.println(sb);
		
		sb.insert(7, " my");
//		insert() -> 문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
//		replace() -> 문자열 대체
		System.out.println(sb);
		
		sb.delete(8, 13);
//		delete() -> 문자열 삭제
		System.out.println(sb);

		sb.setLength(4);
//		setLength() -> 문자열 길이 수정
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		int n = sb.length();
		System.out.println(n);
		
		char c = sb.charAt(3);
		System.out.println(c);
		
		
		
		
	}
}
