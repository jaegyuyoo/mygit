package p809_O;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;


public class ConsoleOutputObject_2 {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;
		
		// n-byte 단위 읽기(byte[]의 처음 위치에서부터 읽은 데이터 저장)
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("UTF-8"));
		os.write(byteArray1);
		os.write('\n');
		os.flush();
		
		// n-byte 단위 읽기(앞에서 length만큼 읽어 byte[] offset 위치에 넣기)
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.defaultCharset());
		os.write(byteArray2, 6, 6);
		os.flush();
	}

}
