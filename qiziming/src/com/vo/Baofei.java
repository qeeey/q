package com.vo;

import java.util.Date;

/**
 * Baofei entity. @author MyEclipse Persistence Tools
 */

public class Baofei implements java.io.Serializable {

	// Fields

	private Integer bfid;
	private Userinfo userinfoByCheckuid;
	private Assets assets;
	private Userinfo userinfoByUid;
	private Date savedate;
	private Date checkdate;
	private Integer bfstate;

	// Constructors

	/** default constructor */
	public Baofei() {
	}

	/** full constructor */
	public Baofei(Userinfo userinfoByCheckuid, Assets assets,
			Userinfo userinfoByUid, Date savedate, Date checkdate,
			Integer bfstate) {
		this.userinfoByCheckuid = userinfoByCheckuid;
		this.assets = assets;
		this.userinfoByUid = userinfoByUid;
		this.savedate = savedate;
		this.checkdate = checkdate;
		this.bfstate = bfstate;
	}

	// Property accessors

	public Integer getBfid() {
		return this.bfid;
	}

	public void setBfid(Integer bfid) {
		this.bfid = bfid;
	}

	public Userinfo getUserinfoByCheckuid() {
		return this.userinfoByCheckuid;
	}

	public void setUserinfoByCheckuid(Userinfo userinfoByCheckuid) {
		this.userinfoByCheckuid = userinfoByCheckuid;
	}

	public Assets getAssets() {
		return this.assets;
	}

	public void setAssets(Assets assets) {
		this.assets = assets;
	}

	public Userinfo getUserinfoByUid() {
		return this.userinfoByUid;
	}

	public void setUserinfoByUid(Userinfo userinfoByUid) {
		this.userinfoByUid = userinfoByUid;
	}

	public Date getSavedate() {
		return this.savedate;
	}

	public void setSavedate(Date savedate) {
		this.savedate = savedate;
	}

	public Date getCheckdate() {
		return this.checkdate;
	}

	public void setCheckdate(Date checkdate) {
		this.checkdate = checkdate;
	}

	public Integer getBfstate() {
		return this.bfstate;
	}

	public void setBfstate(Integer bfstate) {
		this.bfstate = bfstate;
	}

}