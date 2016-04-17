package com.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;



import com.dao.ITestDao;
import com.tools.Execute;
import com.tools.IExecute;
import com.tools.IPage;
import com.vo.Userinfo;

public class TestDao extends HibernateDaoSupport implements ITestDao {

	public void create(Userinfo ui) {
		super.getHibernateTemplate().save(ui);
	}

	@SuppressWarnings("unchecked")
	public List<Userinfo> findUserinfo() {
		return (List<Userinfo>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<Userinfo> list = new ArrayList<Userinfo>();
						try {
							Criteria criteria = session.createCriteria(Userinfo.class);
//							criteria.add(Restrictions.eq(duralName, name));
							list = (List<Userinfo>) criteria.list();
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
					}
				});
	}

	@SuppressWarnings("unchecked")
	public List<Userinfo> findAllUserInfo(final IPage pageInfo) {
		return (List<Userinfo>) super.getHibernateTemplate().execute(
				new HibernateCallback() {

					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						
						
						IPage pages = null;
						List<Userinfo> list = new ArrayList<Userinfo>();
						try {
							Criteria criteria = session.createCriteria(Userinfo.class);
							IExecute exc = new Execute(pageInfo);
							pages=exc.excute(criteria);
							if(pages !=null){
								list=pages.getResult();
							}
						} catch (Exception e) {
							e.printStackTrace();
						}

						return list;
						
						
						
				
						
						
					}
				});
	}

}
