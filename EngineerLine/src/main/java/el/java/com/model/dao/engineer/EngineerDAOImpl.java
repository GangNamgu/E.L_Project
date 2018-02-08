package el.java.com.model.dao.engineer;

import java.util.ArrayList;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import el.java.com.model.dto.EngineerDTO;
import el.java.com.model.dto.ScheduleDTO;

@Repository
public class EngineerDAOImpl implements EngineerDAO{
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public int engineerLogin(String inputName, String inputPassword) {
		// TODO Auto-generated method stub
		Map<String, String> map = null;
		map.put("eName", inputName);
		map.put("ePassword", inputPassword);
		
		return sqlSession.selectOne("engineer.login", map);
	}
	
	@Override
	public String showEngineerName(String eName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EngineerDTO showEngineer(String eName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ScheduleDTO> showSchedule(String eName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertSchedule(String eName, ScheduleDTO sDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSchedule(String eName, ScheduleDTO sDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<EngineerDTO> showEngineers(String eTeam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ScheduleDTO> showEngineersSchedule(String eTeam) {
		// TODO Auto-generated method stub
		return null;
	}
}