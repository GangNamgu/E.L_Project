package el.java.com.service;

import javax.inject.Inject;

import el.java.com.model.dao.Engineer.EngineerDAO;

public class EngineerServiceImpl implements EngineerService{
	@Inject
	EngineerDAO eDao;
}
