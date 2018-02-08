package el.java.com.controller;


import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import el.java.com.service.engineer.EngineerService;
import el.java.com.service.manager.ManagerService;


@Controller
@RequestMapping("/all/*")
public class AllController {	//manager와 engineer 공용으로 사용하는 메소드들을 작성.
	
	private static final Logger logger = LoggerFactory.getLogger(AllController.class);
	
	@Inject
	static EngineerService eService;
	
	@Inject
	static ManagerService mService;
	
	/*@RequestMapping("login.do")
	public static ModelAndView login(String inputName, String inputPassword) {
		inputName = "호";
		inputPassword = "잇";
		ModelAndView mav = new ModelAndView();
		Map<String, String> map = null;
		map.put("name", inputName);
		map.put("password", inputPassword);		
		mav.addObject("inputData", map);
		mav.setViewName("login");
		return mav;
	}*/
	@RequestMapping("goLogin.do")
	public static String goLogin() {
		return "login";
	}
	
	@RequestMapping("name_password_check.do")
	public static ModelAndView namePasswordCheck(String inputName, String inputPassword, HttpSession session, ModelAndView mav) {
		mav = new ModelAndView();
		System.out.println("로그인확인00001\n시작");
		int managerLogin = mService.managerLogin(inputName, inputPassword);
		int engineerLogin = eService.engineerLogin(inputName, inputPassword);
		System.out.println("로그인확인00001\nmanagerLogin: "+managerLogin+"\nengineerLogin: "+engineerLogin);
		if(managerLogin != 1) { //관리자 로그인이 아닐 때
			if(engineerLogin != 1) { //기술자 로그인도 아닐 때
				mav.setViewName("login");
				System.out.println("로그인확인00001\n로그인 실패, 아이디 또는 비밀번호 오류");
			}else { //기술자 로그인일 때
				session.setAttribute("name", inputName); //관리자 아이디 session에 저장
				mav.setViewName("main.do");
				System.out.println("로그인확인00001\n기술자 로그인");
			}
		}else { //관리자 로그인일 때
			session.setAttribute("name", inputName); //기술자 아이디 session에 저장
			mav.setViewName("engineerMySchedule");
			System.out.println("로그인확인00001\n관리자 로그인");
		}
		String mName = "";
		String mPassword = "";
		String eName = "";
		String ePassword = "";
		
		
		//session.setAttribute(inputName, inputPassword);
		return null;
	}
	
}
