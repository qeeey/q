package com.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	private Set transbillsesForIndid = new HashSet(0);
	private Set transbillsesForOutdid = new HashSet(0);
	private Set purchases = new HashSet(0);
	private Set userinfos = new HashSet(0);
	private Set assetses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dept() {
	}

	/** full constructor */
	public Dept(String dname, Set transbillsesForIndid,
			Set transbillsesForOutdid, Set purchases, Set userinfos,
			Set assetses) {
		this.dname = dname;
		this.transbillsesForIndid = transbillsesForIndid;
		this.transbillsesForOutdid = transbillsesForOutdid;
		this.purchases = purchases;
		this.userinfos = userinfos;
		this.assetses = assetses;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set getTransbillsesForIndid() {
		return this.transbillsesForIndid;
	}

	public void setTransbillsesForIndid(Set transbillsesForIndid) {
		this.transbillsesForIndid = transbillsesForIndid;
	}

	public Set getTransbillsesForOutdid() {
		return this.transbillsesForOutdid;
	}

	public void setTransbillsesForOutdid(Set transbillsesForOutdid) {
		this.transbillsesForOutdid = transbillsesForOutdid;
	}

	public Set getPurchases() {
		return this.purchases;
	}

	public void setPurchases(Set purchases) {
		this.purchases = purchases;
	}

	public Set getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set userinfos) {
		this.userinfos = userinfos;
	}

	public Set getAssetses() {
		return this.assetses;
	}

	public void setAssetses(Set assetses) {
		this.assetses = assetses;
	}

}