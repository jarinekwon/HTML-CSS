package chapter03;

public class CoronaSum {
	public static void main(String[] args) {
		
		int corona[][] = new int [12][3];
		
		int sum = 0;
		for (int month = 0; month < corona.length; month++) {
			for (int city = 0; city < corona[month].length; city++) {
				corona[month][city] = (month+1)*10 + (city+1);
				sum += corona[month][city];
			}
		}
		System.out.print("1년 전체 코로나 환자 수는 " + sum);
	}
}
