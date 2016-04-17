package com.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Paraminfo entity. @author MyEclipse Persistence Tools
 */

public class Paraminfo implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String pname;
	private String pvalue;
	private Integer sstypeid;
	private String sstypename;
	private Set userinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Paraminfo() {
	}

	/** full constructor */
	public Paraminfo(String pname, String pvalue, Integer sstypeid,
			String sstypename, Set userinfos) {
		this.pname = pname;
		this.pvalue = pvalue;
		this.sstypeid = sstypeid;
		this.sstypename = sstypename;
		this.userinfos = userinfos;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPvalue() {
		return this.pvalue;
	}

	public void setPvalue(String pvalue) {
		this.pvalue = pvalue;
	}

	public Integer getSstypeid() {
		return this.sstypeid;
	}

	public void setSstypeid(Integer sstypeid) {
		this.sstypeid = sstypeid;
	}

	public String getSstypename() {
		return this.sstypename;
	}

	public void setSstypename(String sstypename) {
		this.sstypename = sstypename;
	}

	public Set getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set userinfos) {
		this.userinfos = userinfos;
	}

}