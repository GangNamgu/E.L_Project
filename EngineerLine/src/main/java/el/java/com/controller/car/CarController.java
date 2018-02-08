package el.java.com.controller.car;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import el.java.com.controller.AllController;
import el.java.com.service.car.CarService;

@Controller
@RequestMapping("car/*")
public class CarController {
	
	private static final Logger logger = LoggerFactory.getLogger(CarController.class);
//	@Inject
	CarService cService;
	
	@RequestMapping("main_to_carManage.do")
	public static String goCarManage(Model model) {
		return "carManage";
	}
}
