package el.java.com.model.dao.car;

import java.util.ArrayList;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import el.java.com.model.dto.CarDTO;

@Repository
public class CarDAOImpl implements CarDAO{

	@Inject
	//SqlSession sqlSession;
	
	@Override
	public ArrayList<String> showCarList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertCar(CarDTO cDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateCar(CarDTO cDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCar(String cName) {
		// TODO Auto-generated method stub
		return 0;
	}	
}

