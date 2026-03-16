package com.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.example.model.User;
import com.example.util.HBUtil;


public class UserDAO {

	public void saveUser(User user) {
		Session session = HBUtil.getSessionFactory().openSession();
		Transaction tr = session.getTransaction();
		
		session.persist(user);
		
		tr.commit();
		session.close();
	}
	
	public User loginUser(String email, String password) {
		Session session = HBUtil.getSessionFactory().openSession();		
		
		Query<User> query = session.createQuery(
                "FROM User WHERE email=:email AND password=:password", User.class);

        query.setParameter("email", email);
        query.setParameter("password", password);

        User user = query.uniqueResult();

        session.close();
        
        return user;
	}
}
