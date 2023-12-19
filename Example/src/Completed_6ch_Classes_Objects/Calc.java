package Completed_6ch_Classes_Objects;

public class Calc {

	// 필드
	private int firstnumber; // 첫번째 정수 
	private int secondnumber; // 두번째 정수
	
	// 1-1.여기까지 type or Generate Constructor using Fields (체크 off)
	public Calc() {
		super();
	} 
	
	// 1-2 전체에 관련된 생성자 생성 
	public Calc(int firstnumber, int secondnumber) {
		super();
		this.firstnumber = firstnumber;
		this.secondnumber = secondnumber;
	}


	// 2. Generate Getters and Setters (체크 on)
	public int getFirstnumber() {
		return firstnumber;
	}
	public void setFirstnumber(int firstnumber) {
		this.firstnumber = firstnumber;
	}
	public int getSecondnumber() {
		return secondnumber;
	}
	public void setSecondnumber(int secondnumber) {
		this.secondnumber = secondnumber;
	}

	// 더하기 메서드
	public int plus() { 
		int result;

		result = firstnumber + secondnumber;
		
		return result;
	}
	
	// 3. Generate toString (method만 체크 on)
	@Override
	public String toString() {
		return "Calc [getFirstnumber()=" + getFirstnumber() + ", getSecondnumber()=" + getSecondnumber() + ", plus()="
				+ plus() + "]";
	}
	
	
}
