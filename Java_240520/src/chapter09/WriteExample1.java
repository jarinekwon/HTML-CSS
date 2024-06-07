package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;
//ctrl + shift + o -> import 안쓰는 것 한번에 삭제

public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("D:\\dev\\work_java\\Java_240520\\output.txt"); // upcasting
		byte[] data = "ABC".getBytes();
//		바이트 단위로 문자열을 읽음
		
		for (int i = 0; i < data.length; i++) {
//		FileOutputStream 객체에 바이트 배열원소를 넣음
			os.write(data[i]);
		}
		os.close();
	}
}
