package chapter09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		
		File dir = new File("D:\\dev\\work_java\\Java_240520\\aaa\\bbb");
		File file1 = new File("D:\\dev\\work_java\\Java_240520\\aaa\\file1");
		File file2 = new File("D:\\dev\\work_java\\Java_240520\\aaa\\file2");
		File file3 = new File("D:\\dev\\work_java\\Java_240520\\aaa\\file3");
//		dir.createNewFile(); // 파일 만들기
		dir.mkdir(); // 디렉토리 만들기
		dir.mkdirs(); // 하위 디렉토리 같이 만들기
		file1.createNewFile(); // 파일 만들기
		file2.createNewFile(); // 파일 만들기
		file3.createNewFile(); // 파일 만들기
		
		File test = new File("D:\\dev\\work_java\\Java_240520\\aaa"); // 디렉토리 정보를 가지고 test 객체 생성
		File[] contents = test.listFiles(); // 디렉토리 정보를 가지고 옴(하위 디렉토리들 + 파일들)
		System.out.println("날짜          시간         형태            크기      이름");
		System.out.println("------------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
//			System.out.print(contents[i].lastModified()); // 마지막 생성일자
//			1970년 1월 1일 기준으로 오늘까지의 millsec(1/1000초)로 계산된 값(long type)
			System.out.print(sdf.format(new Date(contents[i].lastModified()))); // 마지막 생성일자
			if (contents[i].isDirectory()) { // 디렉토리면 참
				System.out.println("\t<DIR>\t\t" + contents[i].getName());
			} else {
				System.out.println("\t\t\t" +contents[i].length() + "\t" + contents[i].getName());
			}

		}
	}
}
