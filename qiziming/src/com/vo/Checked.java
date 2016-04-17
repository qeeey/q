package com.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Checked entity. @author MyEclipse Persistence Tools
 */

public class Checked implements java.io.Serializable {

	// Fields

	private Integer checkid;
	private Userinfo userinfo;
	private Date startdate;
	private Integer state;
	private Set checkdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Checked() {
	}

	/** full constructor */
	public Checked(Userinfo userinfo, Date startdate, Integer state,
			Set checkdetails) {
		this.userinfo = userinfo;
		this.startdate = startdate;
		this.state = state;
		this.checkdetails = checkdetails;
	}

	// Property accessors

	public Integer getCheckid() {
		return this.checkid;
	}

	public void setCheckid(Integer checkid) {
		this.checkid = checkid;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Set getCheckdetails() {
		return this.checkdetails;
	}

	public void setCheckdetails(Set checkdetails) {
		this.checkdetails = checkdetails;
	}

}