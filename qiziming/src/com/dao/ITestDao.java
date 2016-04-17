package com.dao;

import java.util.List;

import com.tools.IPage;
import com.vo.Userinfo;

public interface ITestDao {

	/**
	 * 插入一条新记录
	 * @param obj
	 * @throws Exception 
	 */
	public void create(Userinfo ui); 
	
	/**
	 * 查询
	 * @return
	 */
	public List<Userinfo> findUserinfo();
	
	public List<Userinfo> findAllUserInfo(IPage pageInfo);
}
