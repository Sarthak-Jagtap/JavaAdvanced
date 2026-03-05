package com.example;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {

		User user = new User(1, "Sarthak", "sarthak@gmail.com", null);
		Profile profile = new Profile(101, "741852963", "Pune", null);

		user.setProfile(profile);
		profile.setUser(user);

		Session session = HBUtil.getSessionFactory().openSession();

		session.beginTransaction();

		session.persist(user);
		session.persist(profile);

		session.getTransaction().commit();
	}

}
