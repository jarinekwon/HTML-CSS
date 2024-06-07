package chapter03;

/*
 * 배열 리턴(메소드 이름)
 */
public class ReturnArray {
	static int[] makeArray() {
//	static int[4] makeArray() {
//	리턴 타입에 배열크기를 표시하면 오류
//	makeArray() -> 메소드
//	int [] -> 변환(리턴) 타입(리턴을 안하면 오류)
	int temp[] = new int[4]; 
//	int temp[] = new String[4];
//	배열 생성 시 타입이 불일치시 오류
	
	for (int i = 0; i < temp.length; i++) {
//		temp.length -> 4
		temp[i] = i; // 0 1 2 3
	}
	
	return temp;
//	return temp[];
//	리턴할 때 []을 추가하면 오류
//	return 0;
//	리턴 타입과 변환되는 값의 타입이 일치해야 함
	}
		
	public static void main(String[] args) {
		int intArray[];
//		배열 선언
		intArray = makeArray(); // temp 배열 받음 -> 0 1 2 3
//		메소드 호출
		 
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		
	}
}
