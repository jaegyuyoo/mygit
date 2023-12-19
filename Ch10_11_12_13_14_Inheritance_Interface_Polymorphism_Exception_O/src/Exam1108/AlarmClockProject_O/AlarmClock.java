package Exam1108.AlarmClockProject_O;

public class AlarmClock {
	// *has a 관계의 객체 필드 
	private Time curreTime; // 현재 시간 객체 선언 (Time이라는 객체 사용 + 이름 지정) 
	private Time alarmTime; // 알람 시간 객체 선언 
	
	// 1-1 Generate Constructor using Fields
	public AlarmClock() {
		super();
	}
	// 1-1 Generate Constructor using Fields
	public AlarmClock(Time curreTime, Time alarmTime) {
		super();
		this.curreTime = curreTime;
		this.alarmTime = alarmTime;
	}

	// 2. Generate Getters and Setters
	// 현재 시간 반환
	public Time getCurreTime() {
		return curreTime;
	}
	// 현재 시간 변경
	public void setCurreTime(Time curreTime) {
		this.curreTime = curreTime;
	}
	// 알람 시간 반환
	public Time getAlarmTime() {
		return alarmTime;
	}
	// 알람 시간 변경
	public void setAlarmTime(Time alarmTime) {
		this.alarmTime = alarmTime;
	}

	@Override
	public String toString() {
		return "AaramClock [curreTime=" + curreTime + ", alarmTime=" + alarmTime + "]";
	}
	
	
	
	
	}