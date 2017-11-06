package el.java.com.service.place;

import javax.inject.Inject;

import el.java.com.model.dao.place.PlaceDAO;

public class PlaceServiceImpl implements PlaceService{
	@Inject
	PlaceDAO pDao;
}
