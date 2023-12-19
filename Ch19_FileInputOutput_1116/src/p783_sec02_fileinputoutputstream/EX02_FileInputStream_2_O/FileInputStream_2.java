package p783_sec02_fileinputoutputstream.EX02_FileInputStream_2_O;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileInputStream_2 {
	public static void main(String[] args) throws IOException{
		// 입력파일 생성
		File inFile = new File("src/sec02_fileinputoutputstream/FileInput-Stream1.txt");
		
		// 1. 1-bye 단위 일기
		InputStream is1 = new FileInputStream(inFile);
		int data;
		while ((data=is1.read()) != -1) { // -1 파일이 끝냄을 나타냄 
			System.out.print((char)data);
		} 
		is1.close(); // 자원반납 
		System.out.println();
		System.out.println();
		
		// 2. n-byte 단위 읽기(byte[]의 처음 위치에서부터 읽은 데이터 저장)
		InputStream is2 = new FileInputStream(inFile);
		byte[] byteArray1 = new byte[9];
		int count1;
		while ((count1 = is2.read(byteArray1)) != -1) { // count1 = 9, 9, 2, -1
			for (int i = 0; i < count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
			System.out.println(": count1 = " + count1);
		}
		is2.close();
		System.out.println();
		System.out.println();
		
		// 3. n-byte 단위 읽기 (앞에서 length 만큼 읽어 byte[] offset 위치에서부터 입력)
		InputStream is3 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[9]; // 최소 offset + lenght
		int offset = 3; // 2. 배열의 3번위치에 넣어서 
		int length = 6; // 1. 파일의 6개를뽑아서 
		int count2 = is3.read(byteArray2, offset, length);
		for (int i = 0; i < offset + count2; i++) {
			System.out.print((char)byteArray2[i]);
		}
	}
}
