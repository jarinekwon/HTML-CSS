package chapter12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest2 {
	public static void main(String[] args) {
		
		String[] a = {"a", "b", "c", "d"};
		int[] b = {3,5,5,7,3,3,42,6,8,45323,4,63,2,1};
		System.out.println(Arrays.asList(a)); // list로 출력
		List<String> list = Arrays.asList(a);
		System.out.println("@# list.get(0) =====> " + list.get(0));
		
		Arrays.sort(b, 4, 14); // 인덱스 정렬(4~13)
		System.out.println(Arrays.toString(b)); // string으로 출력
//		{3,5,5,7,3,3,42,6,8,45323,4,63,2,1}
//		=>
//		[3, 5, 5, 7, 1, 2, 3, 3, 4, 6, 8, 42, 63, 45323]
		Arrays.sort(b);
		System.out.println(Arrays.toString(b)); // string으로 출력
//		[1, 2, 3, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323]
		
		Arrays.sort(a, Collections.reverseOrder()); // 문자열 배열 거꾸로
		System.out.println(Arrays.toString(a)); // string으로 출력
//		[d, c, b, a]
		
		Arrays.sort(a); // 오름차순 정렬
		System.out.println(Arrays.toString(a)); // string으로 출력
//		[a, b, c, d]
		
		Arrays.sort(a, 2, 4, Collections.reverseOrder()); // 인덱스 2, 3번째 배열 거거꾸로
		System.out.println(Arrays.toString(a)); // string으로 출력
//		[a, b, d, c]
		
		String[] cc = {"11", "12", "13", "23", "53", "223", "145", "53"};
		Arrays.sort(cc, Collections.reverseOrder());
		System.out.println(Arrays.toString(cc)); // string으로 출력
//		[53, 53, 23, 223, 145, 13, 12, 11]
		
		int[] c = Arrays.copyOf(b, b.length); // b를 c에다가 복사
		System.out.println(Arrays.toString(c)); // string으로 출력
//		[1, 2, 3, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323]
		
		String[] d = Arrays.copyOf(a, 3); // a배열 객체를 크기 3인 배열로 복사
		System.out.println(Arrays.toString(d)); // string으로 출력
//		[a, b, d]
		
		
		
		
		
		
		
		
	}
}
