package el.java.com.model.dto;

public class EngineerDTO {
	private String eName;		//기술자 이름(아이디)
	private String ePassword;	//기술자 비밀번호
	private String eTeam;		//기술자가 속한 팀
	private String eHoliday;	//기술자의 휴무 여부(default' ')
	private String eStartHour;	//기술자가 사무실에서 출발한 시(default' ')
	private String eStartMinure;//기술자가 사무실에서 출발한 분(default' ')
	private String e_cName;		//기술자가 사용 중인 차량(=cName/중복 가능/default' ')
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getePassword() {
		return ePassword;
	}
	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}
	public String geteTeam() {
		return eTeam;
	}
	public void seteTeam(String eTeam) {
		this.eTeam = eTeam;
	}
	public String geteHoliday() {
		return eHoliday;
	}
	public void seteHoliday(String eHoliday) {
		this.eHoliday = eHoliday;
	}
	public String geteStartHour() {
		return eStartHour;
	}
	public void seteStartHour(String eStartHour) {
		this.eStartHour = eStartHour;
	}
	public String geteStartMinure() {
		return eStartMinure;
	}
	public void seteStartMinure(String eStartMinure) {
		this.eStartMinure = eStartMinure;
	}
	public String gete_cName() {
		return e_cName;
	}
	public void sete_cName(String e_cName) {
		this.e_cName = e_cName;
	}
}
