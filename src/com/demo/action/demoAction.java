package com.demo.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("demo")
public class demoAction {
	
	//地址跳转
	@RequestMapping(value="first")
	public ModelAndView first(){
		ModelAndView view = new ModelAndView();
		return view;
	}
	//返回json数据
	
	
	@RequestMapping(value="second")
	public @ResponseBody String second(){
		//取一个对象
		return "";
		//return GsonJson.getGson().tojson();
	}
	

}
