package com.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Purchase entity. @author MyEclipse Persistence Tools
 */

public class Purchase implements java.io.Serializable {

	// Fields

	private Integer purid;
	private Userinfo userinfo;
	private Dept dept;
	private Date buydate;
	private String cgyt;
	private Integer zt;
	private Set purchasedetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Purchase() {
	}

	/** full constructor */
	public Purchase(Userinfo userinfo, Dept dept, Date buydate, String cgyt,
			Integer zt, Set purchasedetails) {
		this.userinfo = userinfo;
		this.dept = dept;
		this.buydate = buydate;
		this.cgyt = cgyt;
		this.zt = zt;
		this.purchasedetails = purchasedetails;
	}

	// Property accessors

	public Integer getPurid() {
		return this.purid;
	}

	public void setPurid(Integer purid) {
		this.purid = purid;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Date getBuydate() {
		return this.buydate;
	}

	public void setBuydate(Date buydate) {
		this.buydate = buydate;
	}

	public String getCgyt() {
		return this.cgyt;
	}

	public void setCgyt(String cgyt) {
		this.cgyt = cgyt;
	}

	public Integer getZt() {
		return this.zt;
	}

	public void setZt(Integer zt) {
		this.zt = zt;
	}

	public Set getPurchasedetails() {
		return this.purchasedetails;
	}

	public void setPurchasedetails(Set purchasedetails) {
		this.purchasedetails = purchasedetails;
	}

}