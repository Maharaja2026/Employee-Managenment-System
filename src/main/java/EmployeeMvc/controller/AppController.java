package EmployeeMvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import EmployeeMvc.dao.EmployeeDao;
import EmployeeMvc.dto.Employee;

@Controller
public class AppController 
{
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/test")
	public void test(HttpServletResponse resp) throws IOException
	{
		PrintWriter pw = resp.getWriter();
		pw.print("Hello world..!");
	}
	
	public ModelAndView signup()
	{
		ModelAndView view = new ModelAndView();
		view.addObject("employee", new Employee());
		view.setViewName("signup.jsp");
		return view;
	}
	
	@RequestMapping("/save")
	public void saveEmployee(@ModelAttribute Employee employee)
	{
		dao.saveEmployee(employee);
//		ModelAndView view = new ModelAndView();
//		view.setViewName("login.jsp");
//		return view;
	}
	

}
