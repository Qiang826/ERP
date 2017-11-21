package com.qiang.erp.dao;

import java.util.List;

import com.qiang.erp.pojo.Staff;

public interface IStaffDao extends IBaseDao<Staff> {

	List<Staff> findAll();

}
