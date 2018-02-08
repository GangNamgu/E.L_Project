package el.java.com.model.dao.car;

import java.util.ArrayList;

import el.java.com.model.dto.CarDTO;

public interface CarDAO {
	//차량 리스트를 보여주는데 String배열로 받음
	public ArrayList<String> showCarList(); 
	
	//차량 등록 후 int로 반환
	public int insertCar(CarDTO cDto); 
	
	//차량 수정 후 int로 반환
	public int updateCar(CarDTO cDto);
	
	//차량 삭제 후 int로 반환(차량 이름만 사용)
	public int deleteCar(String cName); 
}