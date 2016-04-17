package com.vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Zctrans entity. @author MyEclipse Persistence Tools
 */

public class Zctrans implements java.io.Serializable {

	// Fields

	private Integer transid;
	private Userinfo userinfoByYjuid;
	private Userinfo userinfoByUid;
	private Date startdate;
	private Date enddate;
	private Integer state;
	private Integer trantype;
	private Set zctransdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Zctrans() {
	}

	/** full constructor */
	public Zctrans(Userinfo userinfoByYjuid, Userinfo userinfoByUid,
			Date startdate, Date enddate, Integer state, Integer trantype,
			Set zctransdetails) {
		this.userinfoByYjuid = userinfoByYjuid;
		this.userinfoByUid = userinfoByUid;
		this.startdate = startdate;
		this.enddate = enddate;
		this.state = state;
		this.trantype = trantype;
		this.zctransdetails = zctransdetails;
	}

	// Property accessors

	public Integer getTransid() {
		return this.transid;
	}

	public void setTransid(Integer transid) {
		this.transid = transid;
	}

	public Userinfo getUserinfoByYjuid() {
		return this.userinfoByYjuid;
	}

	public void setUserinfoByYjuid(Userinfo userinfoByYjuid) {
		this.userinfoByYjuid = userinfoByYjuid;
	}

	public Userinfo getUserinfoByUid() {
		return this.userinfoByUid;
	}

	public void setUserinfoByUid(Userinfo userinfoByUid) {
		this.userinfoByUid = userinfoByUid;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getTrantype() {
		return this.trantype;
	}

	public void setTrantype(Integer trantype) {
		this.trantype = trantype;
	}

	public Set getZctransdetails() {
		return this.zctransdetails;
	}

	public void setZctransdetails(Set zctransdetails) {
		this.zctransdetails = zctransdetails;
	}

}