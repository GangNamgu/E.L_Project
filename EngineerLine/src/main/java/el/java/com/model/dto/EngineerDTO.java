package el.java.com.model.dto;

public class EngineerDTO {
	private String eId;		//엔지니어 아이디
	private String ePassword;//엔지니어 비밀번호
	private String eName;	//엔지니어 이름
	private int tNum;		//팀 번호
	private String ePlace;	//장소
	private String eAS;		//a/s 완료 유무(N/Y)
	private String holiday;	//휴무(N/Y)
	
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String getePassword() {
		return ePassword;
	}
	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int gettNum() {
		return tNum;
	}
	public void settNum(int tNum) {
		this.tNum = tNum;
	}
	public String getePlace() {
		return ePlace;
	}
	public void setePlace(String ePlace) {
		this.ePlace = ePlace;
	}
	public String geteAS() {
		return eAS;
	}
	public void seteAS(String eAS) {
		this.eAS = eAS;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
}
