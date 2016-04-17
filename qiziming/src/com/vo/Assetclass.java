package com.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Assetclass entity. @author MyEclipse Persistence Tools
 */

public class Assetclass implements java.io.Serializable {

	// Fields

	private Integer acid;
	private String acbm;
	private String acname;
	private Integer pid;
	private String pidname;
	private Set purchasedetailsForPacid = new HashSet(0);
	private Set assetsesForPacid = new HashSet(0);
	private Set assetsesForAcid = new HashSet(0);
	private Set purchasedetailsForAcid = new HashSet(0);

	// Constructors

	/** default constructor */
	public Assetclass() {
	}

	/** full constructor */
	public Assetclass(String acbm, String acname, Integer pid, String pidname,
			Set purchasedetailsForPacid, Set assetsesForPacid,
			Set assetsesForAcid, Set purchasedetailsForAcid) {
		this.acbm = acbm;
		this.acname = acname;
		this.pid = pid;
		this.pidname = pidname;
		this.purchasedetailsForPacid = purchasedetailsForPacid;
		this.assetsesForPacid = assetsesForPacid;
		this.assetsesForAcid = assetsesForAcid;
		this.purchasedetailsForAcid = purchasedetailsForAcid;
	}

	// Property accessors

	public Integer getAcid() {
		return this.acid;
	}

	public void setAcid(Integer acid) {
		this.acid = acid;
	}

	public String getAcbm() {
		return this.acbm;
	}

	public void setAcbm(String acbm) {
		this.acbm = acbm;
	}

	public String getAcname() {
		return this.acname;
	}

	public void setAcname(String acname) {
		this.acname = acname;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPidname() {
		return this.pidname;
	}

	public void setPidname(String pidname) {
		this.pidname = pidname;
	}

	public Set getPurchasedetailsForPacid() {
		return this.purchasedetailsForPacid;
	}

	public void setPurchasedetailsForPacid(Set purchasedetailsForPacid) {
		this.purchasedetailsForPacid = purchasedetailsForPacid;
	}

	public Set getAssetsesForPacid() {
		return this.assetsesForPacid;
	}

	public void setAssetsesForPacid(Set assetsesForPacid) {
		this.assetsesForPacid = assetsesForPacid;
	}

	public Set getAssetsesForAcid() {
		return this.assetsesForAcid;
	}

	public void setAssetsesForAcid(Set assetsesForAcid) {
		this.assetsesForAcid = assetsesForAcid;
	}

	public Set getPurchasedetailsForAcid() {
		return this.purchasedetailsForAcid;
	}

	public void setPurchasedetailsForAcid(Set purchasedetailsForAcid) {
		this.purchasedetailsForAcid = purchasedetailsForAcid;
	}

}