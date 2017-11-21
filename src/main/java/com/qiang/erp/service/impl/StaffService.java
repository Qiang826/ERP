package com.qiang.erp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiang.erp.dao.IStaffDao;
import com.qiang.erp.pojo.Staff;
import com.qiang.erp.service.IStaffService;
@Service
public class StaffService implements IStaffService {
	@Autowired
	private IStaffDao staffdao;

	@Override
	public List<Staff> findAll() {
		// TODO Auto-generated method stub
		List<Staff> list = staffdao.findAll();
		return list;
	}
}
