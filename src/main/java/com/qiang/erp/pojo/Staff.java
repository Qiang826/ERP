package com.qiang.erp.pojo;

import java.util.Date;

public class Staff {

	private Integer id;
	private Integer staff_id;
	private String staff_name;
	private String password;
	private String duty;
	private String real_name;
	private Integer phone;
	private Integer qq;
	private String weixing;
	private Date create_time;

	public Staff(Integer id, Integer staff_id, String staff_name, String password, String duty, String real_name,
			Integer phone, Integer qq, String weixing, Date create_time) {
		super();
		this.id = id;
		this.staff_id = staff_id;
		this.staff_name = staff_name;
		this.password = password;
		this.duty = duty;
		this.real_name = real_name;
		this.phone = phone;
		this.qq = qq;
		this.weixing = weixing;
		this.create_time = create_time;
	}

	public Staff() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}

	public String getStaff_name() {
		return staff_name;
	}

	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getQq() {
		return qq;
	}

	public void setQq(Integer qq) {
		this.qq = qq;
	}

	public String getWeixing() {
		return weixing;
	}

	public void setWeixing(String weixing) {
		this.weixing = weixing;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", staff_id=" + staff_id + ", staff_name=" + staff_name + ", password=" + password
				+ ", duty=" + duty + ", real_name=" + real_name + ", phone=" + phone + ", qq=" + qq + ", weixing="
				+ weixing + ", create_time=" + create_time + "]";
	}

}
