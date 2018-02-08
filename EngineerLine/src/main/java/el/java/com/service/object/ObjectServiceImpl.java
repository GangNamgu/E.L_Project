package el.java.com.service.object;

import javax.inject.Inject;

import el.java.com.model.dao.object.ObjectDAO;

public class ObjectServiceImpl implements ObjectService{
	@Inject
	ObjectDAO oDao;
}
