package chapter04;

public class Book2 {
	
	String title;
	String author;
	
	public Book2(String title, String author) {
		
		System.out.println("생성자1 호출됨");
		this.title = title;
		this.author = author;
//		매개변수를 this 자기자신의 객체 맴버로 저장
		
	}
	
	public Book2(String title) {
		
		this(title, "작자미상"); // 첫번째 라인에 안오면 오류 발생
		System.out.println("생성자2 호출됨");
		
	}

	public Book2() {
		
		this("", ""); // 첫번째 라인에 안오면 오류 발생
		System.out.println("생성자3 호출됨");
		
	}
	
	void show() {
		
		System.out.println(title+" "+author);
	}
	
	public static void main(String[] args) {
		
//		Book2 littlePrince = new Book2("어린왕자", "생떽쥐베리");
////		System.out.println(littlePrince.title + " " + littlePrince.author);
//		littlePrince.show();

//		Book2 lovestory = new Book2("춘향전");
//		lovestory.show();
		
		Book2 emptybook = new Book2();
		emptybook.show();
		
		
		
		
		
	}
}
