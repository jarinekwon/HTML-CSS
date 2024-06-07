package chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream("D:\\dev\\work_java\\Java_240520\\test.txt"); // upcasting

		int readByte;
		byte[] readBytes = new byte[3];
		String data = "";
		
		while (true) {
//			readByte = is.read(); // 1byte 단위로 읽는다.(정수로 받음) ex> 호미
			readByte = is.read(readBytes); // 3byte 단위로 읽음(정수로 받음) ex> 삽
			if (readByte == -1) {
				break;
			}
//			System.out.print((char)readByte); // 문자 3개를 형변환하면서 오류 ex> aaa -> char
			data += new String(readBytes, 0, readByte);
//			readBytes를 0인덱스에서 readByte 길이만큼 읽음
		}
		System.out.print(data);
		is.close();
	}
}
