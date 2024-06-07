package chapter03;

public class Gugudan {
	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + "\t");
//				\\t를 사용하여 공간 띄움
			}
			System.out.println();
//			단마다 한줄 내리기(엔터)
		}
		
		
	}
}
		