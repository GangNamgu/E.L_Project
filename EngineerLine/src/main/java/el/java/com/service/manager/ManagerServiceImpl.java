package el.java.com.service.manager;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import el.java.com.model.dao.manager.ManagerDAO;

@Service
public class ManagerServiceImpl implements ManagerService{
	@Inject
	ManagerDAO mDao;

	@Override
	public int managerLogin(String inputName, String inputPassword) {
		// TODO Auto-generated method stub
		return mDao.login(inputName, inputPassword);
	}

}
