package com.innovatoreshub.project.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class CompanyController {
	
	@RequestMapping("/companysignup")
	public ModelAndView companysignupDispatcher()
	{
		
		ModelAndView mav=new ModelAndView("companysignup");
		return mav;
	}
	@RequestMapping("/companydetailsUpload")
	public ModelAndView companySignup(@RequestParam Map<String,String> param)
	{
		String date=param.get("date");
		String companyname=param.get("companyname");
		String password=param.get("password");
		String companydomain=param.get("companydomain");
		String email=param.get("email");
		String contact=param.get("contact");
		String city=param.get("city");
		String address=param.get("address");	
		
		ModelAndView mav=new ModelAndView("companylogin");
		return mav;
	}

}
