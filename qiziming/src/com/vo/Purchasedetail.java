package com.vo;

import java.util.HashSet;
import java.util.Set;

/**
 * Purchasedetail entity. @author MyEclipse Persistence Tools
 */

public class Purchasedetail implements java.io.Serializable {

	// Fields

	private Integer pdid;
	private Assetclass assetclassByPacid;
	private Assetclass assetclassByAcid;
	private Purchase purchase;
	private Userinfo userinfo;
	private String dw;
	private String zcxh;
	private String zcmc;
	private Integer sl;
	private String remark;
	private String zzs;
	private String gys;
	private Float price;
	private Set assetses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Purchasedetail() {
	}

	/** full constructor */
	public Purchasedetail(Assetclass assetclassByPacid,
			Assetclass assetclassByAcid, Purchase purchase, Userinfo userinfo,
			String dw, String zcxh, String zcmc, Integer sl, String remark,
			String zzs, String gys, Float price, Set assetses) {
		this.assetclassByPacid = assetclassByPacid;
		this.assetclassByAcid = assetclassByAcid;
		this.purchase = purchase;
		this.userinfo = userinfo;
		this.dw = dw;
		this.zcxh = zcxh;
		this.zcmc = zcmc;
		this.sl = sl;
		this.remark = remark;
		this.zzs = zzs;
		this.gys = gys;
		this.price = price;
		this.assetses = assetses;
	}

	// Property accessors

	public Integer getPdid() {
		return this.pdid;
	}

	public void setPdid(Integer pdid) {
		this.pdid = pdid;
	}

	public Assetclass getAssetclassByPacid() {
		return this.assetclassByPacid;
	}

	public void setAssetclassByPacid(Assetclass assetclassByPacid) {
		this.assetclassByPacid = assetclassByPacid;
	}

	public Assetclass getAssetclassByAcid() {
		return this.assetclassByAcid;
	}

	public void setAssetclassByAcid(Assetclass assetclassByAcid) {
		this.assetclassByAcid = assetclassByAcid;
	}

	public Purchase getPurchase() {
		return this.purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getDw() {
		return this.dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public String getZcxh() {
		return this.zcxh;
	}

	public void setZcxh(String zcxh) {
		this.zcxh = zcxh;
	}

	public String getZcmc() {
		return this.zcmc;
	}

	public void setZcmc(String zcmc) {
		this.zcmc = zcmc;
	}

	public Integer getSl() {
		return this.sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getZzs() {
		return this.zzs;
	}

	public void setZzs(String zzs) {
		this.zzs = zzs;
	}

	public String getGys() {
		return this.gys;
	}

	public void setGys(String gys) {
		this.gys = gys;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Set getAssetses() {
		return this.assetses;
	}

	public void setAssetses(Set assetses) {
		this.assetses = assetses;
	}

}