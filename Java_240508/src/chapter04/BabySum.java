package chapter04;

public class BabySum {
	public static void main(String[] args) {
		
		int baby[][] = new int [120][5];
		
		int sum = 0;
		for (int month = 0; month < baby.length; month++) {
//		baby.length -> 120(month가 120번 반복)
			for (int country = 0; country < baby[month].length; country++) {
//			baby[month].length -> 5(country가 5번 반복)
				baby[month][country] = (month+1)*100 + (country +1);
				sum += baby[month][country];
			}
		}
		System.out.println("10년간 5개 나라의 총 신생아 수는 " + sum);
	}
}