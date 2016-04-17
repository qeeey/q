package com.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer uid;  //主键
	private Paraminfo paraminfo;//
	private Dept dept;
	private String username;//用户名
	private String pwd;
	private Integer ustate;
	private Integer sex;

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** full constructor */
	public Userinfo(Paraminfo paraminfo, Dept dept, String username,
			String pwd, Integer ustate, Integer sex, Set zclyghsForLyuid,
			Set assetsesForCwuid, Set assetsesForUseuid, Set assetsesForUid,
			Set zctransesForYjuid, Set checkeds, Set purchasedetails,
			Set baofeisForCheckuid, Set zclyghsForGhuid, Set zctransdetails,
			Set purchases, Set repairses, Set transbillsesForInuid,
			Set baofeisForUid, Set transbillsesForOutuid, Set zctransesForUid) {
		this.paraminfo = paraminfo;
		this.dept = dept;
		this.username = username;
		this.pwd = pwd;
		this.ustate = ustate;
		this.sex = sex;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Paraminfo getParaminfo() {
		return this.paraminfo;
	}

	public void setParaminfo(Paraminfo paraminfo) {
		this.paraminfo = paraminfo;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getUstate() {
		return this.ustate;
	}

	public void setUstate(Integer ustate) {
		this.ustate = ustate;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}


}