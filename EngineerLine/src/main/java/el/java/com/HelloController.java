package el.java.com;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello/*")
public class HelloController {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(HelloController.class);
	//private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	//private Logger log = Logger.getLogger(this.getClass());


	/*public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) throws Exception{
		log.debug("================Method Name: hello");
		ModelAndView mav = new ModelAndView("hello/hello");
		mav.addObject("hello", "hello world~");
		mav.setViewName("/hello.jsp");
		return mav;
	}*/
	
	@RequestMapping("/hello.do")
	public String hello(){
		
		return "/hello";
	}
	
	public ModelAndView now(HttpServletRequest request, HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView("hello/now");
		Date curDate = new Date();
		mav.addObject("curDate", curDate);
		return mav;
	}
}
