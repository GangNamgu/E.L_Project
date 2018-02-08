package el.java.com.model.dao.object;

import el.java.com.model.dto.ObjectDTO;

public interface ObjectDAO {
	//방문 목적 목록 보여주기
	public String showObjectList();
	
	//방문 목적 관리 - 추가
	public int insertObject(ObjectDTO oDTO);
	
	//방문 목적 관리 - 수정
	public int updateObject(ObjectDTO oDTO);
	
	//방문 목적 관리 - 삭제
	public int deleteObject(String oName);
}