package el.java.com.service.car;

import javax.inject.Inject;

import el.java.com.model.dao.Engineer.EngineerDAO;
import el.java.com.model.dao.car.CarDAO;
import el.java.com.model.dao.manager.ManagerDAO;

public class CarServiceImpl implements CarService{
	@Inject
	CarDAO cDao;
}
