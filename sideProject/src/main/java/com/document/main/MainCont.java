package com.document.main;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



//@Controller
//@RequestMapping(value="/main")
//public class MainCont {
//	@RequestMapping("/main")
//   public void helloWorld(Model model) {
//      model.addAttribute("name", "Chori");
//      model.addAttribute("hello", "Hello Spring Study!!!");
//   }
//}

@Controller
public class MainCont {
	@RequestMapping("/main.do")
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response) {
//        model.addAttribute("name", "Chori");
//        model.addAttribute("hello", "Hello Spring Study!!!");
        ModelAndView mv = new ModelAndView();
        mv.addObject("viewName", "main");
        mv.setViewName("config");
        return mv; // 뷰 이름을 반환
    }
	 
    @RequestMapping("/hello.do")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, ßSpring MVC!");
        return "hello";
    }

}
