package com.vo;

import java.util.Date;

/**
 * Checkdetail entity. @author MyEclipse Persistence Tools
 */

public class Checkdetail implements java.io.Serializable {

	// Fields

	private Integer cdid;
	private Checked checked;
	private Assets assets;
	private Integer state;
	private Date cdate;

	// Constructors

	/** default constructor */
	public Checkdetail() {
	}

	/** full constructor */
	public Checkdetail(Checked checked, Assets assets, Integer state, Date cdate) {
		this.checked = checked;
		this.assets = assets;
		this.state = state;
		this.cdate = cdate;
	}

	// Property accessors

	public Integer getCdid() {
		return this.cdid;
	}

	public void setCdid(Integer cdid) {
		this.cdid = cdid;
	}

	public Checked getChecked() {
		return this.checked;
	}

	public void setChecked(Checked checked) {
		this.checked = checked;
	}

	public Assets getAssets() {
		return this.assets;
	}

	public void setAssets(Assets assets) {
		this.assets = assets;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Date getCdate() {
		return this.cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

}