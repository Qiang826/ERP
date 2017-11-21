package com.qiang.erp.util;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public class PageBean<T> {
	private Integer currentPage;
	private Integer pageSize;
	private DetachedCriteria detachedCriteria;
	private Integer total;
	private List<T> rows;

	public PageBean(Integer currentPage, Integer pageSize, DetachedCriteria detachedCriteria, Integer total,
			List<T> rows) {
		super();
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.detachedCriteria = detachedCriteria;
		this.total = total;
		this.rows = rows;
	}

	public PageBean() {
		super();
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public DetachedCriteria getDetachedCriteria() {
		return detachedCriteria;
	}

	public void setDetachedCriteria(DetachedCriteria detachedCriteria) {
		this.detachedCriteria = detachedCriteria;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageBean [currentPage=" + currentPage + ", pageSize=" + pageSize + ", detachedCriteria="
				+ detachedCriteria + ", total=" + total + ", rows=" + rows + "]";
	}

}
