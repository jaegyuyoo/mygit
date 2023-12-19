package Exam1108.AlarmClockProject_O;

public class Time {

		private int time; // 시간
		private int minute; // 분
		private int second; // 초
		int count = 0;

		// 1-1 Generate Constructor using Fields
		public Time() {
			super();
		}

		// 1-1 Generate Constructor using Fields
		public Time(int time, int minute, int second) {
			super();
			this.time = time;
			this.minute = minute;
			this.second = second;
			count++;

		}

		// 2. Generate Getters and Setters
		// 시간 반환
		public int getTime() {
			return time;
		}
		// 시간 변경
		public void setTime(int time) {
			this.time = time;
		}
		// 분 반환
		public int getMinute() {
			return minute;
		}
		// 분 변경
		public void setMinute(int minute) {
			this.minute = minute;
		}
		// 초 반환
		public int getSecond() {
			return second;
		}
		// 초 변경
		public void setSecond(int second) {
			this.second = second;
		}

		@Override
		public String toString() {
			return "Time [time=" + time + ", minute=" + minute + ", second=" + second + "]";
		}
		
		
	}

