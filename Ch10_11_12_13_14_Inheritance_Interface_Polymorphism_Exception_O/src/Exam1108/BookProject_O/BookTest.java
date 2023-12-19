package Exam1108.BookProject_O;

public class BookTest {

	public static void main(String[] args) {
		
		// 필요한 변수만 적는다 set으받아 해당 class로 리턴된두 get으로 출력한다.
		
		Book yoo = new Magazine();
		Magazine m;
		m = (Magazine) yoo;
		
		m.setRelaseDate("12월");
		
		System.out.println(m);
		
/*		
		yoo.setAuthor("호세");
		yoo.setNumberOfPage(1);
		yoo.setTitle("꿈");
		yoo.setRelaseDate("12월");
		
		System.out.println(yoo);
*/
	
	}

}
