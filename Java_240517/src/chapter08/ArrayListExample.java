package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // List에 커서 위치하고 ctrl+t
//		List 컬렉션에서 ArrayList 클래스로 객체 생성(제네릭 타입파라미터를 String)
//		upcasting
		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2번 인덱스에 삽입되어서 2번이 밀려남 => 3: Servlet/JSP
		list.add("Spring");
		
		int size = list.size();
		System.out.println("총 list 갯수: " + size);
		
		String skill = list.get(2);
		System.out.println("2번째 인덱스: " + skill);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		list.remove(2); // 인덱스로 객체 삭제
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		list.remove("Spring"); // 객체로 직접 삭제
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
	}

}
