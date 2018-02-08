package el.java.com.model.dto;

public class ManagerDTO {
	private String mName;		//관리자 이름(아이디)
	private String mPassword;	//관리자 비밀번호
	
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmPassword() {
		return mPassword;
	}
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
}