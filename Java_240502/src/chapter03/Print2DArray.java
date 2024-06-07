package chapter03;


public class Print2DArray {
	public static void main(String[] args) {
		
		int n[][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
//		열의 크기가 각각 달라서 비정방향 배열
		
		for (int i = 0; i < n.length; i++) {
//			n.length는 5(행의 크기) => 중괄호 안에 중괄호 갯수
			for (int j = 0; j < n[i].length; j++) {
//				n[0].length = 1
//				n[1].length = 3
//				n[2].length = 1
//				n[3].length = 4
//				n[4].length = 2
				System.out.print(n[i][j] + " ");
//				n[i][j]는 2차원 배열원소
			}
			System.out.println();
		}
	}

}

