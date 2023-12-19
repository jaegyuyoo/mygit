
public class Corona19Data {

	private int seq; // 게시글 번호
	private String createDt; // 등록일시분초
	private int deathCnt; // 사망자수
	private int defCnt; // 확진자수
	private String gubun; // 시도명(한글)
	private String gubunCn; // 시도명(중국어)
	private String gubunEn; // 시도명(영어)
	private int incDec; // 전일대비 증감수
	private int isolClearCnt; // 격리 해제수
	private int localOccCnt; // 지역발생 수
	private int overFlowCnt; // 해외유입 수
	private String qurRate; // 10만명당 발생률
	private String stdDay; // 기준일시
	private String updateDt; // 수정일시분초

	public Corona19Data() {
		super();
	}

	public Corona19Data(int seq, String createDt, int deathCnt, int defCnt, String gubun, String gubunCn,
			String gubunEn, int incDec, int isolClearCnt, int localOccCnt, int overFlowCnt, String qurRate,
			String stdDay, String updateDt) {
		super();
		this.seq = seq;
		this.createDt = createDt;
		this.deathCnt = deathCnt;
		this.defCnt = defCnt;
		this.gubun = gubun;
		this.gubunCn = gubunCn;
		this.gubunEn = gubunEn;
		this.incDec = incDec;
		this.isolClearCnt = isolClearCnt;
		this.localOccCnt = localOccCnt;
		this.overFlowCnt = overFlowCnt;
		this.qurRate = qurRate;
		this.stdDay = stdDay;
		this.updateDt = updateDt;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getCreateDt() {
		return createDt;
	}

	public void setCreateDt(String createDt) {
		this.createDt = createDt;
	}

	public int getDeathCnt() {
		return deathCnt;
	}

	public void setDeathCnt(int deathCnt) {
		this.deathCnt = deathCnt;
	}

	public int getDefCnt() {
		return defCnt;
	}

	public void setDefCnt(int defCnt) {
		this.defCnt = defCnt;
	}

	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getGubunCn() {
		return gubunCn;
	}

	public void setGubunCn(String gubunCn) {
		this.gubunCn = gubunCn;
	}

	public String getGubunEn() {
		return gubunEn;
	}

	public void setGubunEn(String gubunEn) {
		this.gubunEn = gubunEn;
	}

	public int getIncDec() {
		return incDec;
	}

	public void setIncDec(int incDec) {
		this.incDec = incDec;
	}

	public int getIsolClearCnt() {
		return isolClearCnt;
	}

	public void setIsolClearCnt(int isolClearCnt) {
		this.isolClearCnt = isolClearCnt;
	}

	public int getLocalOccCnt() {
		return localOccCnt;
	}

	public void setLocalOccCnt(int localOccCnt) {
		this.localOccCnt = localOccCnt;
	}

	public int getOverFlowCnt() {
		return overFlowCnt;
	}

	public void setOverFlowCnt(int overFlowCnt) {
		this.overFlowCnt = overFlowCnt;
	}

	public String getQurRate() {
		return qurRate;
	}

	public void setQurRate(String qurRate) {
		this.qurRate = qurRate;
	}

	public String getStdDay() {
		return stdDay;
	}

	public void setStdDay(String stdDay) {
		this.stdDay = stdDay;
	}

	public String getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}

	@Override
	public String toString() {
		return "Corona19Data [게시글번호=" + seq + ", 등록일시분초=" + createDt + ", 사망자 수=" + deathCnt + ", 확진자 수=" + defCnt
				+ ", 시도명(한글)=" + gubun + ", 시도명(중국어)=" + gubunCn + ", 시도명(영어)=" + gubunEn + ", 전일대비 증감 수=" + incDec
				+ ", 격리 해제 수=" + isolClearCnt + ", 지역발생 수=" + localOccCnt + ", 해외유입 수=" + overFlowCnt + ", 10만명당 발생률="
				+ qurRate + ", 기준일시=" + stdDay + ", 수정일시분초=" + updateDt + "]";
	}
}
