package com.vo;

import java.util.Date;

/**
 * Zctransdetail entity. @author MyEclipse Persistence Tools
 */

public class Zctransdetail implements java.io.Serializable {

	// Fields

	private Integer tdid;
	private Assets assets;
	private Userinfo userinfo;
	private Zctrans zctrans;
	private Integer state;
	private Date jsdate;

	// Constructors

	/** default constructor */
	public Zctransdetail() {
	}

	/** full constructor */
	public Zctransdetail(Assets assets, Userinfo userinfo, Zctrans zctrans,
			Integer state, Date jsdate) {
		this.assets = assets;
		this.userinfo = userinfo;
		this.zctrans = zctrans;
		this.state = state;
		this.jsdate = jsdate;
	}

	// Property accessors

	public Integer getTdid() {
		return this.tdid;
	}

	public void setTdid(Integer tdid) {
		this.tdid = tdid;
	}

	public Assets getAssets() {
		return this.assets;
	}

	public void setAssets(Assets assets) {
		this.assets = assets;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public Zctrans getZctrans() {
		return this.zctrans;
	}

	public void setZctrans(Zctrans zctrans) {
		this.zctrans = zctrans;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getJsdate() {
		return this.jsdate;
	}

	public void setJsdate(Date jsdate) {
		this.jsdate = jsdate;
	}

}