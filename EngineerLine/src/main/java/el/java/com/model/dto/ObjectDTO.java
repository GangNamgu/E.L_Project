package el.java.com.model.dto;

public class ObjectDTO {
	private int oSeq;	//방문 목적 순번(구분을 위한 숫자)
	private String oName;	//방문 목적 이름
	
	public int getoSeq() {
		return oSeq;
	}
	public void setoSeq(int oSeq) {
		this.oSeq = oSeq;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
}