package chapter12;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		
		int[] array = {9,4,5,6,2,1};
		printArray(array);
		System.out.println();
		Arrays.sort(array); // 배열을 정렬
		printArray(array);
		System.out.println();
		System.out.println(Arrays.binarySearch(array, 9));
		System.out.println(Arrays.binarySearch(array, -1));
		System.out.println(Arrays.binarySearch(array, 0));
		System.out.println(Arrays.binarySearch(array, 3));
		System.out.println(Arrays.binarySearch(array, 7));
		System.out.println(Arrays.binarySearch(array, 10));
		System.out.println(Arrays.binarySearch(array, 99));
//		9를 탐색(인덱스 반환, 없으면 음수)
		Arrays.fill(array, 8);
		printArray(array); // 배열을 틀정한 값으로 채움
	}
	private static void printArray(int[] array) {
//	매개변수를 출력하는 메소드
		
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
	}
}
