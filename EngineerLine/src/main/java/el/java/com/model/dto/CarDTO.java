package el.java.com.model.dto;

public class CarDTO {
	private int sSeq;	//차량 순번(구분을 위한 숫자)
	private String cName;	//차량 이름
	
	public int getsSeq() {
		return sSeq;
	}
	public void setsSeq(int sSeq) {
		this.sSeq = sSeq;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
}