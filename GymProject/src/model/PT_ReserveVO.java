package model;

import java.sql.Date;

public class PT_ReserveVO {

	private int p_no; // pt등록 일련번호
	private int m_no; // 멤버 일련번호
	private int t_no; // 트레이너 일련번호
	private String t_available; // 수업가능시간
	private int p_count; // pt예약 횟수
	private Date p_date; // pt등록일자
	private int p_payment; // pt 결제금액

	public PT_ReserveVO() {
		super();
	}

	public PT_ReserveVO(int p_no, int m_no, int t_no, String t_available, int p_count, Date p_date, int p_payment) {
		super();
		this.p_no = p_no;
		this.m_no = m_no;
		this.t_no = t_no;
		this.t_available = t_available;
		this.p_count = p_count;
		this.p_date = p_date;
		this.p_payment = p_payment;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public int getT_no() {
		return t_no;
	}

	public void setT_no(int t_no) {
		this.t_no = t_no;
	}

	public String getT_available() {
		return t_available;
	}

	public void setT_available(String t_available) {
		this.t_available = t_available;
	}

	public int getP_count() {
		return p_count;
	}

	public void setP_count(int p_count) {
		this.p_count = p_count;
	}

	public Date getP_date() {
		return p_date;
	}

	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}

	public int getP_payment() {
		return p_payment;
	}

	public void setP_payment(int p_payment) {
		this.p_payment = p_payment;
	}

}