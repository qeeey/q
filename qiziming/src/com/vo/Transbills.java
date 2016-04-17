package com.vo;

import java.util.Date;

/**
 * Transbills entity. @author MyEclipse Persistence Tools
 */

public class Transbills implements java.io.Serializable {

	// Fields

	private Integer tbid;
	private Dept deptByIndid;
	private Userinfo userinfoByInuid;
	private Userinfo userinfoByOutuid;
	private Assets assets;
	private Dept deptByOutdid;
	private Date outdate;
	private String outnote;
	private Integer tbstate;
	private Date inputdate;

	// Constructors

	/** default constructor */
	public Transbills() {
	}

	/** full constructor */
	public Transbills(Dept deptByIndid, Userinfo userinfoByInuid,
			Userinfo userinfoByOutuid, Assets assets, Dept deptByOutdid,
			Date outdate, String outnote, Integer tbstate, Date inputdate) {
		this.deptByIndid = deptByIndid;
		this.userinfoByInuid = userinfoByInuid;
		this.userinfoByOutuid = userinfoByOutuid;
		this.assets = assets;
		this.deptByOutdid = deptByOutdid;
		this.outdate = outdate;
		this.outnote = outnote;
		this.tbstate = tbstate;
		this.inputdate = inputdate;
	}

	// Property accessors

	public Integer getTbid() {
		return this.tbid;
	}

	public void setTbid(Integer tbid) {
		this.tbid = tbid;
	}

	public Dept getDeptByIndid() {
		return this.deptByIndid;
	}

	public void setDeptByIndid(Dept deptByIndid) {
		this.deptByIndid = deptByIndid;
	}

	public Userinfo getUserinfoByInuid() {
		return this.userinfoByInuid;
	}

	public void setUserinfoByInuid(Userinfo userinfoByInuid) {
		this.userinfoByInuid = userinfoByInuid;
	}

	public Userinfo getUserinfoByOutuid() {
		return this.userinfoByOutuid;
	}

	public void setUserinfoByOutuid(Userinfo userinfoByOutuid) {
		this.userinfoByOutuid = userinfoByOutuid;
	}

	public Assets getAssets() {
		return this.assets;
	}

	public void setAssets(Assets assets) {
		this.assets = assets;
	}

	public Dept getDeptByOutdid() {
		return this.deptByOutdid;
	}

	public void setDeptByOutdid(Dept deptByOutdid) {
		this.deptByOutdid = deptByOutdid;
	}

	public Date getOutdate() {
		return this.outdate;
	}

	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}

	public String getOutnote() {
		return this.outnote;
	}

	public void setOutnote(String outnote) {
		this.outnote = outnote;
	}

	public Integer getTbstate() {
		return this.tbstate;
	}

	public void setTbstate(Integer tbstate) {
		this.tbstate = tbstate;
	}

	public Date getInputdate() {
		return this.inputdate;
	}

	public void setInputdate(Date inputdate) {
		this.inputdate = inputdate;
	}

}