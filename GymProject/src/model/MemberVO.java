package model;

public class MemberVO {

	private int m_no; // 회원 번호
	private String m_name; // 회원이름
	private String m_number; // 회원주민번호
	private String m_phone; // 회원전화번호
	private String m_address; // 회원주소
	private String m_period; // 회원권 기간
	private String m_startdate; // 회원권 시작일
	private String m_enddate; // 회원권 종료일

	public MemberVO() {
		super();
	}

	public MemberVO(int m_no, String m_name, String m_number, String m_phone, String m_address, String m_period,
			String m_startdate, String m_enddate) {
		super();
		this.m_no = m_no;
		this.m_name = m_name;
		this.m_number = m_number;
		this.m_phone = m_phone;
		this.m_address = m_address;
		this.m_period = m_period;
		this.m_startdate = m_startdate;
		this.m_enddate = m_enddate;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_number() {
		return m_number;
	}

	public void setM_number(String m_number) {
		this.m_number = m_number;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public String getM_period() {
		return m_period;
	}

	public void setM_period(String m_period) {
		this.m_period = m_period;
	}
	
	public String getM_startdate() {
		return m_startdate;
	}

	public void setM_startdate(String m_startdate) {
		this.m_startdate = m_startdate;
	}

	public String getM_enddate() {
		return m_enddate;
	}

	public void setM_enddate(String m_enddate) {
		this.m_enddate = m_enddate;
	}
}
