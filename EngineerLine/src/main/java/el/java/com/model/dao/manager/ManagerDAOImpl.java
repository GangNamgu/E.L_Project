package el.java.com.model.dao.manager;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import el.java.com.model.dto.EngineerDTO;
import el.java.com.model.dto.ScheduleDTO;

@Repository
public class ManagerDAOImpl implements ManagerDAO{
	
	@Inject
	SqlSession sqlSession;
	
	@Override
	public int login(String name, String password) {
		//관리자 이름과 비밀번호 확인 (있: 1, 없: 0)
		Map<String, String> map = null;
		map.put("name", name);
		map.put("password", password);
		return sqlSession.selectOne("manager.login", map);
	}

	@Override
	public EngineerDTO showEngineerForManager(String name) {
		//기술자 목록을 쭉 나열 (EngineerDTO형태로 가져옴)
		return (EngineerDTO) sqlSession.selectList("manager.showEngineerForManager", name);
	}

	@Override
	public ScheduleDTO showEngineerScheduleForManager(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEnigneerFromManger() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateEngineerScheduleFromManager() {
		// TODO Auto-generated method stub
		return 0;
	}

}
