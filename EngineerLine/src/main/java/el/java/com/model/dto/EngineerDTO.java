package el.java.com.model.dto;

public class EngineerDTO {
	private String eId;		//�����Ͼ� ���̵�
	private String ePassword;//�����Ͼ� ��й�ȣ
	private String eName;	//�����Ͼ� �̸�
	private int tNum;		//�� ��ȣ
	private String ePlace;	//���
	private String eAS;		//a/s �Ϸ� ����(N/Y)
	private String holiday;	//�޹�(N/Y)
	
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
