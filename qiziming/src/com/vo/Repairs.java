package com.vo;

/**
 * Repairs entity. @author MyEclipse Persistence Tools
 */

public class Repairs implements java.io.Serializable {

	// Fields

	private Integer rid;
	private Assets assets;
	private Userinfo userinfo;
	private String wxqk;
	private Float price;
	private Integer rstate;
	private Integer beforestate;

	// Constructors

	/** default constructor */
	public Repairs() {
	}

	/** full constructor */
	public Repairs(Assets assets, Userinfo userinfo, String wxqk, Float price,
			Integer rstate, Integer beforestate) {
		this.assets = assets;
		this.userinfo = userinfo;
		this.wxqk = wxqk;
		this.price = price;
		this.rstate = rstate;
		this.beforestate = beforestate;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
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

	public String getWxqk() {
		return this.wxqk;
	}

	public void setWxqk(String wxqk) {
		this.wxqk = wxqk;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getRstate() {
		return this.rstate;
	}

	public void setRstate(Integer rstate) {
		this.rstate = rstate;
	}

	public Integer getBeforestate() {
		return this.beforestate;
	}

	public void setBeforestate(Integer beforestate) {
		this.beforestate = beforestate;
	}

}