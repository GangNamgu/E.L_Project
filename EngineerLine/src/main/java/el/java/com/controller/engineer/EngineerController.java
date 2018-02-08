package el.java.com.controller.engineer;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import el.java.com.service.engineer.EngineerService;

@Controller
@RequestMapping("engineer/*")
public class EngineerController {
	
	private static final Logger logger = LoggerFactory.getLogger(EngineerController.class);
//	@Inject
	EngineerService eService;
	
	@RequestMapping("goMain.do")
	public static String goMain(Model model) {
		return "main";
	}
}
