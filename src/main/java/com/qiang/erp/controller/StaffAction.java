package com.qiang.erp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.qiang.erp.pojo.Staff;
import com.qiang.erp.service.IStaffService;
import com.qiang.erp.util.PageBean;

@Controller
@Scope("prototype")
public class StaffAction extends ActionSupport{
	@Autowired
	private IStaffService staffService;
	
	public String findAll(){
		System.out.println("zhixing!!!!!!!!!!!!!!!");
		List<Staff> list = staffService.findAll();
		for (Staff staff : list) {
			System.out.println(staff);
		}
		return NONE;
	}
}
