package chapter03;


public class IrregularArray {
	public static void main(String[] args) {
		
		
		int n[][] = new int[4][];
//		비정방향 배열은 행만 정의하고 열은 비워둠
		n[0] = new int[3];	// 1행의 열의 크기는 3
		n[1] = new int[2];	// 2행의 열의 크기는 2
		n[2] = new int[3];	// 3행의 열의 크기는 3
		n[3] = new int[2];	// 4행의 열의 크기는 2

		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] =(i+1)*10+j;
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
//		int n[][] = {{10,11,12}, {20,21}, {30,31,32}, {40,41}};
//		
//		for (int i = 0; i < n.length; i++) {
//			for (int j = 0; j < n[i].length; j++) {
//				System.out.print(n[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
