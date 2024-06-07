package chapter08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>(); // List에 커서 위치하고 ctrl+t
//		ArrayList 클래스타입으로 ArrayList 클래스 생성(제네릭 타입파라미터를 String)
		boolean aaa =array.add("oracle");
		System.out.println(aaa);
		boolean bbb = array.add("mysql");
		System.out.println(bbb);
		boolean ccc = array.add("oracle");
//		객체가 중복되어도 문제 없음
		System.out.println(ccc);
		
		for (int i = 0; i < array.size(); i++) {
			String str = array.get(i);
			System.out.println(i + ": " + str);
			
					
		}
	}

}
