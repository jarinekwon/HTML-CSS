package chaper03;

/*
 * 문자열에서 특정 문자를 찾느다.
 * 찾은 갯수 ㅜㄹ력
 * ex>life is cool. (l->2개)
 */
public class ContinueTest {
	public static void main(String[] args) {
		
		int count = 0;
		String s = "no news is good news";
//		알파벳 n의 갯수 구하기
		
//		System.out.println(s.length());
//		스페이스 포함 20자
//		length() -> 문자열의 크기를 구하는 메소드
		
		for (int i = 0; i < s.length(); i++) {
//			문자열 크기 20번 반복
//			System.out.println(s.charAt(0));
//			charAt() -> 문자를 가져오는 메소드
//			charAt(0) -> 첫 번째 문자가 20번 나옴
//			System.out.println(s.charAt(i));
			if (s.charAt(i) != 'n') {
				continue;
//				알파벳 'n'이 아니면 스킵
			}
			count++;
//			알파벳 'n'이면 카운트 증가
			
		}
		System.out.println("문장에서 발견된 n의 갯수 : " + count);
		}
	}

