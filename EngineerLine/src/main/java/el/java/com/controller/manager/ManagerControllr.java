package el.java.com.controller.manager;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import el.java.com.service.manager.ManagerService;

@Controller
@RequestMapping("manager/*")
public class ManagerControllr {
	private static final Logger logger = LoggerFactory.getLogger(ManagerControllr.class);
//	@Inject
	ManagerService mService;
	
	@RequestMapping("login_to_signup.do")
	public static String goSignup(Model model) { //로그인 페이지 > 회원가입 페이지
		model.addAttribute("msg", "호");
		return "signup";
	}
	
	@RequestMapping("main_to_engineerManage.do")
	public static String goEngineerManage(Model model) { //메인화면 페이지 > 회원관리 페이지
		return "engineerManage";
	}
	
	@RequestMapping("goMain.do")
	public static ModelAndView goMain(HttpSession session) { //로고를 눌렀을 때 메인으로 가기
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		return mav;
		
	}
}
