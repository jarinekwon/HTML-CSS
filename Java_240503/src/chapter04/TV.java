package chapter04;

public class TV {
	
	String brand;
	int year;
	int inch;
	
	public TV(String b, int y, int i) {
		
		brand = b;
		year = y;
		inch = i;
	}
	
	void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
	
	public static void main(String[] args) {
		
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
