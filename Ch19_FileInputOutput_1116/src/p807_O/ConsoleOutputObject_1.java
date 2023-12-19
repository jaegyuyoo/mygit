package p807_O;

import java.io.IOException;
import java.io.OutputStream;

public class ConsoleOutputObject_1 {

	public static void main(String[] args) throws IOException{

		OutputStream os = System.out;
		
		// 1. 1-byte 단위 읽기
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\r'); // 13(생략 가능)
		os.write('\n'); // 10 개행 /r/n
		os.flush();
		
		// 2. n-byte 단위 읽기(byte[]의 처음 위치에서부터 읽은 데이터 저장)
		byte[] byteArray1 = "Hello".getBytes();
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		
		// 3. n-byte 단위 읽기(앞에서 length만큼 읽어 byte[] offset 위치에 넣기)
		byte[] byteArray2 = "Better the last smile than the first laugher".getBytes();
		os.write(byteArray2, 7, 8);
		os.flush();
		
	}

}
