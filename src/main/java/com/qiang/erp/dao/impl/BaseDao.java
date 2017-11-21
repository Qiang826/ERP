package com.qiang.erp.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.qiang.erp.dao.IBaseDao;
import com.qiang.erp.util.PageBean;

public class BaseDao<T> extends HibernateDaoSupport implements IBaseDao<T>{

	public Class<T> entityClass;
	
	@Resource
	public void setMySessionFactory(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
	}
	 public BaseDao() {
		Type type = this.getClass().getGenericSuperclass();
		ParameterizedType superClass = (ParameterizedType) type;
		Type[] actualTypeArguments = superClass.getActualTypeArguments();
		entityClass = (Class<T>) actualTypeArguments[0];
	 }
	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(entity);
	}

	@Override
	public boolean delect(T entity) {
		// TODO Auto-generated method stub
		try{
			getHibernateTemplate().delete(entity);
		}catch(Exception e){
			return false;
		}
		return true;
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().update(entity);
	}

	@Override
	public void findById(Serializable id) {
		// TODO Auto-generated method stub
		getHibernateTemplate().get(entityClass, id);
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		String sql = "FROM " +entityClass.getSimpleName();
		return (List<T>) getHibernateTemplate().find(sql);
	}

	@Override
	public void pageQery(PageBean pageBean) {
		// TODO Auto-generated method stub
		Integer currentPage = pageBean.getCurrentPage();
		Integer pageSize = pageBean.getPageSize();
		DetachedCriteria detachedCriteria = pageBean.getDetachedCriteria();
		detachedCriteria.setProjection(Projections.rowCount());
		List<?> countList = getHibernateTemplate().findByCriteria(detachedCriteria);
		long total = (Long) countList.get(0);
		pageBean.setTotal((int)total);
		detachedCriteria.setProjection(null);
		int firstResult = (currentPage - 1) * pageSize;
		List<?> rows = getHibernateTemplate().findByCriteria(detachedCriteria, firstResult, pageSize);
		//String sql = "FROM Student limit ?,? ";
		//getHibernateTemplate().find(sql, firstResult, pageSize);
		pageBean.setRows(rows);
	}

}
