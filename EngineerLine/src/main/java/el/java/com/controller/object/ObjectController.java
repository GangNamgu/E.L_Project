package el.java.com.controller.object;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import el.java.com.service.object.ObjectService;

@Controller
@RequestMapping("object/*")
public class ObjectController {
	
	private static final Logger logger = LoggerFactory.getLogger(ObjectController.class);
//	@Inject
	ObjectService oService;
	
	@RequestMapping("main_to_objectManage.do")
	public static String goObjectManage(Model model) {
		return "objectManage";
	}
}
