package com.vo;

import java.util.Date;

/**
 * Zclygh entity. @author MyEclipse Persistence Tools
 */

public class Zclygh implements java.io.Serializable {

	// Fields

	private Integer lyghid;
	private Userinfo userinfoByLyuid;
	private Assets assets;
	private Userinfo userinfoByGhuid;
	private Date lydate;
	private Date ghdate;
	private Integer state;

	// Constructors

	/** default constructor */
	public Zclygh() {
	}

	/** full constructor */
	public Zclygh(Userinfo userinfoByLyuid, Assets assets,
			Userinfo userinfoByGhuid, Date lydate, Date ghdate, Integer state) {
		this.userinfoByLyuid = userinfoByLyuid;
		this.assets = assets;
		this.userinfoByGhuid = userinfoByGhuid;
		this.lydate = lydate;
		this.ghdate = ghdate;
		this.state = state;
	}

	// Property accessors

	public Integer getLyghid() {
		return this.lyghid;
	}

	public void setLyghid(Integer lyghid) {
		this.lyghid = lyghid;
	}

	public Userinfo getUserinfoByLyuid() {
		return this.userinfoByLyuid;
	}

	public void setUserinfoByLyuid(Userinfo userinfoByLyuid) {
		this.userinfoByLyuid = userinfoByLyuid;
	}

	public Assets getAssets() {
		return this.assets;
	}

	public void setAssets(Assets assets) {
		this.assets = assets;
	}

	public Userinfo getUserinfoByGhuid() {
		return this.userinfoByGhuid;
	}

	public void setUserinfoByGhuid(Userinfo userinfoByGhuid) {
		this.userinfoByGhuid = userinfoByGhuid;
	}

	public Date getLydate() {
		return this.lydate;
	}

	public void setLydate(Date lydate) {
		this.lydate = lydate;
	}

	public Date getGhdate() {
		return this.ghdate;
	}

	public void setGhdate(Date ghdate) {
		this.ghdate = ghdate;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}