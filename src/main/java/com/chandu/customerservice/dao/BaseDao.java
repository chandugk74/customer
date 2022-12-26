package com.chandu.customerservice.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BaseDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		if (session == null || !session.isOpen())
			session = sessionFactory.openSession();
		return session;
	}


}
