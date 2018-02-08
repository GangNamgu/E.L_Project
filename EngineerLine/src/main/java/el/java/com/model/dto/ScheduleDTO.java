package el.java.com.model.dto;

public class ScheduleDTO {
	private int sSeq;				//스케줄 구분 순번
	private String s_eName;			//기술자 이름(= eName)
	private String s_oName;			//방문 목적(= oName)
	private String sPlace;			//방문 장소
	private String sEndHour;		//작업 완료 시
	private String sEndMinute;		//작업 완료 분
	
	public int getsSeq() {
		return sSeq;
	}
	public void setsSeq(int sSeq) {
		this.sSeq = sSeq;
	}
	public String gets_oName() {
		return s_oName;
	}
	public void sets_oName(String s_oName) {
		this.s_oName = s_oName;
	}
	public String getsPlace() {
		return sPlace;
	}
	public void setsPlace(String sPlace) {
		this.sPlace = sPlace;
	}
	public String getsEndHour() {
		return sEndHour;
	}
	public void setsEndHour(String sEndHour) {
		this.sEndHour = sEndHour;
	}
	public String getsEndMinute() {
		return sEndMinute;
	}
	public void setsEndMinute(String sEndMinute) {
		this.sEndMinute = sEndMinute;
	}
	public String gets_eName() {
		return s_eName;
	}
	public void sets_eName(String s_eName) {
		this.s_eName = s_eName;
	}
}
