package el.java.com.model.dto;

public class ManagerDTO {
	private String mId;		//������ ���̵�
	private String mPassword;//������ ��й�ȣ
	private String mName;	//������ �̸�
	private String mArea;	//���� ����
	private String resign;	//����(N/Y)
	
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmArea() {
		return mArea;
	}
	public void setmArea(String mArea) {
		this.mArea = mArea;
	}
	public String getResign() {
		return resign;
	}
	public void setResign(String resign) {
		this.resign = resign;
	}
}