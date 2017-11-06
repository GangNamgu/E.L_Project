package el.java.com.service;

import javax.inject.Inject;

import el.java.com.model.dao.Engineer.EngineerDAO;
import el.java.com.model.dao.manager.ManagerDAO;

public class ManagerServiceImpl implements ManagerService{
	@Inject
	ManagerDAO mDao;
}
