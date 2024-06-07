package chapter03;

public class ReturnArray {
	
	public static int[] makeArray() {
		int temp[] = new int[10];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i+1;
		}
		return temp;
	}
	public static void main(String[] args) {
		int intArray[];
		
		intArray = makeArray();
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(100 + intArray[i] + " ");
		}
	}
}