package com.vo;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Assets entity. @author MyEclipse Persistence Tools
 */

public class Assets implements java.io.Serializable {

	// Fields

	private Integer cardid;
	private Assetclass assetclassByPacid;
	private Userinfo userinfoByUseuid;
	private Userinfo userinfoByCwuid;
	private Assetclass assetclassByAcid;
	private Userinfo userinfoByUid;
	private Dept dept;
	private Purchasedetail purchasedetail;
	private String cardno;
	private Integer astate;
	private Integer cwstate;
	private String ggxh;
	private Integer ustate;
	private String sbmc;
	private Integer cgdid;
	private Timestamp intodate;
	private String cwbm;
	private String zcbm;
	private String zzs;
	private String gys;
	private Date insertdate;
	private String unit;
	private Integer amount;
	private String remark;
	private Float price;
	private Integer lableisprint;
	private String onepath;
	private String twopath;
	private String bracode;
	private Set zclyghs = new HashSet(0);
	private Set repairses = new HashSet(0);
	private Set checkdetails = new HashSet(0);
	private Set baofeis = new HashSet(0);
	private Set zctransdetails = new HashSet(0);
	private Set transbillses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Assets() {
	}

	/** full constructor */
	public Assets(Assetclass assetclassByPacid, Userinfo userinfoByUseuid,
			Userinfo userinfoByCwuid, Assetclass assetclassByAcid,
			Userinfo userinfoByUid, Dept dept, Purchasedetail purchasedetail,
			String cardno, Integer astate, Integer cwstate, String ggxh,
			Integer ustate, String sbmc, Integer cgdid, Timestamp intodate,
			String cwbm, String zcbm, String zzs, String gys, Date insertdate,
			String unit, Integer amount, String remark, Float price,
			Integer lableisprint, String onepath, String twopath,
			String bracode, Set zclyghs, Set repairses, Set checkdetails,
			Set baofeis, Set zctransdetails, Set transbillses) {
		this.assetclassByPacid = assetclassByPacid;
		this.userinfoByUseuid = userinfoByUseuid;
		this.userinfoByCwuid = userinfoByCwuid;
		this.assetclassByAcid = assetclassByAcid;
		this.userinfoByUid = userinfoByUid;
		this.dept = dept;
		this.purchasedetail = purchasedetail;
		this.cardno = cardno;
		this.astate = astate;
		this.cwstate = cwstate;
		this.ggxh = ggxh;
		this.ustate = ustate;
		this.sbmc = sbmc;
		this.cgdid = cgdid;
		this.intodate = intodate;
		this.cwbm = cwbm;
		this.zcbm = zcbm;
		this.zzs = zzs;
		this.gys = gys;
		this.insertdate = insertdate;
		this.unit = unit;
		this.amount = amount;
		this.remark = remark;
		this.price = price;
		this.lableisprint = lableisprint;
		this.onepath = onepath;
		this.twopath = twopath;
		this.bracode = bracode;
		this.zclyghs = zclyghs;
		this.repairses = repairses;
		this.checkdetails = checkdetails;
		this.baofeis = baofeis;
		this.zctransdetails = zctransdetails;
		this.transbillses = transbillses;
	}

	// Property accessors

	public Integer getCardid() {
		return this.cardid;
	}

	public void setCardid(Integer cardid) {
		this.cardid = cardid;
	}

	public Assetclass getAssetclassByPacid() {
		return this.assetclassByPacid;
	}

	public void setAssetclassByPacid(Assetclass assetclassByPacid) {
		this.assetclassByPacid = assetclassByPacid;
	}

	public Userinfo getUserinfoByUseuid() {
		return this.userinfoByUseuid;
	}

	public void setUserinfoByUseuid(Userinfo userinfoByUseuid) {
		this.userinfoByUseuid = userinfoByUseuid;
	}

	public Userinfo getUserinfoByCwuid() {
		return this.userinfoByCwuid;
	}

	public void setUserinfoByCwuid(Userinfo userinfoByCwuid) {
		this.userinfoByCwuid = userinfoByCwuid;
	}

	public Assetclass getAssetclassByAcid() {
		return this.assetclassByAcid;
	}

	public void setAssetclassByAcid(Assetclass assetclassByAcid) {
		this.assetclassByAcid = assetclassByAcid;
	}

	public Userinfo getUserinfoByUid() {
		return this.userinfoByUid;
	}

	public void setUserinfoByUid(Userinfo userinfoByUid) {
		this.userinfoByUid = userinfoByUid;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Purchasedetail getPurchasedetail() {
		return this.purchasedetail;
	}

	public void setPurchasedetail(Purchasedetail purchasedetail) {
		this.purchasedetail = purchasedetail;
	}

	public String getCardno() {
		return this.cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public Integer getAstate() {
		return this.astate;
	}

	public void setAstate(Integer astate) {
		this.astate = astate;
	}

	public Integer getCwstate() {
		return this.cwstate;
	}

	public void setCwstate(Integer cwstate) {
		this.cwstate = cwstate;
	}

	public String getGgxh() {
		return this.ggxh;
	}

	public void setGgxh(String ggxh) {
		this.ggxh = ggxh;
	}

	public Integer getUstate() {
		return this.ustate;
	}

	public void setUstate(Integer ustate) {
		this.ustate = ustate;
	}

	public String getSbmc() {
		return this.sbmc;
	}

	public void setSbmc(String sbmc) {
		this.sbmc = sbmc;
	}

	public Integer getCgdid() {
		return this.cgdid;
	}

	public void setCgdid(Integer cgdid) {
		this.cgdid = cgdid;
	}

	public Timestamp getIntodate() {
		return this.intodate;
	}

	public void setIntodate(Timestamp intodate) {
		this.intodate = intodate;
	}

	public String getCwbm() {
		return this.cwbm;
	}

	public void setCwbm(String cwbm) {
		this.cwbm = cwbm;
	}

	public String getZcbm() {
		return this.zcbm;
	}

	public void setZcbm(String zcbm) {
		this.zcbm = zcbm;
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

	public Date getInsertdate() {
		return this.insertdate;
	}

	public void setInsertdate(Date insertdate) {
		this.insertdate = insertdate;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getLableisprint() {
		return this.lableisprint;
	}

	public void setLableisprint(Integer lableisprint) {
		this.lableisprint = lableisprint;
	}

	public String getOnepath() {
		return this.onepath;
	}

	public void setOnepath(String onepath) {
		this.onepath = onepath;
	}

	public String getTwopath() {
		return this.twopath;
	}

	public void setTwopath(String twopath) {
		this.twopath = twopath;
	}

	public String getBracode() {
		return this.bracode;
	}

	public void setBracode(String bracode) {
		this.bracode = bracode;
	}

	public Set getZclyghs() {
		return this.zclyghs;
	}

	public void setZclyghs(Set zclyghs) {
		this.zclyghs = zclyghs;
	}

	public Set getRepairses() {
		return this.repairses;
	}

	public void setRepairses(Set repairses) {
		this.repairses = repairses;
	}

	public Set getCheckdetails() {
		return this.checkdetails;
	}

	public void setCheckdetails(Set checkdetails) {
		this.checkdetails = checkdetails;
	}

	public Set getBaofeis() {
		return this.baofeis;
	}

	public void setBaofeis(Set baofeis) {
		this.baofeis = baofeis;
	}

	public Set getZctransdetails() {
		return this.zctransdetails;
	}

	public void setZctransdetails(Set zctransdetails) {
		this.zctransdetails = zctransdetails;
	}

	public Set getTransbillses() {
		return this.transbillses;
	}

	public void setTransbillses(Set transbillses) {
		this.transbillses = transbillses;
	}

}