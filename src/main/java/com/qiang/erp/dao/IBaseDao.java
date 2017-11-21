package com.qiang.erp.dao;

import java.io.Serializable;
import java.util.List;

import com.qiang.erp.util.PageBean;

public interface IBaseDao<T> {

	public void save(T entity);

	public boolean delect(T entity);

	public void update(T entity);

	public void findById(Serializable id);

	public List<T> findAll();

	public void pageQery(PageBean pageBean);
}
