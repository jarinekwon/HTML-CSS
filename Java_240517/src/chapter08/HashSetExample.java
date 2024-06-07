package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{}
public class HashSetExample {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); // upcasting
//		Set 인터페이스 컬렉션 타입으로 HashSet클래스 객체 생성
//		Set<Object> set = new HashSet<>(); // upcasting
		set.add("JAVA");
		set.add("JDBC");
		set.add("Servlet/JSP");
//		set.add("JAVA"); // set 컬렉션중복 객체 추가 불가
		AA a = new AA();
//		set.add(a); // String으로 제네릭 설정하면 읽지 않음 (Oㅠject만)
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체 수: " + size);
	
		Iterator<String> iterator = set.iterator();
//		set 컬렉션은 iterator 메소드 호출에서 Iterator 인터페이스 타입으로 값을 받음
		while (iterator.hasNext()) { // iterator 객체 값이 있으면
			String element = (String) iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC"); // 객체 삭제
		System.out.println("총 객체 수: " + size);
		System.out.println("총 객체 수: " + set.size());
//		set.size()가 바뀐 것이지 size가 바뀐 것이 아님
		/*
		Iterator<String> iterator2 = set.iterator();
//		set 컬렉션은 iterator 메소드 호출에서 Iterator 인터페이스 타입으로 값을 받음
		while (iterator2.hasNext()) { // iterator 객체 값이 있으면
			String element = (String) iterator2.next();
			System.out.println("\t" + element);
		}
		*/
		for (String element : set) {
			System.out.println("\t" + element);
		}
		
		if (set.isEmpty()) { // 객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} 
		else {
			System.out.println("객체 있음");
		}
		
		set.clear(); // 객체 모두 삭제
		if (set.isEmpty()) { // 객체가 하나라도 있는지 확인
			System.out.println("비어 있음");
		} 
		else {
			System.out.println("객체 있음");
		}
	}
}






















