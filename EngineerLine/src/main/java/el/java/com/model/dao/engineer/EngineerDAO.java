package el.java.com.model.dao.engineer;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import el.java.com.model.dto.EngineerDTO;
import el.java.com.model.dto.ScheduleDTO;

@Repository
public interface EngineerDAO {
	//로그인할 때 
	//int값으로 반환 (1: 있음, 0: 없음)
	public int engineerLogin(String inputName, String inputPassword);
	
	//접속한 기술자 이름 보여주기
	//String으로 반환
	public String showEngineerName(String eName);
	
	//접속한 기술자의 일정 보여주기(Engineer, schedule)
	//기술자 정보 - EngineerDTO로 반환
	public EngineerDTO showEngineer(String eName);
	//일정 - ScheduleDTO배열로 반환
	public ArrayList<ScheduleDTO> showSchedule(String eName);
	
	//일정 추가
	//기술자 이름과 추가할 일정을 이용해 추가 후 int값으로 반환.
	public int insertSchedule(String eName, ScheduleDTO sDTO);
	
	//일정 수정
	//기술자이름과 수정할 일정으로 요청 후 int값으로 반환
	//배열로 수정하는 이유: 여러개 동시 수정할 경우를 생각함.
	public int updateSchedule(String eName, ScheduleDTO sDTO);
	
	//팀 일정 보기
	//기술자의 소속 팀에 해당하는 기술자들의 기본 정보를 배열 형식으로 불러옴.
	public ArrayList<EngineerDTO> showEngineers(String eTeam);
	//기술자의 소속 팀에 해당하는 기술자들의 일정을 배열 형식으로 불러옴.
	public ArrayList<ScheduleDTO> showEngineersSchedule(String eTeam);
	
}