package Exam1108.AlarmClockProject_O;

public class AlaramClockTest {

	public static void main(String[] args) {

		Time alarm1 = new Time(6, 0, 0);
		Time alarm2 = new Time(6, 10, 0);
		Time alarm3 = new Time(6, 10, 0);
		
		// System.out.println(Time.count);  // int count 오류난다. static을 사용하면 "객체의 누적갯수"를 알수있다.
		// 큰물통 static
		System.out.println(alarm1.count);  
		System.out.println(alarm1.getSecond());  
		
		// Time current = new Time(12, 56, 34);
		
		// AlarmClock c = new AlarmClock(current, alarm1);
		
		//System.out.println(c);
		
	}

}
