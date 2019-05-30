package com.innovatoreshub.project.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.innovatoreshub.project.bean.InnovationsRecord;
import com.innovatoreshub.project.bean.InnovatoresPersonalInfo;
import com.innovatoreshub.project.dao.InnovatoresDaoImpl;

@Controller
public class InnovatoresController {
	@Autowired
	InnovationsRecord innovationsrecord;
	@Autowired
	InnovatoresPersonalInfo innovatorespersonalinfo;
	@Autowired
	InnovatoresDaoImpl innovatoresdaoimpl;
	private ArrayList<InnovationsRecord> record;
	@RequestMapping("/signuppage.html")
	public ModelAndView Signup()
	{
		ModelAndView mav=new ModelAndView("signuppage");
		return mav; 	
	}
	@RequestMapping("/innovatorespage")
	public ModelAndView innovatorespage()
	{
		ModelAndView mav=new ModelAndView("innovatorespage");
		return mav; 	
	}
	@RequestMapping("/signup")
	public ModelAndView InnovatoresSignup()
	{
		ModelAndView mav=new ModelAndView("innovatoressignup");
		return mav; 	
	}
	@RequestMapping("innovatoresregister")
	public ModelAndView InnovationsRegister(@RequestParam Map<String,String> map)
	{
		String date=map.get("date");
		String idadhar=map.get("idadhar");
		String username=map.get("username");
		String password=map.get("password");
		String gender=map.get("gender");
		String dob=map.get("dob");
		String department=map.get("department");
		String collegename=map.get("collegename");
		String city=map.get("city");
		String contactno=map.get("contactno");
		String email=map.get("email");
		String address=map.get("address");
		innovatorespersonalinfo.setDate(date);
		innovatorespersonalinfo.setIdadhar(idadhar);
		innovatorespersonalinfo.setUsername(username);
		innovatorespersonalinfo.setPassword(password);
		innovatorespersonalinfo.setGender(gender);
		innovatorespersonalinfo.setDob(dob);
		innovatorespersonalinfo.setDepartment(department);
		innovatorespersonalinfo.setCollegename(collegename);
		innovatorespersonalinfo.setCity(city);
		innovatorespersonalinfo.setContactno(contactno);
		innovatorespersonalinfo.setEmail(email);
		innovatorespersonalinfo.setAddress(address);
		
		innovationsrecord.setEmail(email);
		innovationsrecord.setIdadhar(idadhar);
		innovationsrecord.setInnovationtitle("");
		innovationsrecord.setCategorey("");
		innovationsrecord.setTechnology("");
		innovationsrecord.setShortdescription("");
		innovationsrecord.setLongdescription("");
		innovationsrecord.setVediourl("");
		innovationsrecord.setGithuburl("");
		innovationsrecord.setAttachment("");
		innovationsrecord.setStatus("");
	    record = new ArrayList<InnovationsRecord>();
	    record.add(innovationsrecord);	    
	    innovatorespersonalinfo.setInnovationsinfo(record);
	    innovatoresdaoimpl.registerInnovations(innovatorespersonalinfo);
	    ModelAndView mav=new ModelAndView("loginpage");
		return mav;
	       }
	@RequestMapping("/companypage")
	public ModelAndView innovationRetrive1()
	{
		ModelAndView mav=new ModelAndView("companypage");	
		return mav;
	} 
	@RequestMapping("/companysignup")
	public ModelAndView innovationRetrive3()
	{
		ModelAndView mav=new ModelAndView("companysignup");	
		return mav;
	} 
	@RequestMapping("/peoplesignup")
	public ModelAndView innovationRetrive4()
	{
		ModelAndView mav=new ModelAndView("peoplesignup");	
		return mav;
	} 
	@RequestMapping("/peoplepage")
	public ModelAndView innovationRetrive2()
	{
		ModelAndView mav=new ModelAndView("peoplepage");	
		return mav;
	} 
	@RequestMapping("/innovationsretrive")
	public ModelAndView innovationRetrive()
	{
		ModelAndView mav=new ModelAndView("getInnovations");	
		return mav;
	} 
	@RequestMapping("/getinnovations")
	public ModelAndView getInnovations()
	{
		List Innovatoreslist=innovatoresdaoimpl.getAllInnovationsDetails();
		
		ModelAndView mav=new ModelAndView("display_innovations");
		mav.addObject("innovations",Innovatoreslist);
		return mav;
		
		
	}
	@RequestMapping("/loginpage.html")
	public ModelAndView innvoatoresLoginDispatcher()
	{
		ModelAndView mav=new ModelAndView("loginpage");
		return mav;
		
		
	}
	@RequestMapping("/innovatoreslogin.html")
	public ModelAndView innvoatoresLoginDispatcher1()
	{
		ModelAndView mav=new ModelAndView("innovatoreslogin");
		return mav;
		
		
	}
	@RequestMapping("/innovatoreslogin")
	public ModelAndView innovatoresLogin(@RequestParam("username")String username,@RequestParam("password")String password)
	{
		ModelAndView mav;
		boolean decision = innovatoresdaoimpl.login(username, password);
		if(decision) {
			mav=new ModelAndView("innovatorespage");
		}else {
			mav = new ModelAndView("signuppage");
		}
		return mav;
	}
	@RequestMapping("/innovationsupload.html")
	public ModelAndView innovationsUpload()
	{
		
		ModelAndView mav=new ModelAndView("innovationUpload");
		return mav;
	}
	@RequestMapping("/innovationsupload")
	public ModelAndView innovationsUpload(@RequestParam Map<String,String> map)
	{ 
		String email=map.get("email");
		String idadhar=map.get("idadhar");
		String innovationtitle=map.get("categorey");
		String categorey=map.get("ca tegorey");
		String technology=map.get("technolgy");
		String shortdescription=map.get("shortdescription");
		String longdescription=map.get("longdescription");
		String vediourl=map.get("vediourl");
		String attachment=map.get("attachment");
		String status=map.get("status");
		innovationsrecord.setEmail(email);
		innovationsrecord.setIdadhar(idadhar);
		innovationsrecord.setInnovationtitle(innovationtitle);
		innovationsrecord.setCategorey(categorey);
		innovationsrecord.setTechnology(technology);
		innovationsrecord.setShortdescription(shortdescription);
		innovationsrecord.setLongdescription(longdescription);
		innovationsrecord.setVediourl(vediourl);
		innovationsrecord.setAttachment(attachment);
		innovationsrecord.setStatus(status);
		Long l=innovatoresdaoimpl.innovationsUpload(innovationsrecord,idadhar);
		ModelAndView mav=new ModelAndView("innovatores_update_info");
		if(l!=-1)
		{
			mav.addObject("msg","updatesuccessfully !");
			return mav;
		}else {
			mav.addObject("msg"," Not updated please try again!");
			return mav;
			
		}
	}
	@RequestMapping("/updateinnovators")
	public ModelAndView innovatorsUpdateDispatcher()
	{
	
		ModelAndView mav=new ModelAndView("UpdateInnovator");
		return mav;
	}
	@RequestMapping("/update")
	public ModelAndView innovatorsUpdate(@RequestParam Map<String,String> map)
	{
		String idadhar=map.get("idadhar");
		String contactno=map.get("contactno");
		Long l=innovatoresdaoimpl.update(idadhar,contactno);
		ModelAndView mav=new ModelAndView("innovatores_update_info");
		if(l!=-1)
		{
			mav.addObject("msg","updatesuccessfully !");
			return mav;
		}else {
			mav.addObject("msg"," Not updated please try again!");
			return mav;
			
		}
	}
	
	
        }