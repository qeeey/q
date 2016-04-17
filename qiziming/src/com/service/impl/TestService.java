package com.service.impl;

import java.util.List;

import com.dao.ITestDao;
import com.service.ITestService;
import com.tools.IPage;
import com.vo.Userinfo;

public class TestService implements ITestService {

	private ITestDao testDao;
	
	public String login() {
		Userinfo ui=new Userinfo();
		ui.setUsername("abc");
		ui.setSex(1);
		testDao.create(ui);
		return "login ok....";
	}
	
	public void findUserinfo(){
		List<Userinfo> list=testDao.findUserinfo();
		for(Userinfo u:list){
			System.out.println(u.getUsername());
		}
	}
	
	
	public List<Userinfo> findAll(IPage pageInfo){
		List<Userinfo> list=testDao.findAllUserInfo(pageInfo);
		return list;
	}
	

	public ITestDao getTestDao() {
		return testDao;
	}

	public void setTestDao(ITestDao testDao) {
		this.testDao = testDao;
	}
	
	

}
