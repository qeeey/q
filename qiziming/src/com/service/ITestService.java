package com.service;

import java.util.List;

import com.tools.IPage;
import com.vo.Userinfo;


public interface ITestService {

	/**
	 * 用户登录
	 * @param zl
	 * @return
	 */	
	public String login();
	
	
	public void findUserinfo();
	
	public List<Userinfo> findAll(IPage pageInfo);
}
