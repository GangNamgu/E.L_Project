package el.java.com.model.dao.manager;

import java.util.ArrayList;

import el.java.com.model.dto.EngineerDTO;
import el.java.com.model.dto.ScheduleDTO;

public interface ManagerDAO {
	//로그인
	//이름과 비밀번호로 요청 후 int값으로 반환
	public int login(String name, String password);

	//전체 기술자 일정보기
	//전체 기술자 기본 정보
	public EngineerDTO showEngineerForManager(String name);	//name이 관리자 이름이여야 함
	//전체 기술자 일정
	public ScheduleDTO showEngineerScheduleForManager(String name);	//name이 관리자 이름이여야 함
	
	//전체 기술자 일정 - 수정
	//기술자들의 기본 정보 전체 수정 후 int로 반환
	public int updateEnigneerFromManger();
	//기술자들의 일정 수정 후 int로 반환
	public int updateEngineerScheduleFromManager();
}