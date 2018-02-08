package el.java.com.service.engineer;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import el.java.com.model.dao.engineer.EngineerDAO;

@Service
public class EngineerServiceImpl implements EngineerService{
	@Inject
	EngineerDAO eDao;

	@Override
	public int engineerLogin(String inputName, String inputPassword) {
		// TODO Auto-generated method stub
		return eDao.engineerLogin(inputName, inputPassword);
	}
	
}
