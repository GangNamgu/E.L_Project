package el.java.com.service.car;

import javax.inject.Inject;

import el.java.com.model.dao.car.CarDAO;

public class CarServiceImpl implements CarService{
	@Inject
	CarDAO cDao;
}
